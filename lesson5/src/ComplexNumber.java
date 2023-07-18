public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double resultRealPart = this.realPart + other.realPart;
        double resultImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double resultRealPart = this.realPart - other.realPart;
        double resultImaginaryPart = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double resultRealPart = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double resultImaginaryPart = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        double resultRealPart = (this.realPart * other.realPart + this.imaginaryPart * other.imaginaryPart) / denominator;
        double resultImaginaryPart = (this.imaginaryPart * other.realPart - this.realPart * other.imaginaryPart) / denominator;
        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}