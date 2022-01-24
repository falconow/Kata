package Task4;

import java.util.Objects;
import java.util.Random;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj.getClass() == ComplexNumber.class) {
            ComplexNumber complexNumber = (ComplexNumber) obj;
            return re == complexNumber.getRe() && im == complexNumber.getIm();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Double.hashCode(im);
        result = 31 * result + Double.hashCode(re);
        return result;
    }



}
