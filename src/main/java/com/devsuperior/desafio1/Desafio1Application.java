package com.devsuperior.desafio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	
	private OrdeService ordeServe;

	public Desafio1Application(OrdeService ordeServe) {
		this.ordeServe = ordeServe;
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.printf("Pedido código %d%n", order.getCode());
		System.out.printf("Valor total: %.2f", ordeServe.total(order));
	}

}
