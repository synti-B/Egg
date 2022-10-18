package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class TiendaServicio {

    HashMap<String, Tienda> productos = new HashMap<>();
    Tienda t = new Tienda();
    String opc = " ";
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearProducto() {
        do {
            System.out.println("Ingrese el nombre del producto");
            t.setNombreProducto(leer.next().toUpperCase());
            System.out.println("Ingrese el precio del producto");
            t.setPrecio(leer.nextDouble());
            productos.put(t.getNombreProducto(), new Tienda(t.getNombreProducto(), t.getPrecio()));
            System.out.println("Desea continuar S/N");
            opc = leer.next();
            opc = opc.toUpperCase();
        } while (opc.equals("S"));
    }

    public void modificaPrecio() {
        System.out.println("Introduce el nombre del producto del que quieres cambiar el precio:");
        String nombre = leer.next().toUpperCase();
               if (productos.containsKey(nombre) ){
                System.out.println("Introduce el precio del producto:");
                //t.setPrecio(leer.nextDouble());
                productos.put(nombre, new Tienda(nombre,leer.nextDouble()));
            } else {
                System.out.println("No hay ningun producto con ese nombre.");
            }
        }
    

    public void imprimirTodos() {
        // entry.getKey trae la llave y entry.getValue trae los valores del mapa, Es decir todos sus atributos
        productos.entrySet().forEach((entry) -> {
            System.out.println("Nombre = " + entry.getKey() + ", Precio: " + entry.getValue());
        });
    }

    public void eliminaProducto() {
        System.out.println("Ingrese nombre del producto que desea eliminar");
        String nombre= leer.next().toUpperCase();
        if (productos.containsKey(t.getNombreProducto())) {
            productos.remove(nombre);
        } else {
            System.out.println("No hay ningun producto con ese nombre.");
        }
    }
}
