
package pooextra6;
/**
 * @author Cinthia
 */
public class Ahorcado {
    String[] palabra;
    int letrasEncontradas;
    int cantidadJugadasMax;

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadasMax() {
        return cantidadJugadasMax;
    }

    public void setCantidadJugadasMax(int cantidadJugadasMax) {
        this.cantidadJugadasMax = cantidadJugadasMax;
    }

    public Ahorcado(int letrasEncontradas, int cantidadJugadasMax) {
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadasMax = cantidadJugadasMax;
    }
    public Ahorcado() {
        
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = new String [20];
    }

    @Override
    public String toString() {
        
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", cantidadJugadasMax=" + cantidadJugadasMax + '}';
    }

    
    
}
