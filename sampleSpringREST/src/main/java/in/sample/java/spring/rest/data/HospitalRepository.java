package in.sample.java.spring.rest.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {

}
