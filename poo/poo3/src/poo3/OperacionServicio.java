package poo3;
import java.util.Scanner;
/**
 * @author Cinthia
 */
public class OperacionServicio {
   Scanner leer = new Scanner(System.in);
   Operacion ope= new Operacion();
   int suma,resta,multiplicacion,division;
    public Operacion crearOperacion(){
        System.out.println("Ingrese un numero entero");
        ope.setNumero1(leer.nextInt());
        System.out.println("Ingrese otro numero entero");
        ope.setNumero2(leer.nextInt());
        return ope;
    }
    public int suma(){
     suma= ope.getNumero1()+ope.getNumero2();
     return suma;
    }
    public int resta(){
    resta= ope.getNumero1()-ope.getNumero2();
    return resta;
    }
    public int multiplicacion(){
        if(ope.getNumero1()!=0&ope.getNumero2()!=0){
        multiplicacion=ope.getNumero1()*ope.getNumero2();
        return multiplicacion;
        }else{
            System.out.println("El resultado da cero, debido a que ingreso un numero igual a 0");
            return 0;
        }
        
    }
    public int division(){
        if(ope.getNumero2()!=0){
        division= ope.getNumero1()/ope.getNumero2();
        return division;
        }
        else{
            System.out.println("Error no se puede dividir por 0");
            return 0;
        }
    }
    
    public void mostrar(){
        System.out.println("La suma de los numero ingresado es: "+suma());
        System.out.println("La resta de los numero ingresados es: "+resta());
        System.out.println("La multiplicación de los numeros ingresados es: "+multiplicacion());
        System.out.println("La división de los numeros ingresados es: "+division());
        
    }
}
