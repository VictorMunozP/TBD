package com.tdb.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tdb.back.analisis.Classifier;
import com.tdb.back.model.repository.VideoGameRepository;

@Component
public class Scheduler {
	
	@Autowired
	private Classifier classifier;
	
	@Autowired
	private VideoGameRepository videoGameRepository;
	
	
	@Scheduled(fixedRate = 5000)
	public void realizarAnalisis() {
		
	 System.out.println("Aqui se llama al metodo que hace el analisis");
	}
	
	
	/* En proceso*/
	
	
					
	

}
