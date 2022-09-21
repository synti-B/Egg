package poo8;

/**
 * @author Cinthia
 */
public class CadenaServicio {

    int contadoVo = 0;
    String cadenaInvertida = " ";

    void mostrarVocales(Cadena c) {
        for (int x = 0; x < c.getCadena().length() - 1; x++) {
            if ((c.getCadena().charAt(x) == 'a') || (c.getCadena().charAt(x) == 'e') || (c.getCadena().charAt(x) == 'i') || (c.getCadena().charAt(x) == 'o') || (c.getCadena().charAt(x) == 'u')) {
                contadoVo++;
            }
        }
        System.out.println(contadoVo);
    }

    public void invertirFrase(Cadena c) {
        for (int x = c.getCadena().length() - 1; x >= 0; x--) {
            cadenaInvertida = cadenaInvertida + c.getCadena().charAt(x);
        }
        System.out.println(cadenaInvertida);
    }

    public void vecesRepetido(String letra, Cadena c) {
        int posicion, contador = 0;
        posicion = c.getCadena().indexOf(letra);
        while (posicion != -1) {
            contador++;
            posicion = c.getCadena().indexOf(letra, posicion + 1);
        }
        System.out.print("Cantidad de veces que se repite la letra: ");
        System.out.println(contador);
    }

    public void compararLongitud(String frase, Cadena c) {
        int longitudf2 = frase.length();
        if (longitudf2 == c.getLongitud()) {
            System.out.println("Ambas frases tiene la misma longitud");
        } else {
            System.out.println("Las frases No tienen la misma longitud");
        }

    }

    public void unirFrases(String frase, Cadena c) {
        String union = frase.concat(c.getCadena());
        System.out.println(union);
    }

    public void reemplazar(String letra, Cadena c) {
        String nuevaPalabra=" ";
        for (int x = 0; x < c.getCadena().length(); x++) {
            if (c.getCadena().charAt(x) == 'a') {
                nuevaPalabra = c.getCadena().replace("a", letra);
            }
        }
        System.out.println(nuevaPalabra);
    }

    public boolean contiene(char letra, Cadena c) {
        for (int x = 0; x < c.getCadena().length(); x++) {
            if (c.getCadena().charAt(x) == letra) {
                return true;
            }
        }
        return false;
    }
}
