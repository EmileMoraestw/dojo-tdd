package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void startCalculator(){
        calculator = new Calculator();
    }
    @Test
    public void shouldReturnSum() {

        Assert.assertEquals(7 , calculator.sum(4, 3));
    }
    @Test
    public void shouldReturnSubtract() {

        Assert.assertEquals(1 , calculator.subtract(4, 3));
    }

    @Test
    public void shouldReturnMultiplicate() {

        Assert.assertEquals(12 , calculator.multiplicate(4, 3));
    }
    @Test
    public void shouldReturnDivide() {

        Assert.assertEquals(5 , calculator.divide(10, 2));
    }

    @Test
    public void shouldSumAndSubtract(){
        Assert.assertEquals(2, calculator.validade(20,10));
    }
}