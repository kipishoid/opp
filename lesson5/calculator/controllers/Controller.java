package lesson5.calculator.controllers;

import lesson5.calculator.data.Calculator.CalculatorComplex;
import lesson5.calculator.data.Calculator.CalculatorRational;
import lesson5.calculator.data.Complex;
import lesson5.calculator.model.ModelComplex;
import lesson5.calculator.model.ModelRational;

public class Controller {

    public Controller() {
    }

    public double sendRational(CalculatorRational calculator) {
        ModelRational model = new ModelRational();
        return model.calculate(calculator);
    }

    public Complex sendComplex(CalculatorComplex calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate(calculator);
    }
}
