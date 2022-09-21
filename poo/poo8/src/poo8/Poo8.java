package poo8;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class Poo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio cs = new CadenaServicio();
        Cadena c = new Cadena();
        System.out.println("------------------------------------------");
        System.out.print("Ingrese la frase: ");
        c.setCadena(leer.nextLine());
        c.setLongitud(c.getCadena().length());
        System.out.println("------------------------------------------");
        System.out.print("Cantidad de vocales: ");
        cs.mostrarVocales(c);
        System.out.println("------------------------------------------");
        System.out.print("Frase invertida: ");
        cs.invertirFrase(c);
        System.out.println("------------------------------------------");
        System.out.print("Ingrese letra para saber si se repite:  ");
        String letra = leer.nextLine();
        cs.vecesRepetido(letra, c);
        System.out.println("------------------------------------------");
        System.out.print("Ingrese una nueva frase: ");
        String frase2 = leer.nextLine();
        cs.compararLongitud(frase2, c);
        System.out.println("------------------------------------------");
        System.out.println("Frases unidas");
        cs.unirFrases(frase2, c);
        System.out.println("------------------------------------------");
        System.out.print("Ingrese el caracter que reemplazará a la letra a: ");
        String nuevaLetra = leer.nextLine();
        cs.reemplazar(nuevaLetra, c);
        System.out.println("------------------------------------------");
        System.out.print("Ingrese la letra que desea buscar dentro de la frase: ");
        char buscarLetra = leer.next().charAt(0);
        if (cs.contiene(buscarLetra, c)) {
            System.out.println("Se encontro la letra");
        } else {
            System.out.println("No se encontro la letra");
        }
    }

}
