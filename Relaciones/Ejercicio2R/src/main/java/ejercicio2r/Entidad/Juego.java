package ejercicio2r.Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Synti
 */
public class Juego {

    private RevolverDeAgua r;
    private List<Jugador> jugadores;

    public Juego() {
    }

    public Juego(RevolverDeAgua r, List<Jugador> jugadores) {
        this.r = r;
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getR() {
        return r;
    }

    public void setR(RevolverDeAgua r) {
        this.r = r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores2, RevolverDeAgua r2) {
        jugadores = jugadores2;
        r = r2;
    }

    public boolean ronda(int i) {
        boolean juegoSigue = true;
        jugadores.get(i).disparo(r);
        if (jugadores.get(i).isMojado()) {
            juegoSigue = false;
        }
        return juegoSigue;
    }

    @Override
    public String toString() {
        return "Juego{" + "r=" + r + ", jugadores=" + jugadores + '}';
    }

}
