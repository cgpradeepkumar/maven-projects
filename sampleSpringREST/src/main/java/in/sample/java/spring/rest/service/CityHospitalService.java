package in.sample.java.spring.rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.sample.java.spring.rest.data.Hospital;

@Service
public class CityHospitalService implements HospitalService {

	private List<Hospital> hospitalList = new ArrayList<>(Arrays.asList(

			new Hospital(1001, "Apollo Hospital", "Chennai", 3.8),

			new Hospital(1002, "Global Hospital", "Chennai", 3.5),

			new Hospital(1003, "VCare Hospital", "Bangalore", 3)));

	@Override
	public Hospital getHospital(int id) throws Exception {
		return hospitalList.stream().filter(c -> (c.getId() == id)).findFirst().get();
	}

	@Override
	public List<Hospital> getAllHospitals() throws Exception {
		return hospitalList;
	}

}
