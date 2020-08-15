package com.samples.java;

import java.util.Map;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsServiceImpl implements NewsService {

	@CircuitBreaker(name = "newsService", fallbackMethod = "logError")
	public News getTopStories() {
		System.out.println("method getTopStories");
		JSONObject jsonObject = new JSONObject();
		News topNews = new News();
		String getUrl = "http://api.nytimes.com/svc/topstories/v2/home.json?api-key=BrbUUgR6BFSmFrKQw5H8hCRnNXK9hDXZ";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<Map> news = restTemplate.exchange(getUrl, HttpMethod.GET, entity, Map.class);
//		 ResponseEntity<News[]> news = restTemplate.exchange(getUrl, HttpMethod.GET,
//		 entity, News[].class);

		// topNews = restTemplate.getForObject(getUrl, News.class);

		if (news.getStatusCode() == HttpStatus.OK) {
			System.out.println("============================================");
			jsonObject = new JSONObject(news.getBody());
			System.out.println(jsonObject);
			System.out.println("============================================");
		}
		topNews.setTitle("something");
		topNews.setSection("something");
		return topNews;
	}

	private void logError(Exception e) {
		System.out.println("logging error..........");
		e.printStackTrace();
	}
}
