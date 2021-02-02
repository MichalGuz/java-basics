package tb_constructors_various_practices;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // all operations use two elements: this real/imaginary values and values of real/imaginary from methods' parameters
    // the order of these elements is irrelevant
    public void addComplexNumbers(double real, double imaginary){
        System.out.println(this.real = getReal() + real);
        System.out.println(this.imaginary = getImaginary() + imaginary);
    }

}
