package ejerciciointegradortramo2;

import entidades.Estudiantes;
import java.util.Scanner;

public class EjercicioIntegradorTramo2 {
    public static void main(String[] args) {
        Estudiantes[] estudiantes = new Estudiantes[8];

        for (int i = 0; i < 8; i++) 
        {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese nombre estudiante: ");
            String estudianteSTR = leer.next();
             
            System.out.println("Ingrese nota estudiante: ");
            double nota = leer.nextDouble();
        
            estudiantes[i] = new Estudiantes(estudianteSTR, nota);
        }
        
            double sumaNotas = 0;
            for (int j = 0; j < estudiantes.length; j++) 
            {
                sumaNotas += estudiantes[j].getNota();

            }
            double promedioNotas = sumaNotas / estudiantes.length;
            System.out.println("El promedio de notas es: " + promedioNotas);   
            

            int contador = 0;
            for (int j = 0; j < estudiantes.length; j++) {
                if (estudiantes[j].getNota() > promedioNotas) {
                    contador++;
                }
            }
            String[] nombreEstudiantes = new String[contador];
            contador = 0;

            for (int j = 0; j < estudiantes.length; j++) {
                if (estudiantes[j].getNota() > promedioNotas) {
                    nombreEstudiantes[contador] = estudiantes[j].getNombre();
                    contador++;
                }
            }
            
            for (int j = 0; j < nombreEstudiantes.length; j++)
            {
                System.out.println("El alumno: " + nombreEstudiantes[j]+
                        " supera el promedio.");
                
            }

        
    }
    }

    
   

