package in.sample.java.bpm.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * cgpradeepkumar
 * 21-02-2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleActivitiWithSpringApplication.class)
public class SampleActivitiTest {

    private static final Logger LOGGER = Logger.getLogger(SampleActivitiTest.class);

    @Test
    public void givenXMLConfig_whenGetDefault_thenGotProcessEngine() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        Assert.assertNotNull(processEngine);
        Assert.assertNotNull(processEngine.getName());
    }

    @Test
    public void givenBPMN_whenDeployProcess_thenDeployed() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment().addClasspathResource("VacationRequest.bpmn20.xml").deploy();
        LOGGER.info("Number of process definitions: " + repositoryService.createProcessDefinitionQuery().count());
    }
}
