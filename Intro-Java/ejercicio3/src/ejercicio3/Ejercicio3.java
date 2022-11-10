/*
 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       
            
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase= leer.nextLine();
         
       System.out.println("El nombre ingresado en mayuscula "+ frase.toUpperCase()+" en minuscula "+ frase.toLowerCase());
    }
    
}
