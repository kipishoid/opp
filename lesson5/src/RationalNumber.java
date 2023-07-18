public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int resultNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int resultDenominator = this.denominator * other.denominator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int resultNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int resultDenominator = this.denominator * other.denominator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    public RationalNumber multiply(RationalNumber other) {
        int resultNumerator = this.numerator * other.numerator;
        int resultDenominator = this.denominator * other.denominator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        int resultNumerator = this.numerator * other.denominator;
        int resultDenominator = this.denominator * other.numerator;
        return new RationalNumber(resultNumerator, resultDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}