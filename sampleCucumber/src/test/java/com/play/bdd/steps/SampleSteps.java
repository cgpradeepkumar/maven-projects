package com.play.bdd.steps;

import cucumber.api.java.en.Given;

public class SampleSteps {
	@Given("^There (?:is|are) (\\d) (?:credit?|credits) for some course in Play$")
	public void animals_fed_by_people(int credit) {
		System.out.println(String.format("%d credit(s)", credit));
	}
}
