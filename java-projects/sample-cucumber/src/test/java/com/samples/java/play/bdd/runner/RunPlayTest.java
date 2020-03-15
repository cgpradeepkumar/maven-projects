package com.samples.java.play.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" }, features = { "src/test/resources/cucumber/play.feature",
		"src/test/resources/cucumber/sample.feature", "src/test/resources/cucumber/data_table.feature",
		"src/test/resources/cucumber/multiply.feature" }, glue = "com.samples.java.play.bdd.steps")
public class RunPlayTest {

}
