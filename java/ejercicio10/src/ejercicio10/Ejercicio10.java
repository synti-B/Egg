/*
 * 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero limite ");
        int limite = leer.nextInt();
        int suma = 0;

        while (limite > suma) {
            System.out.println("Ingrese numero ");

            int num = leer.nextInt();
            suma = suma + num;
        }

    }

}
