/*Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar
para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables(arrays), para después calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 
Para esto, podemos crear unos métodos adicionales.


 */
package ej3guia8;

import Entidad.Persona;
import servicios.PersonaServicios;

public class Ej3Guia8 {
    public static void main(String[] args) {
        
        PersonaServicios personaServicios = new PersonaServicios();
        Persona[] personas = new Persona[4];
        int[] resultadosIMC = new int[4];
        boolean[] mayoresDeEdad = new boolean[4];

        for (int i = 0; i < 4; i++) {
            personas[i] = personaServicios.crearPersona();
            resultadosIMC[i] = personaServicios.calcularIMC(personas[i]);
            mayoresDeEdad[i] = personaServicios.esMayorDeEdad(personas[i]);
        }

        int porDebajoPeso = 0;
        int enPesoIdeal = 0;
        int conSobrepeso = 0;
        int cantidadMayoresDeEdad = 0;

        for (int i = 0; i < 4; i++) {
            if (resultadosIMC[i] == -1) {
                porDebajoPeso++;
            } else if (resultadosIMC[i] == 0) {
                enPesoIdeal++;
            } else {
                conSobrepeso++;
            }

            if (mayoresDeEdad[i]) {
                cantidadMayoresDeEdad++;
            }
        }

        System.out.printf("Porcentaje de personas por debajo del peso ideal: %.2f%%\n", (porDebajoPeso / 4.0) * 100);
        System.out.printf("Porcentaje de personas en su peso ideal: %.2f%%\n", (enPesoIdeal / 4.0) * 100);
        System.out.printf("Porcentaje de personas con sobrepeso: %.2f%%\n", (conSobrepeso / 4.0) * 100);
        System.out.printf("Porcentaje de personas mayores de edad: %.2f%%\n", (cantidadMayoresDeEdad / 4.0) * 100);
        System.out.printf("Porcentaje de personas menores de edad: %.2f%%\n", ((4 - cantidadMayoresDeEdad) / 4.0) * 100);
    }
    }
    