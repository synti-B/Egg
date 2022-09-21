
package abb;

/**
 *
 * @author Cinthia
 */
public class ABBMain {
     public static void main(String[] args) {
        //Crear el objeto ABB 
        ABB ABB = new ABB();
        /* ABB Ejemplo 
              45  
           /     \  
          10      90  
         /  \    /    
        7   12  50   */

        //Agregar datos al ABB 
        ABB.insertar(45);
        ABB.insertar(10);
        ABB.insertar(7);
        ABB.insertar(12);
        ABB.insertar(90);
        ABB.insertar(50);

        //Mostrar el arbol ABB 
        System.out.println("El árbol ABB ha sido creado (izquierda-raiz-derecha):");
        ABB.inorder();

        //Borrar nodo hoja 
        System.out.println("\nEl árbol  ABB después de borrar 12(Nodo hoja):");
        ABB.borrarClave(12);
        ABB.inorder();

        //Borrar el nodo con un solo hijo 
        System.out.println("\nEl árbol The ABB después de borrar 90 (Nodo con 1 hijo):");
        ABB.borrarClave(90);
        ABB.inorder();

        //Borrar nodo con  2 hijos   
        System.out.println("\nEl árbol ABB después de borrar 45 (Nodo con 2 hijos):");
        ABB.borrarClave(45);
        ABB.inorder();

        //Buscar clave en el ABB 
        boolean ret_val = ABB.buscar(50);
        System.out.println("\nClave 50 en el ABB:" + ret_val);

        ret_val = ABB.buscar(12);
        System.out.println("\nClave 12 en el ABB:" + ret_val);
    }
}
