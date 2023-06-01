/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia10Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
/**
 *2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 * @author ANAPR
 */
public class Guia10Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    ArrayList<String> razaPerros =new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean preg = true;
        do{
            System.out.println("Ingrese una raza de perro");
            razaPerros.add(leer.next());
            System.out.println("¿Quiere ingresar alguna otra raza?s/n");
            String respuesta = leer.next().toUpperCase();
            respuesta = respuesta.substring(0, 1);
            if(respuesta.equalsIgnoreCase("n")){
            preg = false;
            }
        }while(preg);

        
        for(String raza1: razaPerros){
            System.out.println(raza1);
            //Ej2
        }
        System.out.println("Ingrese el nombre de la raza a eliminar");
        String elim = leer.next();
        boolean noEsta = true;
        Iterator ite =razaPerros.iterator();     //recorre la lista
        while(ite.hasNext()){
            if(ite.next().equals(elim)){
                ite.remove();
            noEsta = false;
            }
            
            }
        if(noEsta){
            System.out.println("La raza no esta en la lista");
        }
            Collections.sort(razaPerros);       //ordena la lista
            
            for(String raza1:razaPerros){
                System.out.println(raza1);
        }
      
        
        
        
        
        
        
        
        
        
    }
}
