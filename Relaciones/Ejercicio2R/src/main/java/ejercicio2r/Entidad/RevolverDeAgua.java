package ejercicio2r.Entidad;

import java.util.Objects;

/**
 *
 * @author Synti
 */
public class RevolverDeAgua {

    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionAgua = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {
        boolean igual = false;
        if (Objects.equals(posicionActual, posicionAgua)) {
            igual = true;
        }
        return igual;
    }
public void siguienteChorro(){
if(posicionActual== 6){
posicionActual=1;
}else
    posicionActual++;
}
    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
}
