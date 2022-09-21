package poo12;
import java.util.Date;
/**
 * @author Cinthia
 */
public class Persona {
    public String nombre;
    Date fechaNacimiento;
    
    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
     public Persona() {        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento=fechaNacimiento ;
        
    }

    @Override
    public String toString() {
        return "Persona{" + " nombre = " + nombre + ", fechaNacimiento = " + fechaNacimiento.getDate() + " Mes: " + fechaNacimiento.getMonth()+ " Año: " + fechaNacimiento.getYear();
    }
      
    
}
