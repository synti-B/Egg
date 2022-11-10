/*
 *4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grado centígrado ");
        int grado= leer.nextInt();
         
       System.out.println("Su equivalente en grados Fahrenheit es: "+(32+(9*grado/5)));
    }
    
}
