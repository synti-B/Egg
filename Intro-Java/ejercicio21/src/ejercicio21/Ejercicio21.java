package ejercicio21;

/**
 * @author Cinthia
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;
        int cont = 0;
        int[][] matriz10 = new int[][]{
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

        int[][] matriz3 = new int[][]{{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (matriz10[i][j] == matriz3[0][0]) {
                    matriz3x3(i, j, matriz10, matriz3, cont);
                }
            }
        }
        imprimir(matriz3, matriz10, fila, columna);

    }

    public static void matriz3x3(int fila, int columna, int[][] matriz10, int[][] matriz3, int cont) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (matriz3[i][j] == matriz10[i + fila][j + columna]) {
                    cont = cont + 1;

                }
            }

        }
        if (cont == 9) {
            System.out.print("El primer elemento de la submatriz P comienza en la fila " + fila + " y en la columna " + columna);
            System.out.println();
        }

    }

    public static void imprimir(int[][] matriz3, int[][] matriz10, int fila, int columna) {
        System.out.println("  ");
        System.out.println("******* Matriz de 10 x 10 ********");
        for (int z = 0; z <= 9; z++) {
            System.out.println("   ");
            System.out.println("   ");

            for (int y = 0; y <= 9; y++) {

                System.out.print(matriz10[z][y] + " ");
            }
        }
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("******* Matriz de 3 x 3 ********");
        for (int z = 0; z <= 2; z++) {
            System.out.println("   ");
            System.out.println("   ");

            for (int y = 0; y <= 2; y++) {

                System.out.print(matriz3[z][y] + " ");
            }
        }
        System.out.println("   ");
        System.out.println("   ");
           }
}
