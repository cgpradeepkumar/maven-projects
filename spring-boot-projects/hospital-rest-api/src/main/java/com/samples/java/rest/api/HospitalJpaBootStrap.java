package com.samples.java.rest.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class HospitalJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private HospitalRepository hospitalRepository;

	private List<Hospital> hospitalList = new ArrayList<>(Arrays.asList(

			new Hospital(1001, "Apollo Hospital", "Chennai", 3.8),

			new Hospital(1002, "Global Hospital", "Chennai", 3.5),

			new Hospital(1003, "VCare Hospital", "Bangalore", 3)));

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initialize();
	}

	private void initialize() {
		hospitalRepository.saveAll(hospitalList);
	}
}
