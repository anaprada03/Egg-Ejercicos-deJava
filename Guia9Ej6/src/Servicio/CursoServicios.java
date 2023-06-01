/*Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en 
un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre
de cada alumno.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoServicios {
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(Curso alumno){
        String[] estudiante= alumno.getAlumno();
        for( int i=0; i<= 4; i++){
            System.out.println("Ingrese el nobre del alumno: ");
            estudiante[i]= leer.next();
        }
        alumno.setAlumno(estudiante);
        
        
    }
    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos*/
    public Curso crearCurso(){
        Curso c1= new Curso();
        System.out.println("Ingrese el nombre del curso");
        c1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por semana");
        c1.setCantHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días por semana");
        c1.setCantDiasPorSem(leer.nextInt());
        System.out.println("Ingrese turno: mañana/tarde");
        c1.setTurno(leer.next());
        System.out.println("Ingrese el precio de la hora");
        c1.setPrecioHora(leer.nextDouble());
       cargarAlumnos(c1);
       
       return c1;
    }
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de 
días a la semana que se repite el encuentro.*/

    public void calcularGananciaSemana(Curso c1){
        int ganSem = c1.getCantDiasPorSem()* (int)c1.getPrecioHora()*c1.getCantHorasPorDia()*5;
        System.out.println("La ganancia se esta semana es: " + ganSem);
        
    }

    }
