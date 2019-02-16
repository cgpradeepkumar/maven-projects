package in.sample.java.spring.rest.controller;

import in.sample.java.spring.rest.client.RestBooksApi;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RestBooksController {

    @Autowired
    private RestBooksApi restBooksApi;

    public JSONObject getBooks() {
        return null;
    }
}
