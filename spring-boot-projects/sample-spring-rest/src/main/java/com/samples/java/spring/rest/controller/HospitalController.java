package com.samples.java.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.samples.java.spring.rest.data.Hospital;
import com.samples.java.spring.rest.service.HospitalService;

@RestController
@RequestMapping("/test/")
public class HospitalController {

	@Autowired
	private HospitalService cityHospitalService;

	@RequestMapping(value = "/hospital/{id}", method = RequestMethod.GET)
	public @ResponseBody Hospital getHospital(@PathVariable("id") int id) throws Exception {

		Hospital hospital = cityHospitalService.getHospital(id);

		return hospital;
	}

	@RequestMapping(value = "/hospitals", method = RequestMethod.GET)
	public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
		return this.cityHospitalService.getAllHospitals();
	}

	public ResponseEntity<String> addHospital(@RequestBody Hospital hospital) throws Exception {

		hospital = cityHospitalService.addHospital(hospital);
		return null;
	}

	public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {

		return null;
	}

	public ResponseEntity<String> deleteHospital(@RequestBody Hospital hospital) {

		return null;
	}
}
