/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título
y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor 
de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package Entidad_cancion;

import java.util.Scanner;

public class cancion {
    private String titulo;
    private String autor;

    public cancion() {
    }

    public cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void datosCancion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        titulo= leer.nextLine();
        System.out.println("Ingrese el nomre del Autor");
        autor= leer.nextLine();
        System.out.println("Cancion1: '" + titulo + "' ");
        System.out.println("Autor: '" + autor + "' ");
    }
}
