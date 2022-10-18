package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class PaisServicio {

    HashSet<Pais> pais = new HashSet();
    Pais p = new Pais();
    String opc = " ";
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPais() {
        do {
            System.out.println("Ingrese el pais");
            p.setPais(leer.next());
            pais.add(new Pais(p.getPais()));
            System.out.println("Desea continuar S/N");
            opc = leer.next();
            opc = opc.toUpperCase();
        } while (opc.equals("S"));
    }

    public void mostrarPaises() {
        System.out.println("Paises");
        pais.forEach((aux) -> {
            System.out.println(aux.toString().toUpperCase());
        });
        System.out.println("cantidad = " + pais.size());
    }

    public void ordenAlfabeticoPais() {
        ArrayList<Pais> paiss = new ArrayList<>(pais);
        System.out.println(" ");
        System.out.println("********************************* Pais ordenadas Alfabeticamente *********************************");
        Collections.sort(paiss, (Pais objeto1, Pais objeto2) -> objeto1.getPais().compareTo(objeto2.getPais()));
        paiss.forEach((aux) -> {
            System.out.println(aux.toString().toUpperCase());
        });
        System.out.println(" ");
    }
   

    public void buscarEliminar() {
        System.out.println("Ingrese el pais que busca: ");
        String paisBuscado = leer.next();
        boolean vali = false;
        Iterator<Pais> it = pais.iterator();

        while (it.hasNext()) {

            if (it.next().getPais().equals(paisBuscado)) {
                vali = true;
                System.out.println("Se encontro");
                it.remove();
                System.out.println("****** PAIS ELIMINADA *******");
                System.out.println(" ");
                System.out.println(" ASI QUEDO LA NUEVA LISTA DE LOS PAISES");
                System.out.println(" ");

                pais.forEach((aux) -> {
                    System.out.println(aux.toString().toUpperCase());
                });

            }
        }
        if (vali == false) {
            System.out.println("NO se encontro a el perro");
            System.out.println(" ");
            System.out.println(" LISTA DE Paises");
            System.out.println(" ");
            pais.forEach((aux) -> {
                System.out.println(aux.toString());
            });
        }
    }

}
