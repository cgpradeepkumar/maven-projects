package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepository hospitalRepository;

	public List<Hospital> getAllHospitals() {
		return null;
	}

	public Hospital getHospital(int id) {
		return hospitalRepository.findOne(id);
	}

	public void addHospital(Hospital hospital) {
		hospitalRepository.save(hospital);
	}

	public void updateHospital(Hospital hospital) {
		hospitalRepository.save(hospital);
	}

	public void deleteHospital(Hospital hospital) {
		hospitalRepository.delete(hospital);
	}
}
