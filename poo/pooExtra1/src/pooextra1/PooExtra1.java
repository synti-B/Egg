
package pooextra1;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class PooExtra1 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         Cancion c = new Cancion();
         System.out.println("Ingrese el titulo de la cancion");
         c.setTitulo(entrada.nextLine());
         System.out.println("Ingrese el autor");
         c.setAutor(entrada.nextLine());
         System.out.println(c.toString());
    }
    
}
