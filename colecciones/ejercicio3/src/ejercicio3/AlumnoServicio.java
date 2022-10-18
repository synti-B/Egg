package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Synti
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String opc = " ";
    ArrayList<Alumno> alu = new ArrayList<>();

    public void CrearAlumno() {
        int nota = 1;
        Alumno c = new Alumno();
        do {
            System.out.println("Ingrese el nombre del Alumno");
            c.setNombre(leer.next());
            System.out.println("Ingrese nota entre 0 y 10");
            for (int i = 0; i < 3; i++) {
                System.out.println("NOTA: " + (i + 1));
                do {
                    c.setNotas(leer.nextInt());
                } while (c.getNotas() < 0 || c.getNotas() > 10);
                alu.add(new Alumno(c.getNombre(), c.getNotas()));

            }

            System.out.println("Desea continuar S/N");
            opc = leer.next();
            opc = opc.toUpperCase();
        } while (opc.equals("S"));
    }

    public void buscarAlumno() {
        boolean vali = false;
        Iterator<Alumno> itA = alu.iterator();
        System.out.println("Ingrese el nombre del alumno que desea calcular el promedio");
        String nomBuscar = leer.next();
        while (itA.hasNext()) {

            if (itA.next().getNombre().equals(nomBuscar)) {
                vali = true;
            }
        }
        if (vali == true) {
            notaFinal(nomBuscar);
        }

    }

    public void notaFinal(String nomBuscar) {
        double promedio = 0;
        for (Alumno aux : alu) {
            if(aux.getNombre().equals(nomBuscar)){
            promedio += aux.getNotas();
            }
        }
        System.out.println("El promedio del alumno " + nomBuscar + "es: " + (promedio / 3));
    }

    public void mostrar() {
        System.out.println("*********************************ALUMNO*********************************");
        
        for (Alumno aux : alu) {

            System.out.println(aux.toString());

        }
    }
}
