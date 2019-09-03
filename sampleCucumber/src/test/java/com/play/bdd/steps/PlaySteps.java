package com.play.bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlaySteps {
	@Given("^Play a learning platform$")
	public void play_a_learning_platform() throws Throwable {
		System.out.println("This will print about play");
	}

	@When("^I want to learn$")
	public void i_want_to_learn() throws Throwable {
		System.out.println("This will print love for play");
	}

	@Then("^I open Play to learn and earn$")
	public void i_open_play_to_learn_and_earn() throws Throwable {
		System.out.println("This will print benefits of play");
	}
}
