package com.samples.java.apache.camel;

public class TransformationBean {

	public String makeUpperCase(String body) {
		String upperCaseBody = body.toUpperCase();
		return upperCaseBody;
	}
}
