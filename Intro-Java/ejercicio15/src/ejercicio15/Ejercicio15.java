package ejercicio15;
import java.util.Arrays;
import java.util.*;
/**
 * @author Cinthia
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Integer[] arreglo = new Integer[100];

        for (int i = 0; i <= 99; i++) {
            arreglo[i] = i + 1;

        }
        
          /*Con Arrays.sort podemos ordenar arrays de cualquier tipo de datos.*/
                Arrays.sort(arreglo, Collections.reverseOrder());

        System.out.println(Arrays.toString(arreglo));
    }

}
