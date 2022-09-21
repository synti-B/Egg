package poo9;

/**
 * @author Cinthia
 */
public class Poo9 {

    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica m = new Matematica();
        m.setNumero1( Math.floor(Math.random()*20+1));
        m.setNumero2( Math.floor(Math.random()*20+1));
        System.out.println("LO NUMEROS SON: ");
        System.out.println(m.getNumero1());
        System.out.println(m.getNumero2());
        System.out.println(" ");
        System.out.print("El mayor de los numeros es: ");
        ms.devolverMayor(m);
        System.out.println(" ");
        System.out.print("La potencia del mayor numero es: ");
        ms.calcularPotencia(m);
        System.out.println(" ");
        System.out.print("La raiz cuadrada del menor numero es: ");
        ms.calculaRaiz(m);
        
    }

}
