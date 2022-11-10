package ejercicio3;

import ejercicio3.Servicio.CartaBarajaServicio;

/**
 *
 * @author Synti
 */
public class Ejercicio3R {

    public static void main(String[] args) {
        CartaBarajaServicio bs = new CartaBarajaServicio();
        
        bs.crearBaraja();
        bs.menu();
    }
}
