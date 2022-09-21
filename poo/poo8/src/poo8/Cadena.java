package poo8;
/**
 * @author Cinthia
 */
public class Cadena {
public String Cadena;
    public int longitud;
    public Cadena(String Cadena, int longitud) {
        this.Cadena = Cadena;
        this.longitud = longitud;
    }
     public Cadena() {
        
    }

    public String getCadena() {
        return Cadena;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    @Override
    public String toString() {
        return "Cadena{" + "Cadena=" + Cadena + ", Longitud="+ longitud +'}';
    }
     
}
