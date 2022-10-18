package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class PerroServicio {

    String opc = " ";
    Scanner leer;
    ArrayList<Perroo> mascota;
    //Esta es una muy buena practica

    public PerroServicio() {
        this.mascota = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    public void crearPerroo() {
        do {
            System.out.println("Ingrese el nombre del perro");
            String nombre = leer.next();

            System.out.println("Ingrese la raza del perro");
            String raza = leer.next();
            mascota.add(new Perroo(nombre, raza));

            System.out.println("Desea continuar S/N");
            opc = leer.next();
            opc = opc.toUpperCase();
        } while (opc.equals("S"));
    }

    public void mostrarMascota() {
        System.out.println("Mascotas");
        for (Perroo aux : mascota) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + mascota.size());
    }

    public void buscarEliminar(String bucarp) {
        boolean vali = false;
        Iterator<Perroo> it = mascota.iterator();

        while (it.hasNext()) {

            if (it.next().getNombre().equals(bucarp)) {
                vali = true;
                System.out.println("Se encontro a la mascota");
                it.remove();
                System.out.println("****** MASCOTA ELIMINADA *******");
                System.out.println(" ");
                System.out.println(" ASI QUEDO LA NUEVA LISTA DE MASCOTAS");
                System.out.println(" ");
                Collections.sort(mascota, (Perroo objeto1, Perroo objeto2) -> objeto1.getNombre().compareTo(objeto2.getNombre()));
                for (Perroo aux : mascota) {
                    System.out.println(aux.toString());
                }

            }
        }
        if (vali == false) {
            System.out.println("NO se encontro a el perro");
            System.out.println(" ");
            System.out.println(" ASI QUEDO LA NUEVA LISTA DE MASCOTAS");
            System.out.println(" ");
            Collections.sort(mascota, (Perroo objeto1, Perroo objeto2) -> objeto1.getNombre().compareTo(objeto2.getNombre()));
            for (Perroo aux : mascota) {
                System.out.println(aux.toString());
            }
        }
    }
}
