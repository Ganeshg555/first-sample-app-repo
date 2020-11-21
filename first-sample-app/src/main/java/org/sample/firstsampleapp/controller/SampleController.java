package org.sample.firstsampleapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping
	public ResponseEntity<Object> hello() {
		return ResponseEntity.ok("Welcome, This is My First Spring Boot Application!!!");
	}
	
}
