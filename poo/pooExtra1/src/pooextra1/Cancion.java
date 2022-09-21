package pooextra1;

/**
 *
 * @author Cinthia
 */
public class Cancion {

    public String titulo;
    public String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        this.titulo = " ";
        this.autor = " ";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + " titulo= " + titulo + ", autor= " + autor + '}';
    }

}
