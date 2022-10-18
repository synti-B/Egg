package ejercicio4;

/**
 *
 * @author Synti
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio ps= new PeliculaServicio();
        ps.CrearAlumno();
        ps.mostrar();
        ps.mostrarPeliMasUnaHs();
        ps.menorAmayor();
        ps.mayorAmenor();
        ps.ordenAlfabeticoTitulo();
        ps.ordenAlfabeticoDirector();
    }
    
}
