
package extra1;

import java.util.Scanner;

/**
 * @author Cinthia
 */
public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia;
        int hora;
        int segundo=0;
        System.out.println("Ingrese un valor en minutos");
        int minuto = leer.nextInt();
        dia=minuto/1440;
        hora=minuto/60;
        if(hora<=24){
             System.out.println("en dia son "+hora);
        }else{
            
        }
       
    }
    
}
