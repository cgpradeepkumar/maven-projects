package com.sample.jira.integration.controller;

import com.sample.jira.integration.client.BasicJiraRestClient;
import com.sample.jira.integration.client.JrjcJiraRestClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jira/clients/")
public class JiraClientController {

    @Autowired
    BasicJiraRestClient basicJiraRestClient;

    @Autowired
    JrjcJiraRestClient jrjcJiraRestClient;

    @RequestMapping(value = "/basic")
    public @ResponseBody JSONObject getBasicClient() throws Exception {
        return basicJiraRestClient.getEntity();
    }

    @RequestMapping(value = "/jrjc")
    public JSONObject getJrjcClient() {
        return jrjcJiraRestClient.getEntity();
    }
}
