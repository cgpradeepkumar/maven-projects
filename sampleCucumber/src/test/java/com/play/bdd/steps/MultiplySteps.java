package com.play.bdd.steps;

import static org.junit.Assert.assertEquals;

import com.play.bdd.calculator.Multiply;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplySteps {

	private Multiply m;

	@Given("^You have a calculator$")
	public void you_have_a_calculator() throws Throwable {
		m = new Multiply();
	}

	@When("^you multiply (\\d) and (\\d)$")
	public void you_multiply_a_and_b(int a, int b) throws Throwable {
		m.multiply(a, b);
	}

	@Then("^result should come as (\\d)$")
	public void result_should_come_as_c(int c) throws Throwable {
		assertEquals(c, m.result());
	}
}
