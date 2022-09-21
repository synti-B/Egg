package poo11;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

/**
 * @author Cinthia
 */
public class Poo11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese años: ");
        int anio = leer.nextInt();
        System.out.print("Ingrese mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese dia: ");
        int dia = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        System.out.print("La fecha actual es: ");
        System.out.println(fechaActual);
        //System.out.println("La fecha Ingresada es: " + fecha.format());

        fechaActual = fechaActual.minusYears(anio);
        System.out.print("La diferencia de años es: ");
        System.out.println(fechaActual.getYear());
    }

}
