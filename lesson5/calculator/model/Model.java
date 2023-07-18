package lesson5.calculator.model;

import lesson5.calculator.data.Calculator.Calculator;

public abstract class Model<N extends Calculator<E>, E> {

    public abstract E calculate(N calculator);
}
