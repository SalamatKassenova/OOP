package dz7_final;

public class ComplexCalculator implements Calculator<ComplexNumber> {
    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }    

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber conjugate = new ComplexNumber(b.getReal(), -b.getReal());
        ComplexNumber numerator = this.multiply(a, conjugate);
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        if (denominator == 0) throw new ComplexDivisionByZeroException("Division by zero.");
        return new ComplexNumber(numerator.getReal() / denominator, numerator.getImaginary() / denominator);
    }
}
