package pooextra5;

import java.util.Scanner;

/**
 * @author Cinthia
 */
public class PooExtra5 {

    public static void main(String[] args) {
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = mes[3];
        Scanner leer = new Scanner(System.in);
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String mesA = leer.nextLine();
        while (!mesA.equals(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            mesA = leer.nextLine();
        }
        System.out.println("¡Ha acertado!");
    }

}
