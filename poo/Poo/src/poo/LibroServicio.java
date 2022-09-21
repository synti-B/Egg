
package poo;
/**
 * * @author Cinthia
 */
import java.util.Scanner;
public class LibroServicio {
      Scanner leer = new Scanner(System.in);
      Libro lib= new Libro();
      public Libro crearLibro(){
          
          System.out.println("Ingrese ISBN");
          lib.setISBN(leer.nextInt());
          System.out.println("Ingrese Título");
          lib.setTitulo(leer.next());          
          System.out.println("Ingrese Autor ");
          lib.setAutor(leer.next());
          System.out.println("Ingrese cantidad de página");
          lib.setNpagina(leer.nextInt());
          
          return lib;
      }
      public void mostrarLibro(){
          System.out.println("El numero de ISBN es: "+lib.getISBN());
          System.out.println("El titulo del libro es: "+lib.getTitulo());
          System.out.println("El autor del libro es: "+lib.getAutor());
          System.out.println("La cantidad de paginas que tiene el libro es: "+lib.getNpagina());
      }

   
}
