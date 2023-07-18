package lesson5.calculator.model;

import lesson5.calculator.data.Calculator.CalculatorRational;
import lesson5.calculator.data.OperaionRational.*;

public class ModelRational extends Model<CalculatorRational, Double> {

    @Override
    public Double calculate(CalculatorRational calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new RationalSum().sum(calc.getNumOne(), calc.getNumTwo());
            }
            case '-' -> {
                return new RationalDiff().diff(calc.getNumOne(), calc.getNumTwo());
            }
            case '/' -> {
                return new RationalDiv().div(calc.getNumOne(), calc.getNumTwo());
            }
            case '*' -> {
                return new RationalMulti().multi(calc.getNumOne(), calc.getNumTwo());
            }
        }
        return null;
    }
}
