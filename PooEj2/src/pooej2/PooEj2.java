/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para 
cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el número de páginas.
*/
package pooej2;

import java.util.Scanner;

public class PooEj2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
        String iSBN= sc.next();
        System.out.println("Ingrese el titulo del libro");
        String titulo= sc.next();
        System.out.println("Ingrese el autor del libro");
        String autor= sc.next();
        System.out.println("Ingrese el numero de paginas del libro");
        int numero_de_paginas = sc.nextInt();
        
        
        
        
        
                
        
    }
    
}
