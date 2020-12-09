package org.sample.firstsampleapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	//Fist API
	@GetMapping
	public ResponseEntity<Object> hello() {
		return ResponseEntity.ok("Welcome, This is My First Spring Boot Application!!!");
	}
	
	//Second API
	@GetMapping("/welcome")
	public ResponseEntity<Object> welcome() {
		return ResponseEntity.ok("Hello, welcome to this api");
	}
	
	@GetMapping(value = {"/bye", "/goodbye"})
	public ResponseEntity<Object> bye() {
		return ResponseEntity.ok("Good bye!!!");
	}
	
}
