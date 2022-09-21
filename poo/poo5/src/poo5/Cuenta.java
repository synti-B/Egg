package poo5;
/**
 * @author Cinthia
 */
public class Cuenta {
    public int numeroCuenta;
    public long dni;
    public double saldoActual;
    public String nombre;
    public String apellido;
    
    public Cuenta(int numeroCuenta, long dni, double saldoActual, String nombre, String apellido) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.nombre = nombre;
        this.apellido = apellido;
       
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Cuenta(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }
     public Cuenta() {
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta+1;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
             if(saldoActual <=0){
            System.out.println("El ingreso debe ser superior a cero ");
        
        }
        else{
                 this.saldoActual = saldoActual;}
        
    }

    
     
}
