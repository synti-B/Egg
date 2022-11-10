/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.ejercicio1;

/**
 *
 * @author Synti
 */
public class Gato  extends Animal{

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Gato() {
    }

    @Override
    public void alimentarse() {
         System.out.println("******Gato******");
         System.out.println(" ");
        super.alimentarse(); 
        System.out.println(" ");
    }

   
    
}
