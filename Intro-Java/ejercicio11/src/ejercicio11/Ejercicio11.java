/*
 *11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero ");
        int num2 = leer.nextInt();
        boolean salir=false;
        while (salir != true) {
            System.out.println("****************MENU******************");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La sumar de los numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los numeros es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división de los numeros es: " + (num1 / num2));
                    break;
                case 5:
                    salir= true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}
