package ejercicio17;

import java.util.Scanner;

/**
 * @author Cinthia
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        System.out.print("Ingrese tamaño del vector: ");
        int tamanio = leer.nextInt();
        int[] arreglo = new int[tamanio];

        for (int i = 0; i <= tamanio - 1; i++) {
            arreglo[i] = (int) (Math.random() * 20000) + 1;
            System.out.println(arreglo[i] + " ");
        }
        for (int i = 0; i <= tamanio - 1; i++) {
            String x = Integer.toString(arreglo[i]);
            switch (x.length()) {
                case 1:
                    
                    cont1 = cont1 + 1;
                    break;
                case 2:
                    cont2 = cont2 + 1;

                    break;
                case 3:

                    cont3 = cont3 + 1;

                    break;
                case 4:

                    cont4 = cont4 + 1;
                    break;
                case 5:
                    cont5 = cont5 + 1;
                    break;
            }
        }
        System.out.println("En el vector hay " + cont1 + " con 1 dígito, ");
        System.out.println("                 " + cont2 + " con 2 dígitos ");
        System.out.println("                 " + cont3 + " con 3 dígitos ");
        System.out.println("                 " + cont4 + " con 4 dígitos ");
        System.out.println("               y " + cont5 + " con 5 dígitos ");
    }

}
