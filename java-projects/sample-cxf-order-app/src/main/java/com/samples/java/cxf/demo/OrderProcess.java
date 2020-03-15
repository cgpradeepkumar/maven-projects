package com.samples.java.cxf.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderProcess {
	@WebMethod
	String processOrder(Order order);
}
