package com.sample.aop.bo;

import com.sample.aop.dao.DaoOne;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessOne {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessOne.class);

    @Autowired
    private DaoOne daoOne;

    public String calculateSomething() {
        return daoOne.getValue();
    }
}
