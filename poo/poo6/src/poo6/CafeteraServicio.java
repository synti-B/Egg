package poo6;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        Cafetera c = new Cafetera();
        do{ 
            System.out.println("Ingrese liquido para llenar la cafetera");
            int cafe = leer.nextInt();
            if((cafe+c.getCantidadActual())>c.getCapacidadMaxima()){
                System.out.println("Supero el limite de capacidad");
            }else{agregarCafe(cafe, c);}
            
        }while (c.getCantidadActual() < c.getCapacidadMaxima()) ;
        return c;
    }

    public void servirTaza(int tamañoTaza, Cafetera c) {
        if (c.getCantidadActual() != 0) {
            if (tamañoTaza <= c.getCantidadActual()) {
                c.setCantidadActual(c.getCantidadActual() - tamañoTaza);
                System.out.println("Se lleno la taza! :) , la cantidad de cafe que quedo en la jarra es: "+c.getCantidadActual());
                          
            } else {
                if (c.getCantidadActual() < tamañoTaza) {
                System.out.println("No se lleno la taza, la cantidad de cafe que tiene la misma es " + c.getCantidadActual());
                vaciarCafetera(c);
            }
            }
        }
        
    }

    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
        System.out.println("La cafetera Quedo Vacia");
    }

    public void agregarCafe(int cafe, Cafetera c) {        
            c.setCantidadActual(c.getCantidadActual() + cafe);
            System.out.println("***Cantidad actual de cafe***" + c.getCantidadActual());
        

    }
}
