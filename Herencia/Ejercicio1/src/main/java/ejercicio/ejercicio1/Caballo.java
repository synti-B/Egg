/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.ejercicio1;

/**
 *
 * @author Synti
 */
public class Caballo  extends Animal {

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Caballo() {
    }

    @Override
    public void alimentarse() {
         System.out.println("*****Caballo******");
         System.out.println(" ");
        super.alimentarse(); 
        System.out.println(" ");
    }

   
}
