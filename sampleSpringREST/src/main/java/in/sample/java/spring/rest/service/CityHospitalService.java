package in.sample.java.spring.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sample.java.spring.rest.data.Hospital;
import in.sample.java.spring.rest.data.HospitalRepository;

@Service
public class CityHospitalService implements HospitalService {

	@Autowired
	private HospitalRepository hospitalRepository;

	@Override
	public Hospital getHospital(int id) throws Exception {
		Optional<Hospital> hospitals = hospitalRepository.findById(id);
		return hospitals.get();
	}

	@Override
	public List<Hospital> getAllHospitals() throws Exception {
		List<Hospital> hospitals = new ArrayList<>();
		Iterable<Hospital> hospitalList = hospitalRepository.findAll();
		hospitalList.forEach(hospital -> {
			hospitals.add(hospital);
		});

		return hospitals;
	}

	@Override
	public Hospital addHospital(Hospital hospital) throws Exception {
		return hospitalRepository.save(hospital);
	}

	@Override
	public void updateHospital(Hospital hospital) throws Exception {
		hospitalRepository.save(hospital);
	}

	@Override
	public void deleteHospital(Hospital hospital) throws Exception {
		hospitalRepository.delete(hospital);
	}
}
