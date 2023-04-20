/*
13- Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
de equipo y define su tipo de dato de tal manera que te permita alojar sus 
nombres más adelante.
 */


import java.util.Scanner;
public class TeoriaEj13_14Guia5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Equipo = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese el nombre del " + i + " compañero de equipo");
            Equipo[i] = sc.nextLine();

        }

        for (int i = 0; i < 10; i++) {

            System.out.println(" El nombre del " + i + " compañero es " + Equipo[i]);
        }
    }

}