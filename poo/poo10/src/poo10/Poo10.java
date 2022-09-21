package poo10;

import java.util.Arrays;

/**
 * @author Cinthia
 */
public class Poo10 {

    public static void main(String[] args) {
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (double) Math.floor((Math.random() * 50) + 1);
            System.out.println(vectorA[i]);

        }
        System.out.println("\n VECTOR A ORDENADA.\n");

        Arrays.sort(vectorA);
        for (int i = 0; i < vectorA.length; i++) {
            for (int b = 0; b < vectorB.length - 1; b++) {
                if (b < 10) {
                    vectorB[b] = vectorA[b];

                } else {
                    vectorB[b] = 0.5;
                }
            }
            System.out.println(vectorA[i] + " ");
        }
        System.out.println("\n VECTOR B \n");

        for (int i = 0; i < vectorB.length - 1; i++) {
            System.out.println(vectorB[i]);

        }
    }

}
