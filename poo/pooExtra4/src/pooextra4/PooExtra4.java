package pooextra4;

/**
 * @author Cinthia
 */
public class PooExtra4 {

    public static void main(String[] args) {
        NIFServicio nf = new NIFServicio();
        NIF n = nf.crearNif();

        nf.mostrar(n);
    }

}
