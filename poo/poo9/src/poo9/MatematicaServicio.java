package poo9;

/**
 *
 * @author Cinthia
 */
public class MatematicaServicio {

    public void devolverMayor(Matematica m) {

        if (m.getNumero1() > m.getNumero2()) {

            System.out.println((double) m.getNumero1()); 
        } else {
            System.out.println((double) m.getNumero2()); 

        }
    }

    public void calcularPotencia(Matematica m) {

        if (m.getNumero1() > m.getNumero2()) {
            double resultado = Math.pow(Math.round(m.getNumero1()), (Math.round(m.getNumero2())));
            System.out.println(resultado); 

        } else {
            double resultado = Math.pow(Math.round(m.getNumero2()), (Math.round(m.getNumero1())));
            System.out.println(resultado); 
        }
    }

    public void calculaRaiz(Matematica m) {
        double valorAbs, calculo = 0;
        if (m.getNumero1() < m.getNumero2()) {
            valorAbs = Math.abs(m.getNumero1());
            calculo = Math.pow(valorAbs, 2);
            System.out.println("La raiz cuadrada es: " + calculo);
        } else {
            valorAbs = Math.abs(m.getNumero2());
            calculo = Math.pow(valorAbs, 2);
            System.out.println("La raiz cuadrada es: " + calculo);
        }
    }
}
