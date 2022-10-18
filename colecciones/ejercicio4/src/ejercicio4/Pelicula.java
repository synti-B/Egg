package ejercicio4;

/**
 *
 * @author Synti
 */
public class Pelicula {
    String titulo;
    String director;
    Double duracionxhs;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracionxhs) {
        this.titulo = titulo;
        this.director = director;
        this.duracionxhs = duracionxhs;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracionxhs() {
        return duracionxhs;
    }

    public void setDuracionxhs(Double duracionxhs) {
        this.duracionxhs = duracionxhs;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionxhs=" + duracionxhs + '}';
    }
}
