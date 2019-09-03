package com.play.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" }, features = { "src/test/resources/cucumber/play.feature",
		"src/test/resources/cucumber/sample.feature" }, glue = "com.play.bdd.steps")
public class RunPlayTest {

}
