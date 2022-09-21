/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Ejercicio16 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese tamaño del vector: ");
        int tamanio = leer.nextInt();
        int[] arreglo = new int[tamanio];
        int ban = 0;
        int conta = 0;
        for (int i = 0; i <= tamanio - 1; i++) {
            arreglo[i] = (int) (Math.random() * tamanio) + 1;
           System.out.println(arreglo[i]+" ");
        }
        System.out.print(" Ingrese el numero que desea buscar: ");
        int num = leer.nextInt();
        for (int i = 0; i <= tamanio - 1; i++) {
            if (arreglo[i] == num) {
                ban= i;
                conta=conta+1;
            }
            
        }
       System.out.println("El numero que busca esta en la posicion : "+ ban+" y se repite "+conta);
    }

}

