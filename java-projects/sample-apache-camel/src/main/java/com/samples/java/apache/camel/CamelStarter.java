package com.samples.java.apache.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelStarter {

	private static final String input = "file:orders/input?noop=true";
	private static final String output = "file:orders/output";

	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();

		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from(input).to(output);
			}
		});

		//context.addRoutes(new IntegrationRoute());
		
		context.start();

		Thread.sleep(5 * 60 * 100);

		context.stop();
	}

}
