package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Synti
 */
public class Perroo {
    String nombre;
    String raza;

    public Perroo() {
    }

    public Perroo(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perroo{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }

    
}
