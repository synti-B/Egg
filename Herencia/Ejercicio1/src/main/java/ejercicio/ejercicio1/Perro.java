/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.ejercicio1;

/**
 *
 * @author Synti
 */
public class Perro extends Animal  {

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
    }

    @Override
    public void alimentarse() {
        System.out.println("******Perro*******");
        System.out.println(" ");
        super.alimentarse();
        System.out.println(" ");
        
    }

 
    
}
