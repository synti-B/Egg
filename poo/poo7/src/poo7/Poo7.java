package poo7;

/**
 *
 * @author Cinthia
 */
public class Poo7 {

    public static void main(String[] args) {

        int contaMayor = 0;
        int contaMenor = 0;
        int pesoIdeal = 0;
        int bajoPeso = 0;
        int sobrePeso = 0;
        double porcentaje = 0;
        PersonaServicio ps = new PersonaServicio();
        Persona[] vectorP = new Persona[4];
        for (int i = 0; i < 4; i++) {
            int retornoIMC;
            Persona personas = new Persona();
            ps.crearPersona(personas);

            retornoIMC = ps.calcularIMC(personas);
            if (retornoIMC == -1) {
                System.out.println(personas.getNombre() + " esta por debajo de su peso ideal.");
                bajoPeso++;
            } else if (retornoIMC == 0) {
                System.out.println(personas.getNombre() + " esta en su peso ideal.");
                pesoIdeal++;
            } else {
                System.out.println(personas.getNombre() + " tiene sobrepreso.");
                sobrePeso++;
            }

            if (ps.esMayorDeEdad(personas)) {
                System.out.println(personas.getNombre() + " es mayor de edad.");
                contaMayor++;
            } else {
                System.out.println(personas.getNombre() + " es menor de edad.");
                contaMenor++;
            }

            vectorP[i] = personas;
        }

        porcentaje = (contaMayor * 100) / 4;
        System.out.println("Porcentaje mayores " + Double.toString(porcentaje));
        porcentaje = (contaMenor * 100) / 4;
        System.out.println("Porcentaje menores " + Double.toString(porcentaje));
        porcentaje = (pesoIdeal * 100) / 4;
        System.out.println("Porcentaje en peso ideal " + Double.toString(porcentaje));
        porcentaje = (bajoPeso * 100) / 4;
        System.out.println("Porcentaje en sobre el ideal " + Double.toString(porcentaje));
        porcentaje = (sobrePeso * 100) / 4;
        System.out.println("Porcentaje en debajo peso ideal " + Double.toString(porcentaje));

        for (int i = 0; i < 4; i++) {
            System.out.println(vectorP[i].toString());
        }

    }
}
