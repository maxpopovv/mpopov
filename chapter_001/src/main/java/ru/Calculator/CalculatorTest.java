package ru.Calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtractOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDivOneDivideOneThenOne() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipleOneMultipleOneThenSecondDegree() {
        Calculator calc = new Calculator();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D*1D;
        assertThat(result, is(expected));
    }
}