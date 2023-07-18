package lesson5.calculator.data.OperationComplex;

import lesson5.calculator.data.Complex;

public class ComplexMulti {

    public Complex multi(Complex a, Complex b) {
        double real = a.getRe() * b.getRe() - a.getIm() * b.getIm();
        double img = a.getRe() * b.getIm() + a.getIm() * b.getRe();
        return new Complex(real, img);
    }
}
