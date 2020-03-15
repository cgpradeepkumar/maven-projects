package com.samples.java.jira.integration.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.samples.java.jira.integration.client.BasicJiraRestClient;
import com.samples.java.jira.integration.client.JrjcJiraRestClient;
import com.samples.java.jira.integration.client.UnirestJiraClient;

@RestController
@RequestMapping("/jira/clients/")
public class JiraClientController {

    @Autowired
    BasicJiraRestClient basicJiraRestClient;

    @Autowired
    JrjcJiraRestClient jrjcJiraRestClient;

    @Autowired
    UnirestJiraClient unirestJiraClient;

    @RequestMapping(value = "/basic")
    public @ResponseBody JSONObject getBasicClient() throws Exception {
        return basicJiraRestClient.getEntity();
    }

    @ResponseBody
    @RequestMapping(value = "/jrjc/issue/{issueId}")
    public String getIssue(@PathVariable("issueId") String issueId) {
        return jrjcJiraRestClient.getIssue(issueId);
    }

    @RequestMapping(value = "/jrjc/projects")
    public void getProjects() {
        jrjcJiraRestClient.getProjects();
    }

    @RequestMapping(value = "/unirest/issue")
    public void getIssueByUnirest() {
        unirestJiraClient.getIssue();
    }
}
