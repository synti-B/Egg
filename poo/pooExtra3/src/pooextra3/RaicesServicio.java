package pooextra3;

/**
 *
 * @author Cinthia
 */
public class RaicesServicio {

    Raices r = new Raices();

    public boolean tieneRaices(Raices r) {
        return r.getDiscriminante() >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        return r.getDiscriminante() == 0;
    }

    public void obtenerRaices(Raices r) {

        double x1 = (-r.getB() + Math.sqrt(r.getDiscriminante())) / (2 * r.getA());
        double x2 = (-r.getB() - Math.sqrt(r.getDiscriminante())) / (2 * r.getA());
        System.out.println("\n****Las dos posibles soluciones son: ****\n");
        System.out.print("Primera solucion: " + x1);
        System.out.println(" ");
        System.out.print("Segunda solucion: " + x2+"\n");

    }

    public void obtenerRaiz(Raices r) {
        double x = (-r.getB()) / (2 * r.getA());
        System.out.print("Una unica solucion: " + x);
    }

    public void calcular(Raices r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        }else{
            System.out.println("No tiene solucion");
        }
    }
}
