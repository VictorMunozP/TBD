package com.tdb.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tdb.back.Indice.IndiceInvertido;

@SpringBootApplication
public class TdbBackApplication {

	public static void main(String[] args) {
		//IndiceInvertido indice= new IndiceInvertido();
		
		//indice.crear();
		
		//indice.buscar("god of war");
		SpringApplication.run(TdbBackApplication.class, args);
		
	}
}
