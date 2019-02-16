package com.sample.jira.integration.client;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.User;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.concurrent.ExecutionException;

@Service
public class JrjcJiraRestClient {

    private String url = "https://pradeepkumarcg.atlassian.net/";
    private String username = "cgpradeepkumar@gmail.com";
    private String password = "password123";

    public JSONObject getEntity() {
        URI uri = URI.create(this.url);
        JiraRestClient jiraRestClient = new AsynchronousJiraRestClientFactory().createWithBasicHttpAuthentication(uri, username, password);
        /*Promise<User> promise = jiraRestClient.getUserClient().getUser("admin");
        try {
            User user = promise.claim();
            System.out.println(user.getEmailAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        Promise<Issue> promise = jiraRestClient.getIssueClient().getIssue("SAM-1");
        try {
            Issue issue = promise.claim();
            System.out.println(issue.getSummary());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
