package ru.Calculator;

/**
 * Class Calculate1 создание элементарного калькулятора.
 * @author popov
 * @since 15.06.2018
 */



public class Calculator {
    private double result;

    public void add(double first, double second){
        this.result = first + second;
    }
    public double getResult() {
        return this.result;
    }

    public void subtract(double first, double second){
        this.result = first - second;
    }
    public double getResult() {
        return this.result;
    }
    public void div(double first, double second) {
        this.result = first / second;
    }
    public double getResult() {
        return this.result;
    }
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    public double getResult(){
        return this.result;
    }
}