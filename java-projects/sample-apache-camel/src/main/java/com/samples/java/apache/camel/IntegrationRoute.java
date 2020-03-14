package com.samples.java.apache.camel;

import org.apache.camel.builder.RouteBuilder;

public class IntegrationRoute extends RouteBuilder {

	private static final String input = "file:orders/transform?noop=true";
	private static final String output = "file:orders/output";

	@Override
	public void configure() throws Exception {
		from(input)
		.process(new LoggingProcessor())
		.bean(new TransformationBean()).unmarshal().csv()
		.split(body().tokenize(",")).choice()
		.when(body().contains("DVD"))
		.to(output).otherwise().to("mock:others");
	}

}
