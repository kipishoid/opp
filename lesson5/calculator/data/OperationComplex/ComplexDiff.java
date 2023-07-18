package lesson5.calculator.data.OperationComplex;

import lesson5.calculator.data.Complex;

public class ComplexDiff {

    public Complex diff(Complex a, Complex b) {
        double real = a.getRe() - b.getRe();
        double img = a.getIm() - b.getIm();
        return new Complex(real, img);
    }
}
