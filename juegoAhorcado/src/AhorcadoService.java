public class AhorcadoService {
    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();

        System.out.println("Bienvenido al juego Ahorcado");

        // Crear el juego
        ahorcado.crearJuego();

        // Mostrar la longitud de la palabra
        ahorcado.longitud();

        // Jugar
        ahorcado.juego();
        
        ahorcado.intentos();
    }
}

