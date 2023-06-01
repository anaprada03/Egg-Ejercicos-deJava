import java.util.Scanner;


public class Ahorcado {
    private char[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int jugadasRealizadas;

    public Ahorcado() {
    }

    public Ahorcado(int longitudPalabra, int jugadasMaximas) {
        palabra = new char[longitudPalabra];
        this.jugadasMaximas = jugadasMaximas;
    }

    public void crearJuego() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la palabra a buscar: ");
        String palabraStr = leer.nextLine();
        palabra = palabraStr.toCharArray();

        letrasEncontradas = 0;
        jugadasRealizadas = 0;
        jugadasMaximas = 5;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public void buscar(char letra) {
        boolean encontrada = false;

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontrada = true;
                letrasEncontradas++;
            }
        }

        if (encontrada) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            jugadasRealizadas++;
        }
    }

    public boolean encontradas(char letra) {
        int faltantes = palabra.length - letrasEncontradas;

        System.out.println("Número de letras (encontradas, faltantes): (" + letrasEncontradas + "," + faltantes + ")");
        return (faltantes == 0);
    }

    public void intentos() 
    {
        int oportunidadesRestantes = jugadasMaximas - jugadasRealizadas;
        System.out.println("Número de oportunidades restantes: " + oportunidadesRestantes);
    }

    public void juego() {
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una letra:");
            char letra = leer.nextLine().charAt(0);

            buscar(letra);
            if (encontradas(letra)) {
                System.out.println("¡Felicidades! Has encontrado toda la palabra.");
                break;
            }

            intentos();
            if (jugadasRealizadas == jugadasMaximas) {
                System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
                break;
            }

            System.out.println("----------------------------------------------");
        }
    }
}
    
    

