package Servicio;

import Persona.Persona;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(Persona objeto) {
        System.out.println("Ingrese nombre y apellido");
        objeto.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        objeto.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese sexo");
            leer.nextLine();
            objeto.setSexo(leer.nextLine());
        } while (!(objeto.getSexo().equalsIgnoreCase("H")) && !(objeto.getSexo().equalsIgnoreCase("M")) && !(objeto.getSexo().equalsIgnoreCase("O")));
        System.out.println("Ingrese el peso");
        objeto.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura");
        objeto.setAltura(leer.nextDouble());
    }

    public int calcularIMC(Persona objeto) {
        double imc = objeto.getPeso()/(Math.pow(objeto.getAltura(), 2));
        if (imc < 20){
            System.out.println("Estas por debajo de tu peso");
            return -1;
        }
        else if (imc >= 20 && imc <= 25){
            System.out.println("Estas en tu pedo ideal");
            return 0;
        }
        else 
            System.out.println("QUE GORDO SOS");
        return 1;
    }

    public boolean esMayorDeEdad(Persona objeto) {
        int mayor = objeto.getEdad();
        if (mayor < 18){
            System.out.println("Menor");
            return false;
        }
        else 
            System.out.println("Mayor");
        return true;
    }
}
