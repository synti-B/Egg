/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cadena ");
        String cade = leer.nextLine();
        int correcto=0;
        int incorrecto=0;
        while (!"&&&&&".equals(cade)) {

            if (cade.length() <= 5) {
             
                    if ("x".equals(cade.substring(0,1)) && "o".equals(cade.substring(4,5))){
                        correcto =correcto +1;
                    } else {
                        incorrecto =incorrecto+1;
                    }
                }
         else {
                System.out.println("La cadena debe ser menor o igual a 5 ");
            }
            System.out.println("Ingrese cadena ");
             cade = leer.nextLine();
        }
        System.out.println("cantidad de lecturas correctas: " + correcto);
        System.out.println("cantidad de lecturas incorrectas: " + incorrecto);
    }
}
