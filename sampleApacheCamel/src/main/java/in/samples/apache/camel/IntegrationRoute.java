package in.samples.apache.camel;

import org.apache.camel.builder.RouteBuilder;

public class IntegrationRoute extends RouteBuilder {

	private static final String input = "file:E:\\Temp\\camelTest\\transform";
	private static final String output = "file:E:\\Temp\\camelTest\\output";

	@Override
	public void configure() throws Exception {
		from(input)
		.process(new LoggingProcessor())
		.bean(new TransformationBean()).unmarshal().csv()
		.split(body().tokenize(",")).choice()
		.when(body().contains("DVD"))
		.to(output);
	}

}
