package com.samples.java.jira.integration.client;

import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class BasicJiraRestClient {

    public JSONObject getEntity() throws Exception {
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
