package in.sample.java;

import java.util.Map;

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
public class NewsService {

	public News getTopStories() {
		JSONObject jsonObject = new JSONObject();
		News topNews = new News();
		String getUrl = "http://api.nytimes.com/svc/topstories/v2/home.json?api-key=9aa8af8bf07443fa88b8e68785b2b3cd";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<Map> news = restTemplate.exchange(getUrl, HttpMethod.GET, entity, Map.class);
		// ResponseEntity<News> news = restTemplate.exchange(getUrl, HttpMethod.GET,
		// entity, News.class);

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
}
