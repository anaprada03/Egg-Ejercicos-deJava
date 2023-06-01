/*
 */
package guia10ej4;

import Entidades.Pelicula;
import Servicios.PeliculasServicios;
import java.util.Scanner;

public class Guia10Ej4 {
    public static void main(String[] args) {
        
         PeliculasServicios Pelicula = new PeliculasServicios();
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("Ingrese los datos de la película:");
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Director: ");
            String director = scanner.nextLine();
            System.out.print("Duración (horas): ");
            double duracion = Double.parseDouble(scanner.nextLine());

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            Pelicula.agregarPelicula(pelicula);
            System.out.print("¿Desea agregar otra película? (S/N): ");
            opcion = scanner.nextLine().charAt(0);
        } while (opcion == 'S' || opcion == 's');

        Pelicula.mostrarPeliculas();
        System.out.println();

        Pelicula.mostrarPeliculasDuracionMayorAUnaHora();
        System.out.println();

        Pelicula.ordenarPeliculasPorDuracionDescendente();
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        Pelicula.mostrarPeliculas();
        System.out.println();

        Pelicula.ordenarPeliculasPorDuracionAscendente();
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        Pelicula.mostrarPeliculas();
        System.out.println();

        Pelicula.ordenarPeliculasPorTitulo();
        System.out.println("Películas ordenadas por título:");
        Pelicula.mostrarPeliculas();
        System.out.println();
        
        Pelicula.ordenarPeliculasPorDirector();
        System.out.println("Películas ordenadas por director:");
        Pelicula.mostrarPeliculas();
    

        





 // TODO code application logic here
    }
    
}
