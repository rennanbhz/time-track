package com.personalproject.timetrack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TimeTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeTrackApplication.class, args);
	}

	@Value("${pagination.quantity}")
	private int quantityPerPages;

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Quantity of elements per page = " + this.quantityPerPages);
		};
	}
}
