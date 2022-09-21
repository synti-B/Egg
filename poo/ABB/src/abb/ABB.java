//Nombre: Nombre del alumno 
//Legajo: INFXXXXX 
//DNI: XXXXXXXX  
//Clase Nodo de un ABB 
package abb;

/**
 *
 * @author Cinthia
 */
public class ABB {

    class Nodo {

        int clave;
        Nodo izquierda, derecha;

        public Nodo(int data) {
            clave = data;
            izquierda = derecha = null;
        }
    }
    // Nodo raiz, dato referencial  
    Nodo raiz;

    // Constructor de  ABB => se inicializa como arbol vacío 
    ABB() {
        raiz = null;
    }

    //Borrar un Nodo de un árbol ABB 
    void borrarClave(int clave) {
        raiz = borrar_Recursivo(raiz, clave);
    }

    //Borrado recursivo 
    Nodo borrar_Recursivo(Nodo raiz, int clave) {
        //Si el Arbol está vacio 
        if (raiz == null) {
            return raiz;
        }

        //Recorrer el árbol 
        if (clave < raiz.clave) //Recorrer el sub árbol izquierdo  
        {
            raiz.izquierda = borrar_Recursivo(raiz.izquierda, clave);
        } else if (clave > raiz.clave) //Recorrer el sub árbol derecho 
        {
            raiz.derecha = borrar_Recursivo(raiz.derecha, clave);
        } else {
            // El nodo contiene solo un hijo 
            if (raiz.izquierda == null) {
                return raiz.derecha;
            } else if (raiz.derecha == null) {
                return raiz.izquierda;
            }

            // El Nodo Tiene 2 hijos;  
            //Obtener el sucesor inorder (Valor mínimo del subarbol derecho)  
            raiz.clave = ValorMinimo(raiz.derecha);

            // Borrar el sucesor inorder  
            raiz.derecha = borrar_Recursivo(raiz.derecha, raiz.clave);
        }
        return raiz;
    }
//devolve el Valor mínimo del subarbol derecho  

    int ValorMinimo(Nodo raiz) {
        //se guarda el nodo raiz en una nueva variable
        int vMinimo = raiz.clave;
      //mientras subarbol izq es distinto de null(tengas hijos) se toma su hijo izq para seguir recorriendo en el caso que no se devuelve el menor
        while (raiz.izquierda != null) {
            vMinimo = raiz.izquierda.clave;
            raiz = raiz.izquierda;
        }
        return vMinimo;
    }

    // Insertar Nodo en ABB  
    void insertar(int clave) {
        raiz = insertar_Recursivo(raiz, clave);
    }

    //Funcion recursiva de inserción 
    Nodo insertar_Recursivo(Nodo raiz, int clave) {
        // si la raiz es igual a null, devulve un nuevo nodo
        if (raiz == null) {
            return new Nodo(clave);
        }
        // consulta si clave es menor al nodo raiz, en el caso que "si" va para el subarbol izq, sino el derecho
        if (clave < raiz.clave) {
            raiz.izquierda = insertar_Recursivo(raiz.izquierda, clave);
        } else {
            raiz.derecha = insertar_Recursivo(raiz.derecha, clave);
        }
        return raiz;
    }

// Método de recorrido inroder para ABB  
    void inorder() {
        inorder_Recursive(raiz);
    }

    // recorrido inorder recursivo ABB   
    void inorder_Recursive(Nodo raiz) {
        if (raiz != null) {
            inorder_Recursive(raiz.izquierda);
            System.out.print(raiz.clave + " ");
            inorder_Recursive(raiz.derecha);
        }
    }

    boolean buscar(int clave) {
        raiz = buscar_Recursivo(raiz, clave);
        return raiz != null;
    }

    //busqueda recursiva 
    Nodo buscar_Recursivo(Nodo raiz, int clave) {
        // Caso Base raiz es null o la clave esta presente como raiz   
        if (raiz == null || raiz.clave == clave) {
            return raiz;
        }
        // val is greater than raiz's clave  
        if (raiz.clave > clave) {
            return buscar_Recursivo(raiz.izquierda, clave);
        }
        // val is less than raiz's clave  
        return buscar_Recursivo(raiz.derecha, clave);
    }

}
