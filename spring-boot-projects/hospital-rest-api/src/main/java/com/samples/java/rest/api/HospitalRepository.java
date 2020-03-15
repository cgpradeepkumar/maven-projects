package com.samples.java.rest.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {

}
