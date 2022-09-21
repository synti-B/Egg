package pooextra3;

/**
 * @author Cinthia
 */
public class PooExtra3 {

    public static void main(String[] args) {
        Raices r = new Raices(2, 0,-32);
        RaicesServicio rs = new RaicesServicio();
        System.out.println(r.toString());
        rs.calcular(r);
    }

}
