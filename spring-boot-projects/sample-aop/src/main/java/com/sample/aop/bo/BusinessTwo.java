package com.sample.aop.bo;

import com.sample.aop.dao.DaoTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessTwo {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessTwo.class);

    @Autowired
    private DaoTwo daoTwo;

    public String calculateSomething() {
        return daoTwo.getValue();
    }
}
