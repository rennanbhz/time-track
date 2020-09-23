package com.personalproject.timetrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TimeTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeTrackApplication.class, args);
	}

}
