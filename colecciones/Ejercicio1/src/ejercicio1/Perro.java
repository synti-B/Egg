package ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Perro {

    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razaPerro = new ArrayList();
        String opc;
       
        do {
            System.out.println("Ingrese la raza del perro");
            String raza = leer.next();
            razaPerro.add(raza);
            System.out.println("Desea continuar S/N");
            opc = leer.next();
            
          
        } while(opc.equals("S"));
          for (String aux : razaPerro) {
              System.out.println("***** Perros Guardados *****");
                System.out.println(aux);
            }
    }
}
