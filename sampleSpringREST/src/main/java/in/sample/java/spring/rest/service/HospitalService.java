package in.sample.java.spring.rest.service;

import java.util.List;

import in.sample.java.spring.rest.data.Hospital;

public interface HospitalService {

	public Hospital getHospital(int id) throws Exception;

	public List<Hospital> getAllHospitals() throws Exception;
}
