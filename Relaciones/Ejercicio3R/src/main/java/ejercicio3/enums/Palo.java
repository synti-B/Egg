package ejercicio3.enums;

/**
 *Un enumerado (o Enum) es una clase "especial" (tanto en Java como en otros lenguajes) que limitan la creación de objetos  a los 
 * especificados explícitamente en la implementación de la clase. La única limitación que tienen los enumerados respecto a una clase 
 * normal es que si tiene constructor, este debe de ser privado para que no se puedan crear nuevos objetos.
 * @author Synti
 */
public enum Palo {
     ESPADA("Espada"), BASTO("Basto"), ORO("Oro"), COPA("Copa");
     private String nombre;

    private Palo() {
    }

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
