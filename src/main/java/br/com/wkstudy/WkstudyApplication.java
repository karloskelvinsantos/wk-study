package br.com.wkstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"com.jkw.interfaces.entidades.comuns", "com.jkw.entidades.dados.pessoais"} )
public class WkstudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WkstudyApplication.class, args);
	}

}
