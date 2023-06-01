/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package servicios;

import entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ANAPR
 */
public class alumnosServicios {
    Scanner leer = new Scanner(System.in);
    public ArrayList<Alumnos> llenarLista(){ 
        ArrayList<Alumnos>alumno= new ArrayList();
        ArrayList<Integer>notas = new ArrayList();
        boolean preg = true;
         do{
             Alumnos estudiante = new Alumnos();
            System.out.println("Ingrese el nombre del alumno");
            estudiante.setNombre(leer.next());
            alumno.add(estudiante);
            for(int i = 0;  i <3;  i++ ){
             System.out.println("Ingrese la nota");
             notas.add(leer.nextInt());             
            }
            estudiante.setNotas(notas);
            System.out.println("¿Quiere ingresar alguna otro estudiante?s/n");
            String respuesta = leer.next().toUpperCase();
            if(respuesta.equalsIgnoreCase("n")){
            preg = false;
            }
        }while(preg);
    return alumno;
    }

    public Alumnos buscarAlumno(ArrayList <Alumnos> alumno){
        System.out.println("Ingrese el nombre del alumno sobre el que quiere calcular el promedio");
        String alumnoElegido =leer.next();
        boolean noEsta= true;
        Iterator<Alumnos> ite = alumno.iterator();
        Alumnos aux;
        while(ite.hasNext()){
            if(ite.next().equals(alumnoElegido)){
                 aux =ite.next();
                 return aux;
            }
        }
        return null;
    }  
          
        public double promedioNotas(Alumnos alumno){
        double sumaNotas=0;
        for (Integer nota : alumno.getNotas()){
        sumaNotas+= nota;
        }
         return sumaNotas / alumno.getNotas().size();
          
        }
    
}
       
/*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */