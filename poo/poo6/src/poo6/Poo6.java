package poo6;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Poo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();        
        Cafetera c = cs.llenarCafetera();
        System.out.println("Ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        cs.servirTaza(taza, c);
        
        
    }

}
