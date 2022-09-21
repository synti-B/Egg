/*
 * 7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Ejercicio7 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String otraf = "eureka";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase ");
        String frase = leer.nextLine();
        if (otraf.equals(frase)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
