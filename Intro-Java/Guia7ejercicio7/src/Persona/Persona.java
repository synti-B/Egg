package Persona;

public class Persona {

    public String nombre;
    public int edad;
    public String sexo;
    public double peso;
    public double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, double peso, double altura, String sexo ) {
        this.nombre = nombre;
        this.edad = edad;
       
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

   
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
