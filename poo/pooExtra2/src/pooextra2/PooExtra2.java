package pooextra2;
/**
 * @author Cinthia
 */
public class PooExtra2 {

    public static void main(String[] args) {
        PuntosServicio ps= new PuntosServicio();
        Puntos p= ps.crearPuntos();
        ps.calcularDevolver(p);// valores por el usuario Punto B
        System.out.println(p.toString());
    }
    
}
