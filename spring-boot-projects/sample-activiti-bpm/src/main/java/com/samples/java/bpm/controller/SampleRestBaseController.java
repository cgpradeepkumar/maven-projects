package com.samples.java.bpm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRestBaseController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleRestBaseController.class);

	@GetMapping("/init")
	public void initialize() {
		LOGGER.info("Enter init.");
		LOGGER.info("Exit init.");
	}
}
