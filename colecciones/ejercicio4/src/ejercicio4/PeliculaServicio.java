package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String opc = " ";
    ArrayList<Pelicula> peli = new ArrayList<>();
    Pelicula p = new Pelicula();

    public void CrearAlumno() {

        do {
            System.out.print("Ingrese titulo de la pelicula: ");
            p.setTitulo(leer.next());
            System.out.print("Ingrese director de la pelicula: ");
            p.setDirector(leer.next());
            System.out.print("Ingrese duracion de la pelicula en minutos: ");
            p.setDuracionxhs(leer.nextDouble());
           peli.add(new Pelicula(p.getTitulo(), p.getDirector(), (p.getDuracionxhs()/60)));           
            System.out.println("Desea continuar S/N");
            opc = leer.next();
            opc = opc.toUpperCase();
        } while (opc.equals("S"));
    }

    public void mostrar() {
        System.out.println(" ");
        System.out.println("********************************* Pelicula *********************************");

        peli.forEach((aux) -> {
            System.out.println(aux.toString());
        });
        System.out.println(" ");
    }

    public void mostrarPeliMasUnaHs() {
        System.out.println(" ");
        System.out.println("********************************* Pelicula con duracion mayor a una hora *********************************");

        peli.stream().filter((aux) -> (p.getDuracionxhs() > 1.00)).forEachOrdered((aux) -> {
            System.out.println(aux.toString());
        });
        System.out.println(" ");
    }

    public void menorAmayor() {
        System.out.println(" ");
        System.out.println("********************************* Pelicula ordenadas de forma ascendente*********************************");
        Collections.sort(peli, (Pelicula objeto1, Pelicula objeto2) -> objeto1.getDuracionxhs().compareTo(objeto2.getDuracionxhs()));
        peli.forEach((aux) -> {
            System.out.println(aux.toString());
        });
        System.out.println(" ");
    }

    public void mayorAmenor() {
        System.out.println(" ");
        System.out.println("********************************* Pelicula ordenadas de forma Descendente*********************************");
        Collections.sort(peli, (Pelicula objeto1, Pelicula objeto2) -> objeto2.getDuracionxhs().compareTo(objeto1.getDuracionxhs()));
        peli.forEach((aux) -> {
            System.out.println(aux.toString());
        });
    }

    public void ordenAlfabeticoTitulo() {
        System.out.println(" ");
        System.out.println("********************************* Pelicula ordenadas Alfabeticamente por titulo *********************************");
        Collections.sort(peli, (Pelicula objeto1, Pelicula objeto2) -> objeto1.getTitulo().compareTo(objeto2.getTitulo()));
        peli.forEach((aux) -> {
            System.out.println(aux.toString());
        });
        System.out.println(" ");
    }

    public void ordenAlfabeticoDirector() {
        System.out.println(" ");
        System.out.println("********************************* Pelicula ordenadas Alfabeticamente por Director *********************************");
        Collections.sort(peli, (Pelicula objeto1, Pelicula objeto2) -> objeto1.getDirector().compareTo(objeto2.getDirector()));
        peli.forEach((aux) -> {
            System.out.println(aux.toString());
        });
        System.out.println(" ");
    }
}
