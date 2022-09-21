package pooextra3;

/**
 * @author Cinthia
 */
public class Raices {

    public double a;
    public double b;
    public double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Raices() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminante() {
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        return discriminante;
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

}
