/*
 Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados
por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos 
al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro
y el número de páginas.

 */
package Entidad;

import Entidad.Libro;

/**
 *
 * @author ANAPR
 */
public class Guia7Ej1 {
    public static void main(String[] args) {
        Libro L1 = new Libro();
        Libro L2 = new Libro();
        Libro L3 = new Libro();
        Libro L4 = new Libro();
        
        L1.crearLibro();
        L1.informeLibro();
        L2.crearLibro();
        L2.informeLibro();
        L3.crearLibro();
        L3.informeLibro();
        L4.crearLibro();
        L4.informeLibro();
        
        
        
        
    }
    
}
