
package Ejercicio1;

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
