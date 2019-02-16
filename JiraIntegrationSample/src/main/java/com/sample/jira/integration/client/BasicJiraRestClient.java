package com.sample.jira.integration.client;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootApplication
public class BasicJiraRestClient {
    public static void main(String[] args) {
        SpringApplication.run(BasicJiraRestClient.class, args);
        try {
            System.out.println(getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getEntity() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        JSONObject issuesObject = new JSONObject();
        String getUrl = "https://pradeepkumarcg.atlassian.net/rest/api/3/issue/SAM-1";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map> issues = restTemplate.exchange(getUrl, HttpMethod.GET, entity, Map.class);

        if (issues.getStatusCode() == HttpStatus.OK) {
            issuesObject = new JSONObject(issues.getBody());
        }

        return issuesObject;
    }
}
