package in.samples.apache.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelStarter {

	private static final String input = "file:E:\\Temp\\camelTest\\input";
	private static final String output = "file:E:\\Temp\\camelTest\\output";

	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();

		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from(input).to(output);
			}
		});

		context.start();

		Thread.sleep(5 * 60 * 1000);

		context.stop();
	}

}
