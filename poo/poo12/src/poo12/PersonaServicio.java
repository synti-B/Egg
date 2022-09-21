package poo12;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;

/**
 * @author Cinthia
 */
public class PersonaServicio {

    private int anio;

    public Persona crearPersona() {
        Persona p = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese Nombre: ");
        p.setNombre(leer.nextLine());
        System.out.println("Fecha de nacimiento");
        System.out.print("Ingrese el dia: ");
        int dia = leer.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = leer.nextInt();

        Date fechaNacimiento = new Date(anio, mes, dia);
        p.setFechaNacimiento(fechaNacimiento);
        return p;
    }

    public void calcularEdad(Persona p) {

        System.out.print("La fecha actual es: ");
        Date hoy = new Date();
        LocalDate date_of_today = LocalDate.now();
        System.out.println(date_of_today);
        //System.out.println(hoy.toString());
        int anios = hoy.getYear() - p.getFechaNacimiento().getYear();
        System.out.print("La diferencia de años es: ");
        System.out.println(anios);
    }

    public boolean menorQue(int edad, Persona p) {
        Date hoy = new Date();
        int anios = hoy.getYear() - p.getFechaNacimiento().getYear();
        if (anios <= edad) {
            return true;
        }
        return false;
    }

    public void mostrarPersona(Persona p) {
        System.out.println(p.toString());
    }

}
