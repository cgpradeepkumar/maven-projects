package in.samples.apache.camel;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Before;
import org.junit.Test;

public class IntegrationTest extends CamelTestSupport {

	@Before
	public void setUp() throws Exception {
		super.setUp();
		context.addRoutes(new IntegrationRoute());
//		deleteDirectory("orders/transform");
//		deleteDirectory("orders/output");
	}

	@Test
	public void testIntegrationRoute() throws Exception {
		String bodyOfMessage = "Harry Potter / dvd, Metallica / cd";
		template.sendBodyAndHeader("file://orders/transform", bodyOfMessage, Exchange.FILE_NAME, "orders.csv");
		
		MockEndpoint mockEndpoint = context.getEndpoint("mock:others", MockEndpoint.class);
		mockEndpoint.expectedMessageCount(1);
		mockEndpoint.setResultWaitTime(1000);
		
		Thread.sleep(3000);
		
		String dvdBody = " harry potter and the deathly hollows / dvd";
		
		File target = new File("orders/output/orders.csv");
		String content = context.getTypeConverter().convertTo(String.class, target);
		
		mockEndpoint.assertIsSatisfied();
//		assertEquals(dvdBody.toUpperCase(), content);
	}
}