package poo4;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);
    Rectangulo recta = new Rectangulo();
    public double superficie, perimetro;

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo: ");
        recta.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        recta.setAltura(leer.nextDouble());
        return recta;
    }

    public double superficie() {
        superficie = recta.getBase() * recta.getAltura();
        return superficie;
    }

    public double perimetro() {
        perimetro = (recta.getBase() + recta.getAltura()) * 2;
        return perimetro;
    }

    public void mostrar() {
        System.out.println("La superficie del rectangulo es: " + superficie());
        System.out.println("El perimetro del rectangulo es: " + perimetro());
    }

    public void mostrarRectangulo() {
        System.out.println("  ");
        for (int i = 0; i <= recta.getBase()-1; i++) {
            
            for (int j = 0; j <= recta.getAltura()-1; j++) {
                if ((i != 0 && i != recta.getBase() - 1) && (i != 0 && i != recta.getBase() - 1) && (j != 0 && j != recta.getAltura() - 1) && (j != 0 && j != recta.getAltura() - 1)) {
                    System.out.print("  ");
                    System.out.print("  ");
                } else {
                    System.out.print("  * ");
                }
            }System.out.println("  ");
        }
    }
}