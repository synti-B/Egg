package poo5;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in);  

    public Cuenta crearCuenta() {
        Cuenta c=new Cuenta();
        System.out.println("Ingrese nombre");
        c.setNombre(leer.nextLine());
        System.out.println("Ingrese apellido");
        c.setApellido(leer.nextLine());
        System.out.println("Ingrese numero de DNI");
        c.setDni(leer.nextLong());
        System.out.println("Ingrese saldo inicial a depositar");
        c.setSaldoActual(leer.nextDouble());
        return c;
    }

    public void ingresar(Cuenta c,double ingreso) {
        c.setSaldoActual( c.getSaldoActual() + ingreso);
        System.out.println("su saldo actual es: "+c.getSaldoActual());
    }

    public void retirar(Cuenta c,double retiro) {
             if (c.getSaldoActual() >= retiro) {
                  c.setSaldoActual( c.getSaldoActual() - retiro);
                 System.out.println("su saldo actual es: "+c.getSaldoActual());
        } else {
            System.out.println("NO hay saldo sufiente, el monto que tiene disponible para retirar es: " + c.getSaldoActual());
        }
        
    }

    public double extraccionRapida(Cuenta c) {
        double saldoRapido;
        saldoRapido = c.getSaldoActual() * 0.20;
        System.out.println("El monto que puede sacar con la extraccion rapida " + saldoRapido);
        return saldoRapido;
    }

    public void consultarSaldo(Cuenta c) {
        System.out.println("Su saldo es " + c.getSaldoActual());
    }

    public void consultarDatos(Cuenta c) {
        System.out.println("***********Datos personales******************");
        System.out.println("Nombre y apellido: " + c.getNombre() + " " + c.getApellido());
        System.out.println("Numero de DNI: " + c.getDni());
        System.out.println("Numero de cuenta: " + c.getNumeroCuenta());
    }
}
