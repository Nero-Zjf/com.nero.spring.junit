package com.nero.spring.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@ContextConfiguration(locations = {"classpath:*.xml"})
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class CalculatorTests {

    @Autowired
    Calculator calculator;

    @Test
    public void test() {
        Assert.assertEquals(7, calculator.cal(5, 2), 0);
    }
}
