package pooextra6;

import java.util.Scanner;

/**
 * @author Cinthia
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);
    Ahorcado a = new Ahorcado();
    String palabra;
    int contadorEncon = 0;
    int NOcontadorEncon = 0;
    int faltante = 0;
    String letra;

    public Ahorcado crearJuego() {

        System.out.println("Ingrese palabra");
        palabra = leer.next();
        String letrAux[] = new String[20];
        for (int i = 0; i <= palabra.length(); i++) {
            letrAux[i] = palabra.substring(i, palabra.length());
            a.setPalabra(letrAux);
        }
        System.out.print("Ingrese cantidad de jugadas maximas: ");
        a.setCantidadJugadasMax(leer.nextInt());
        a.setLetrasEncontradas(0);
        a.setPalabra(letrAux);
        return a;
    }

    public int longitud() {
        return palabra.length();
    }

    public void buscar(String letra, Ahorcado a) {
        boolean vali = false;
        for (int i = 0; i < longitud(); i++) {
            if (letra.equals(palabra.substring(i, i + 1))) {
                contadorEncon = contadorEncon + 1;
                NOcontadorEncon = longitud() - (i + 1);
                vali = true;

            }
        }
        if (vali == true) {
            System.out.println("La letra pertenece a la palabra");

        } else if (contadorEncon == 0) {
            System.out.println("La letra NO pertenece a la palabra");
            NOcontadorEncon = palabra.length();
        } else {
            NOcontadorEncon = palabra.length() - 1;
        }

    }

    public int intentos() {
        faltante = longitud() - 1;
        return faltante;
    }

    public void juego() {
        crearJuego();
        System.out.println("Longitud de la palabra: " + longitud());
        System.out.println(a.getCantidadJugadasMax());
        while (a.getCantidadJugadasMax() != 0) {
            System.out.println("Ingrese una letra: ");
            letra = leer.next();
            buscar(letra, a);
            System.out.println("Número de letras (encontradas, faltantes): (" + contadorEncon + "," + NOcontadorEncon + ")");
            a.setCantidadJugadasMax(a.getCantidadJugadasMax() - 1);
            intentos();
            System.out.println("Número de oportunidades restantes: " + a.getCantidadJugadasMax());
        }
        if (a.getCantidadJugadasMax() == 0) {
            System.out.println("Lo sentimos, no hay más oportunidades");
        }
        if (longitud() == contadorEncon) {
            System.out.println("GANASTEE!!!!");
        }
    }
}
