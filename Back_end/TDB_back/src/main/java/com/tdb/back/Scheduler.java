package com.tdb.back;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tdb.back.Indice.IndiceInvertido;
import com.tdb.back.analisis.Classifier;
import com.tdb.back.model.entities.KeyWord;
import com.tdb.back.model.entities.Score;
import com.tdb.back.model.entities.VideoGame;
import com.tdb.back.model.repository.VideoGameRepository;

@Component
public class Scheduler {
	
	@Autowired
	private Classifier classifier;
	
	@Autowired
	private VideoGameRepository videoGameRepository;
	
	
	private IndiceInvertido indice= new IndiceInvertido();
			
	@Scheduled(fixedRate = 18000000)
	@Transactional
	public void realizarAnalisis() {
		System.out.println("Iniciando analisis de sentimientos");
		this.generarAnalisis();
		System.out.println("Analisis de sentimiento finalizado");
	}
	
	
	public void generarAnalisis() {
		
		//List<VideoGame> videoGames=(List<VideoGame>) videoGameRepository.findAll();
		List<VideoGame> videoGames=new ArrayList<VideoGame>();
		VideoGame game=videoGameRepository.findById((long) 1).orElse(null);
		videoGames.add(game);
		
		for (VideoGame videoGame : videoGames) {
			
			String nombre=generarNombres(videoGame);
			List<String> tweets=generarTweets(nombre);
			int valoration=generarValorcion(tweets);
			
			Calendar cal= Calendar.getInstance();
			Date date=cal.getTime();
			Timestamp lastUpdate=new Timestamp(date.getTime());
			
			Score score=new Score();
			score.setValoration(valoration);
			score.setLastUpdate(lastUpdate);
			
			videoGame.getScores().add(score);
			videoGameRepository.save(videoGame);
			
		
		}
		
	}
	
	
	public String generarNombres(VideoGame videoGame){
			List<KeyWord> keyWords=videoGame.getKeyWords();
			String acumulador="";
			for (KeyWord keyWord : keyWords) {		
				acumulador=acumulador + " " + keyWord.getWord();
		}
		return acumulador;
	}
	
	
	public List<String> generarTweets(String nombre){
		
		List<String> tweets=this.indice.buscar(nombre);
		return tweets;
		
	}
	
	
	public int generarValorcion(List<String> tweets) {
		HashMap<String, Double> valoraciones;
		int score=0;
		
		for (String tweet : tweets) {
			valoraciones=classifier.classify(tweet);
			if(valoraciones.get("positive") > valoraciones.get("negative")) {
				score=score+1;
			}
		}
		return score;
		
	}					

}
