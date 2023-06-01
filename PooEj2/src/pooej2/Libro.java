/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para 
cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el número de páginas.
 */
package pooej2;

public class Libro {
     public String iSBN;
    public String titulo;
    public String autor;
    public int numero_de_paginas;

    public Libro() {
    }
                
            

    public Libro(String iSBN, String titulo, String autor, int numero_de_paginas) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numero_de_paginas = numero_de_paginas;
    }
    
    
}
