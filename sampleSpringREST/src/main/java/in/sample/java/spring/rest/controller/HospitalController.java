package in.sample.java.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.sample.java.spring.rest.data.Hospital;
import in.sample.java.spring.rest.service.HospitalService;

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
}
