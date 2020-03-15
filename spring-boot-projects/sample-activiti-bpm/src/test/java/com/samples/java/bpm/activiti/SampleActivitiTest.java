package com.samples.java.bpm.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.samples.java.bpm.activiti.SampleActivitiWithSpringApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * cgpradeepkumar
 * 21-02-2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleActivitiWithSpringApplication.class)
public class SampleActivitiTest {

    private static final Logger LOGGER = Logger.getLogger(SampleActivitiTest.class);

    @Before
    public void givenXMLConfig_whenGetDefault_thenGotProcessEngine() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        Assert.assertNotNull(processEngine);
        Assert.assertNotNull(processEngine.getName());
    }

    @Before
    public void givenBPMN_whenDeployProcess_thenDeployed() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment().addClasspathResource("VacationRequest.bpmn20.xml").deploy();
        LOGGER.info("Number of process definitions: " + repositoryService.createProcessDefinitionQuery().count());
    }

    @Test
    public void givenDeployedProcess_whenStartProcessInstance_thenRunning() {
        Map<String, Object> variables = new HashMap<>();
        variables.put("employeeName", "Pradeep");
        variables.put("numberOfDays", 5);
        variables.put("startDate", "15-03-2019");

        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("vacationRequest", variables);
        runtimeService.createProcessInstanceQuery().count();
        Assert.assertEquals(1, runtimeService.createProcessInstanceQuery().count());
    }
}
