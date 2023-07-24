package lesson7.calculator.controllers;

import lesson7.calculator.data.CalculatorComplex;
import lesson7.calculator.data.Complex;

public interface Controller {

    public Complex sendComplex(CalculatorComplex calculator);
}
