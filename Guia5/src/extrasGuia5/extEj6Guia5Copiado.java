/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrasGuia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ANAPR
 */
public class extEj6Guia5Copiado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
        char m[][] = new char[20][20];

        System.out.println("SOPA DE LETRAS");
        Scanner leer = new Scanner(System.in);
        
        inicializarMatriz(m);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese una palabra");
            palabra = leer.next();
            cargarPalabraMatriz(m, palabra);
        }
        completarMatriz(m);
        mostrarMatriz(m);
    }

    public static void cargarPalabraMatriz(char[][] m, String palabra) {
        Random rand = new Random();
        int f = rand.nextInt(20);
        int c = rand.nextInt(20 - palabra.length());
        for (int i = 0; i < palabra.length(); i++) {
            m[f][c + i] = palabra.charAt(i);
        }

    }

    public static void mostrarMatriz(char m[][]) {
        for (int f = 0; f < 20; f++) {
            for (int c = 0; c < 20; c++) {
                System.out.print("[" + m[f][c] + "]");
            }
            System.out.println("");
        }
    }

    public static void completarMatriz(char m[][]) {
        Random rand = new Random();
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                if (m[f][c] == '*') {
                    m[f][c] = (char) (rand.nextInt(48, 56));
                }

            }
        }

    }

    public static void inicializarMatriz(char m[][]) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                m[f][c] = '*';
            }
        }
    }

}    // TODO code application logic here
    
    

