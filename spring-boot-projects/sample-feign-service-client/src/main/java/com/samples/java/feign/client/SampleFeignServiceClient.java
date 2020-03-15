package com.samples.java.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nameservice", url = "http://localhost:8080/")
public interface SampleFeignServiceClient {

	@GetMapping(value = "/name")
	ResponseEntity<String> getName();
}
