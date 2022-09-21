package poo;
/**
 * @author Cinthia
 */
public class Poo {

    public static void main(String[] args) {
        Libro lib = new Libro();
        LibroServicio libSer= new LibroServicio();
        libSer.crearLibro();
        libSer.mostrarLibro();
        
    }

    

}
