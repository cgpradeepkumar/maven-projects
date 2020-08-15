package com.sample.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoTwo {
    public String getValue() {
        return "daoTwo";
    }
}
