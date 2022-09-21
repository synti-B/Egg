package ejercicio19;

/**
 * @author Cinthia
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] tras = new int[4][4];
        System.out.println("*******Matriz********");
        for (int i = 0; i <= 3; i++) {
            System.out.println("   ");
            System.out.println("   ");
            for (int j = 0; j <= 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10) - 2;

                System.out.print(matriz[i][j] + " ");
                tras[j][i] = matriz[i][j];
            }
        }
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("*******Matriz Traspuesta********");
        for (int i = 0; i <= 3; i++) {
            System.out.println("   ");
            System.out.println("   ");

            for (int j = 0; j <= 3; j++) {

                System.out.print(tras[i][j] + " ");
            }
        }
        System.out.println("  ");
        System.out.println("*******Matriz Anti simétrica********");
        for (int i = 0; i <= 3; i++) {
            System.out.println("   ");
            System.out.println("   ");

            for (int j = 0; j <= 3; j++) {

                System.out.print(-1*(tras[i][j]) + " ");
            }
        }
        System.out.println("  ");
    }

}
