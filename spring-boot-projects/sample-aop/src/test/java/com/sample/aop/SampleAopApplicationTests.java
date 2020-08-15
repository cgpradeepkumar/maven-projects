package com.sample.aop;

import com.sample.aop.bo.BusinessOne;
import com.sample.aop.bo.BusinessTwo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleAopApplicationTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private BusinessOne businessOne;

	@Autowired
	private BusinessTwo businessTwo;

	@Test
	public void test() {
		logger.info(businessOne.calculateSomething());
		logger.info(businessTwo.calculateSomething());
	}

}
