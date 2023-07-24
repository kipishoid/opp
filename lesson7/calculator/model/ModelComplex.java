package lesson7.calculator.model;

import lesson7.calculator.data.Calculator;
import lesson7.calculator.data.Complex;
import lesson7.calculator.data.ComplexDiff;
import lesson7.calculator.data.ComplexDiv;
import lesson7.calculator.data.ComplexMulti;
import lesson7.calculator.data.ComplexSum;

public class ModelComplex implements Model {

    @Override
    public Complex calculate(Calculator calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new ComplexSum().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '-' -> {
                return new ComplexDiff().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '/' -> {
                return new ComplexDiv().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '*' -> {
                return new ComplexMulti().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
        }
        return null;
    }
}
