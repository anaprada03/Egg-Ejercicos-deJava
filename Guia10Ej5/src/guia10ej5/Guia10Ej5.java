/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ANAPR
 */
public class Guia10Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> paises = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese un país: ");
            String pais = scanner.nextLine();
            
            if (paises.contains(pais)) {
                System.out.println("El país ya está en el conjunto.");
            } else {
                paises.add(pais);
            }
            
            System.out.print("¿Desea ingresar otro país? (s/n): ");
            String respuesta = scanner.nextLine();
            
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        
        System.out.println("Países guardados en el conjunto:");
        for (String pais : paises) {
            System.out.println(pais);
        }
        
        List<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);
        
        System.out.println("Países ordenados alfabéticamente:");
        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }
        
        System.out.print("Ingrese un país a eliminar: ");
        String paisEliminar = scanner.nextLine();
        
        Iterator<String> iterator = paises.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            String pais = iterator.next();
            if (pais.equalsIgnoreCase(paisEliminar)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("País eliminado. Conjunto actualizado:");
            for (String pais : paises) {
                System.out.println(pais);
            }
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }
    }
}
  
   

