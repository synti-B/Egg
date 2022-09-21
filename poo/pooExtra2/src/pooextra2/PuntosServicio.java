package pooextra2;

import java.util.Scanner;

/**
 * @author Cinthia
 */
public class PuntosServicio {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        Puntos p= new Puntos();
        System.out.print("Ingrese un numero para el punto1 x1: ");
        p.setX1(leer.nextInt());
        System.out.print("Ingrese un numero para el punto1 x2: ");
        p.setX2(leer.nextInt());
        System.out.print("Ingrese un numero para el punto2 y1: ");
        p.setY1(leer.nextInt());
        System.out.print("Ingrese un numero para el punto2 y2: ");
        p.setY2(leer.nextInt());
        return p;
    }
     public void calcularDevolver(Puntos p) {
        float a = (p.getX2() - p.getX1()) * (p.getX2() - p.getX1());
        float b = (p.getY2() - p.getY1()) * (p.getY2() - p.getY1());
        double d = Math.sqrt(a + b);
        System.out.println("La distancia es de:" + d);
    }
}
