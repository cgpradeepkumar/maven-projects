package in.samples.apache.cxf.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderProcess {
	@WebMethod
	String processOrder(Order order);
}
