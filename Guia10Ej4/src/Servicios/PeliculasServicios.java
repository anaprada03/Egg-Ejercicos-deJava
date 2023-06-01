/*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ANAPR
 */
public class PeliculasServicios {
     private List<Pelicula> listaPeliculas;

    public PeliculasServicios() {
        listaPeliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        listaPeliculas.add(pelicula);
    }

    public void mostrarPeliculas() {
        System.out.println("Lista de películas:");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo() +
                    ", Director: " + pelicula.getDirector() +
                    ", Duración: " + pelicula.getDuracion() + " horas");
        }
    }

    public void mostrarPeliculasDuracionMayorAUnaHora() {
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Título: " + pelicula.getTitulo() +
                        ", Director: " + pelicula.getDirector() +
                        ", Duración: " + pelicula.getDuracion() + " horas");
            }
        }
    }

    public void ordenarPeliculasPorDuracionDescendente() {        
        Collections.sort(listaPeliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
    }

    public void ordenarPeliculasPorDuracionAscendente() {
        Collections.sort(listaPeliculas, Comparator.comparingDouble(Pelicula::getDuracion));
    }

    public void ordenarPeliculasPorTitulo() {
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getTitulo));
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getDirector));
    }

}

