package com.javadevjournal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javadevjournal.service.HelloService;

@SpringBootApplication
public class CustomStarterAppApplication implements CommandLineRunner {

	@Autowired
    HelloService service;

    public static void main(String[] args) {

		SpringApplication.run(CustomStarterAppApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        service.hello();
    }
}