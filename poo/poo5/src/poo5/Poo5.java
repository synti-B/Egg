package poo5;

import java.util.Scanner;

/**
 * @author Cinthia
 */
public class Poo5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio();
        Cuenta c =  cs.crearCuenta();
        cs.consultarDatos(c);
        cs.consultarSaldo(c);
        cs.extraccionRapida(c);
        System.out.println("Ingrese monto que desea depositar ");
        double deposito = leer.nextDouble();
        cs.ingresar(c, deposito);
        System.out.println("Ingrese el monto que desea extraer ");
        double extraer = leer.nextDouble();
        cs.retirar(c, extraer);

    }

}
