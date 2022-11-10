/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del cuadrado ");
        int num = leer.nextInt();
        int fila;
        int columna;
        for(fila=0;fila<=num-1;fila++){
               for(columna=0;columna<=num-1;columna++){
               if((fila!=0 && fila!=num-1) && (columna!=0 && columna!=num-1)){
               System.out.print("  ");
               }else{
                  System.out.print("* "); 
               }
              
           }System.out.println("  ");
           } 
            System.out.println(" ");
        }
    }


