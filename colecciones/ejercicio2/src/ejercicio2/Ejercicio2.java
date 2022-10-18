package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroServicio ps = new PerroServicio();
        ps.crearPerroo();
        ps.mostrarMascota();
        System.out.println("Ingrese el nombre del perro que desea buscar");
        String bucarp = leer.next();
        ps.buscarEliminar(bucarp);

    }
}
