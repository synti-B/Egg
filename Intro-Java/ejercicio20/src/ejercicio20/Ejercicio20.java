package ejercicio20;

import java.util.Scanner;

/**
 * @author Cinthia
 */
public class Ejercicio20 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        System.out.println("Ingrese valor de la matriz debe ser 9 numeros");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                int n = leer.nextInt();
                if (n >= 0 && n <= 9) {
                    cuadrado[i][j] = n;

                } else {
                    System.out.println("la dimension debe ser entre 0 y 9 ");
                }

            }

        }
        suma(cuadrado);
        imprimir(cuadrado);
    }

    public static void suma(int[][] cuadrado) {
        int sumang = 0;
        int sumaDiag1 = 0;
        int sumaDiag2 = 0;
        int sumaFila = 0;
        int sumaCol = 0;
        for (int j = 0; j <= 2; j++) {
            sumang = sumang + cuadrado[0][j];
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                sumaFila = sumaFila + cuadrado[i][j];
                sumaCol = sumaCol + cuadrado[j][i];
            }

            sumaDiag1 = sumaDiag1 + cuadrado[i][i];
            sumaDiag2 = sumaDiag2 + cuadrado[3 - 1 - i][3 - 1 - i];
        }
        if (sumaFila != sumang || sumaCol != sumang) {

            if (sumaDiag1 != sumang || sumaDiag2 != sumang) {
                System.out.println("La matriz no es cuadrado magico ");
            } else {
                System.out.println("La matriz es cuadrado magico ");
            }
        }
    }

    public static void imprimir(int[][] c) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
