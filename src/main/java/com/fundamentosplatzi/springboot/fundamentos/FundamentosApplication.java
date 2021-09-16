package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	// Inyección de la dependencia creada (la interfaz)
	// 1. Se llama al objeto ComponentDependency con un sobrenombre
	private ComponentDependency componentDependency;

	// @autowired | No es necesario en versiones modernas
	// Constructor de la clase que debe recibir la dependencia
	// Con @Qualifier decidimos qué clase implementaremos
	public FundamentosApplication(@Qualifier("componentOneImpl") ComponentDependency componentDependency){
		// el objeto componentDependency es igual al que se pasa como parámetro
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Con este método ejecutamos lo que deseamos
		componentDependency.saludar();
	}
}
