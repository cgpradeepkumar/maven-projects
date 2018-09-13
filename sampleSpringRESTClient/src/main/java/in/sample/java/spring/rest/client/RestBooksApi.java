package in.sample.java.spring.rest.client;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootApplication
public class RestBooksApi {

	static RestTemplate restTemplate;

	public RestBooksApi() {
		restTemplate = new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RestBooksApi.class, args);
	}

	public static JSONObject getEntity() throws Exception {
		JSONObject books = new JSONObject();
		String getUrl = "https://www.googleapis.com/books/v1/volumes?q=isbn:0747532699";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<Map> bookList = restTemplate.exchange(getUrl, HttpMethod.GET, entity, Map.class);

		if (bookList.getStatusCode() == HttpStatus.OK) {
			books = new JSONObject(bookList.getBody());
		}

		return books;
	}
}
