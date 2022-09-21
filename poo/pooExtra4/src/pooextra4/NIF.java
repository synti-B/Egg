package pooextra4;
/**
 * @author Cinthia
 */
public class NIF {
    public long dni;
    public char letra;

    public NIF(long dni,char letra) {
        this.dni = dni;
        this.letra = letra;
    }
      public NIF() {
       
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

         
}
