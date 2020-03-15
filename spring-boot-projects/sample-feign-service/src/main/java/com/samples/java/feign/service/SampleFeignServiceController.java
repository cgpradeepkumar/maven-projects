package com.samples.java.feign.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleFeignServiceController {

	@GetMapping("/name")
	public ResponseEntity<String> getName() {
		return new ResponseEntity<String>("Feign Service", HttpStatus.OK);
	}
}
