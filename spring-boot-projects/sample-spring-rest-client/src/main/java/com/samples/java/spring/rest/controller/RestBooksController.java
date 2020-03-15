package com.samples.java.spring.rest.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samples.java.spring.rest.client.RestBooksApi;

@RestController
@RequestMapping("/api/")
public class RestBooksController {

    @Autowired
    private RestBooksApi restBooksApi;

    public JSONObject getBooks() {
        return null;
    }
}
