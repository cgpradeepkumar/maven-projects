package com.samples.java.jira.integration.client;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.BasicProject;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class JrjcJiraRestClient {

    private String url = "https://pradeepkumarcg.atlassian.net/";
    private String username = "cgpradeepkumar@gmail.com";
    private String password = "password123";
    private String apiToken = "sYsQCH2xCKBLFr5vtKxE7C1D";

    public String getIssue(String issueId) {
        String result = "";
        URI uri = URI.create(this.url);
        JiraRestClient jiraRestClient = new AsynchronousJiraRestClientFactory().createWithBasicHttpAuthentication(uri, username, password);

        Promise<Issue> promise = jiraRestClient.getIssueClient().getIssue(issueId);
        try {
            Issue issue = promise.claim();
            result = issue.getSummary();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public void getProjects() {
        URI uri = URI.create(this.url);
        JiraRestClient jiraRestClient = new AsynchronousJiraRestClientFactory().createWithBasicHttpAuthentication(uri, username, password);
        Promise<Iterable<BasicProject>> promise = jiraRestClient.getProjectClient().getAllProjects();

        Iterable<BasicProject> iterable = promise.claim();
        iterable.forEach(basicProject -> {
            System.out.println(basicProject.getName());
        });
    }
}
