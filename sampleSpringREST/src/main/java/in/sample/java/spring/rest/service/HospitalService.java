package in.sample.java.spring.rest.service;

import java.util.List;

import in.sample.java.spring.rest.data.Hospital;

public interface HospitalService {

	public Hospital getHospital(int id) throws Exception;

	public List<Hospital> getAllHospitals() throws Exception;

	public Hospital addHospital(Hospital hospital) throws Exception;

	public void updateHospital(Hospital hospital) throws Exception;

	public void deleteHospital(Hospital hospital) throws Exception;
}
