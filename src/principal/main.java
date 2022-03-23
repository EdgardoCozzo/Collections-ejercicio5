/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.
 */
package principal;

import entidades.Paises;



import java.util.Scanner;
import java.util.TreeSet;

import servicio.PaisesServicio;

/**
 *
 * @author Edgardo
 */
public class main {

  
    public static void main(String[] args) {
  
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisesServicio serv = new PaisesServicio();
        TreeSet<Paises> listaPaises = new TreeSet();
        

        
        String respuesta = "";

        do {
            
            listaPaises.add(serv.cargaPaises());

            System.out.println("Quiere ingresar otro Pais ?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
        
        serv.mostrar(listaPaises);
       serv.eliminarPais(listaPaises);
       serv.mostrar(listaPaises);               //actualiza el TreeSet

        
    }
    
}
