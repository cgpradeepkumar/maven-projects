package in.sample.java.bpm.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
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

    @Test
    public void givenXMLConfig_whenGetDefault_thenGotProcessEngine() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        Assert.assertNotNull(processEngine);
    }
}
