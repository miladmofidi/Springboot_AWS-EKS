package com.k8s.ecr.elastic_kuber_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElasticKuberDemoApplication {

	@GetMapping
	public ResponseEntity<String> message(String message) {
		return ResponseEntity.ok("Hello from application");
	}

	public static void main(String[] args) {
		SpringApplication.run(ElasticKuberDemoApplication.class, args);
	}

}
