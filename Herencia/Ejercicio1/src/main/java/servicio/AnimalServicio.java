package servicio;

import ejercicio.ejercicio1.Animal;

/**
 *
 * @author Synti
 */
public class AnimalServicio {

    public AnimalServicio() {
    }
       public void alimentarse( Animal as){
             
        System.out.println("Se alimenta de: "+as.getAlimento()); 
    }
}
