package lesson5.calculator.data.OperationComplex;

import lesson5.calculator.data.Complex;

public class ComplexSum {

    public Complex sum(Complex a, Complex b) {
        double real = a.getRe() + b.getIm();
        double img = a.getIm() + b.getIm();
        return new Complex(real, img);
    }
}
