
package poo;

/**
 * @author Cinthia
 */
public class Libro {
   public int ISBN;
   public String titulo;
   public String autor;
   public int Npagina;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getNpagina() {
        return Npagina;
    }

    public void setNpagina(int Npagina) {
        this.Npagina = Npagina;
    }

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int Npagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.Npagina = Npagina;
    }
    
}
     