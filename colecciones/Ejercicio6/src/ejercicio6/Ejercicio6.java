package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiendaServicio ts = new TiendaServicio();
        int opcionElegida = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (opcionElegida != 5) {
            System.out.println("Introduce el numero de la opción que quieras:");
            System.out.println("1.- Introducir producto");
            System.out.println("2.- Modificar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            opcionElegida = leer.nextInt();

            switch (opcionElegida) {
                case 1:
                    ts.crearProducto();
                    break;
                case 2:
                    ts.modificaPrecio();
                    break;
                case 3:
                    ts.imprimirTodos();
                    break;
                case 4:
                    ts.eliminaProducto();
                    break;
                case 5:
                    break;   // Si la opcion es 5 no se hace nada 
                default:
                    System.out.println("Tienes que introducir una opción valida");
            }

        }
    }

}
