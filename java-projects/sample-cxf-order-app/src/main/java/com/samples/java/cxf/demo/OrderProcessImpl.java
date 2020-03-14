package com.samples.java.cxf.demo;

public class OrderProcessImpl implements OrderProcess {

	@Override
	public String processOrder(Order order) {
		String orderId = validate(order);
		return orderId;
	}

	private String validate(Order order) {
		
		if (order.getCustomerId() != null && order.getItemId() != null && order.getQuantity() > 0) {
			return order.getCustomerId()+"-"+order.getItemId()+Math.random();
		}
		return null;
	}

}
