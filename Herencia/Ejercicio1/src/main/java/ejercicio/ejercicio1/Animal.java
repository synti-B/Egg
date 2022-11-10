package ejercicio.ejercicio1;

/**
 *
 * @author Synti
 */
public class Animal {
    String nombre;
    String alimento;
    int edad;
    String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
  public void alimentarse(){
      System.out.println("Se alimenta de: "+alimento );
  }
    @Override
    public String toString() {
        return "Animal { " + " nombre = " + nombre + ", alimento = " + alimento + ", edad = " + edad + ", raza = " + raza + '}';
    }

    
    
}
