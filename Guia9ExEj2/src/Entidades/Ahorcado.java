/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad
jugadas máximas que puede realizar el usuario.
 */
package Entidades;

/**
 *
 * @author ANAPR
 */
public class Ahorcado {
    private char buscarPalabra;
    private int letrasEncontradas;
    private int cantJugadasMaximas;

    public Ahorcado() {
       
    }

    public Ahorcado(char buscarPalabra, int letrasEncontradas, int cantJugadasMaximas) {
        this.buscarPalabra = buscarPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public char getBuscarPalabra() {
        return buscarPalabra;
    }

    public void setBuscarPalabra(char buscarPalabra) {
        this.buscarPalabra = buscarPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "buscarPalabra=" + buscarPalabra + ", letrasEncontradas=" + letrasEncontradas + ", cantJugadasMaximas=" + cantJugadasMaximas + '}';
    }
    
    
}
