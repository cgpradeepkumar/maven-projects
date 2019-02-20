package com.sample.jira.integration.client;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;

@Service
public class UnirestJiraClient {

    public void getIssue() {
        try {
            HttpResponse<JsonNode> response = Unirest.get("https://pradeepkumarcg.atlassian.net/rest/api/3/issue/SJD-1")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .header("Bearer", "sYsQCH2xCKBLFr5vtKxE7C1D")
                    .asJson();
            System.out.println(response.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

    public void getIssueWithBasicAuth() {
        try {
            HttpResponse<JsonNode> response = Unirest.get("https://pradeepkumarcg.atlassian.net/rest/api/3/issue/SJD-1")
                    .basicAuth("cgpradeepkumar@gmail.com", "password123")
                    .asJson();
            System.out.println(response.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
