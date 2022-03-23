/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Paises;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


/**
 *
 * @author Edgardo
 */
public class PaisesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Paises cargaPaises() {

        Paises p = new Paises();

        System.out.println("Ingrese un Pais = ");
        p.setPais(leer.next());

        return p; 
    }
    
    public void mostrar(TreeSet<Paises> listaPaises){
        
        for (Paises listaPaise : listaPaises) {
            System.out.println(listaPaise);
        } 
}
    
    public void eliminarPais(TreeSet<Paises> listaPaises){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Iterator<Paises> it = listaPaises.iterator();  //Copio el ArrayList al Iterator

        System.out.print("Ingrese el pais q desea borrar = ");
        String borrarPais = leer.next();
        int bandera=0;
       
        while (it.hasNext()) {

            //String aux = it.next().getPais();

            if (it.next().getPais().equals(borrarPais)) {       //Metodo iterar

                it.remove();
                bandera=1;      
            }
                   
        }
        if (bandera==0) {
            System.out.println("La pais buscado NO esta en la lista");
        }
        
//        for (Paises actualizacion : listaPaises) {
//            System.out.println(actualizacion);              //Mostrar lista actualizada
//
//        }
    
    }
}
