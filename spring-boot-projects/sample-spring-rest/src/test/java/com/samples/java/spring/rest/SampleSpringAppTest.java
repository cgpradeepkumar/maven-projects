package com.samples.java.spring.rest;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.samples.java.spring.rest.app.SampleSpringApp;
import com.samples.java.spring.rest.data.Hospital;
import com.samples.java.spring.rest.data.HospitalRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleSpringApp.class)
@DataJpaTest
public class SampleSpringAppTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private HospitalRepository hospitalRepository;

	@Before
	public void setUp() {

	}

	@Test
	public void test() {
		entityManager.persist(new Hospital(1007, "Vcare Hospital", "Mumbai", 3.1));
		Optional<Hospital> hospitals = hospitalRepository.findById(1007);

		assertEquals("Vcare Hospital", hospitals.get().getName());
	}

	@After
	public void tearDown() {

	}
}
