package main2;

/**
 *
 * @author Cinthia
 */
import java.util.Scanner;

public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in);
    Circunferencia circo = new Circunferencia();
    public double area;
    public double perimetro;

    public void crearCircunferencia() {
        System.out.println("Ingrese radio: ");
        circo.setRadio(leer.nextDouble());
    }

    public double area() {

        area = 3.1416 * Math.pow(circo.getRadio(), 2);
       return area;
    }

    public double perimetro() {

        perimetro = (2 * 3.1416) * circo.getRadio();
        return perimetro;
    }

    public void mostrar() {
        System.out.println("el radio es: " + circo.getRadio());
        System.out.println("El area es: " + area());
        System.out.println("El perimetro es: " + perimetro());
    }
}
