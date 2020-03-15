package in.sample.java.feign.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleFeignServiceClientTest {

	@Autowired
	SampleFeignServiceClient sampleFeignServiceClient;

	@Test
	public void testGetName() {
		ResponseEntity<String> name = sampleFeignServiceClient.getName();
		assertNotNull(name.getBody());
	}
}
