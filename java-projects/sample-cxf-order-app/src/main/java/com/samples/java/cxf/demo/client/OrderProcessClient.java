package com.samples.java.cxf.demo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.java.cxf.demo.Order;
import com.samples.java.cxf.demo.OrderProcess;

public class OrderProcessClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});
		OrderProcess client = (OrderProcess) applicationContext.getBean("orderClient");
		
		Order order = new Order();
		order.setCustomerId("C001");
		order.setItemId("IT001");
		order.setQuantity(3);
		order.setPrice(450.00);
		
		String orderId = client.processOrder(order);
		
		String message = (orderId.equals(""))? "Order not created!" : "Order created; Order Id: " + orderId;
		System.out.println(message);
		System.exit(0);
	}
}
