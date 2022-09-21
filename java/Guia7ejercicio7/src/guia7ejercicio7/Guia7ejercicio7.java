package guia7ejercicio7;

import Persona.Persona;
import Servicio.Servicio;
import java.util.Scanner;

public class Guia7ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio A2 = new Servicio();
        Persona[] vectorPersonas = new Persona[4];
        double mayores = 0, menores = 0, debajoIdeal = 0, pesoIdeal = 0, mayorIdeal = 0, operacion = 0;

        for (int i = 0; i < 4; i++) {
            int retornoIMC;
            Persona A4 = new Persona();
            A2.crearPersona(A4);

            retornoIMC = A2.calcularIMC(A4);
            if (retornoIMC == -1) {
                System.out.println(A4.getNombre() + " esta por debajo de su peso ideal.");
                debajoIdeal++;
            } else if (retornoIMC == 0) {
                System.out.println(A4.getNombre() + " esta en su peso ideal.");
                pesoIdeal++;
            } else {
                System.out.println(A4.getNombre() + " tiene sobrepreso.");
                mayorIdeal++;
            }

            if (A2.esMayorDeEdad(A4)) {
                System.out.println(A4.getNombre() + " es mayor de edad.");
                mayores++;
            } else {
                System.out.println(A4.getNombre() + " es menor de edad.");
                menores++;
            }

            vectorPersonas[i] = A4;
        }

        operacion = (mayores * 100) / 4;
        System.out.println("Porcentaje mayores " + Double.toString(operacion));
        operacion = (menores * 100) / 4;
        System.out.println("Porcentaje menores " + Double.toString(operacion));
        operacion = (pesoIdeal * 100) / 4;
        System.out.println("Porcentaje en peso ideal " + Double.toString(operacion));
        operacion = (mayorIdeal * 100) / 4;
        System.out.println("Porcentaje en sobre el ideal " + Double.toString(operacion));
        operacion = (debajoIdeal * 100) / 4;
        System.out.println("Porcentaje en debajo peso ideal " + Double.toString(operacion));

        for (int i = 0; i < 4; i++) {
            System.out.println(vectorPersonas[i].toString());
        }

    }

}
