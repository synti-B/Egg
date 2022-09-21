/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class PersonaServicio {

    public Persona crearPersona(Persona p) {
        Scanner leer = new Scanner(System.in);
        
              
        System.out.println("Ingrese Nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese edad");
        p.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese sexo");
             leer.nextLine();
             p.setSexo(leer.nextLine());
           
        }while (!(p.getSexo().equalsIgnoreCase("H")) && !(p.getSexo().equalsIgnoreCase("M")) && !(p.getSexo().equalsIgnoreCase("O")));
        System.out.println("Ingrese peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura");
        p.setAltura(leer.nextDouble());
        return p;
    }

    public int calcularIMC(Persona p) {
        double pesoIdeal;
        pesoIdeal = p.getPeso() / Math.pow((p.getAltura() / 100), 2);
        if (pesoIdeal < 20) {            
            return -1;
        }
        if (pesoIdeal >= 20 && pesoIdeal <= 25) {            
            return 0;
        }        
        return 1;
    }

    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }
}
