package poo12;

import java.util.Date;

/**
 * * @author Cinthia
 */
public class Poo12 {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p = ps.crearPersona();        
        Date fechaNacimiento2 = new Date(1990,9,9);  
        Persona p2= new Persona("pepe",fechaNacimiento2);        
        ps.calcularEdad(p);
        Date hoy = new Date();
        int edad = hoy.getYear() - p2.getFechaNacimiento().getYear();
        
        if(ps.menorQue(edad, p)){
            System.out.println("La persona ingresada por teclado es menor");
        }else {
            System.out.println("La persona que recibe por parametro es menor");
        }
        ps.mostrarPersona(p);
        ps.mostrarPersona(p2);
    }

}
