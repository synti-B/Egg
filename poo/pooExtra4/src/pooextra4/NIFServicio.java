package pooextra4;

import java.util.Scanner;

/**
 * @author Cinthia
 */
public class NIFServicio {

    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
        'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    Scanner leer = new Scanner(System.in);

    public NIF crearNif() {
        NIF n = new NIF();
        System.out.print("\nIngrese su numero de DNI: ");
        n.setDni(leer.nextLong());
        int calculo = (int) (n.getDni() % 23);
        if (calculo > 0 && calculo < 22) {
            for (int i = 0; i <= 22; i++) {
                if (calculo == i) {
                    n.setLetra(letras[i]);
                }
            }
        }
        return n;
    }

    public void mostrar(NIF n) {
        System.out.println(n.getDni());
        System.out.println("\n*****************NIF*****************");
        System.out.print(n.getDni() + "-" + n.getLetra() + "\n");
    }
}
