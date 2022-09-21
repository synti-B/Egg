package poo9;

/**
 *
 * @author Cinthia
 */
public class Matematica {
    public double numero1;
    public double numero2;

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public Matematica() {
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
     @Override
    public String toString() {
        return "Matematica{" + "Numero 1=" + numero1 + ", Numero 2="+ numero2 +'}';
    }
}
