/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana5matriz;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Semana5Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo cuadrado");
        int tamaño = entrada.nextInt();
        int[][] A = new int[tamaño][tamaño];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Matriz original A");
        presentarArreglo(A);

        int[][] B = transpuesta(A);

        System.out.println("Matriz transpuesta B");
        presentarArreglo(B);

        int[][] resultado = multiplicarMatrices(A, B);

        System.out.println("Multiplicación de A x B");
        presentarArreglo(resultado);
    }

    public static int[][] transpuesta(int[][] arreglo) {
        int[][] transpuesta = new int[arreglo[0].length][arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                transpuesta[j][i] = arreglo[i][j];
            }
        }
        return transpuesta;
    }

    public static int[][] multiplicarMatrices(int[][] A, int[][] B) {
        int filas = A.length;
        int columnas = A[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = A[i][j] * B[i][j];
            }
        }
        return resultado;
    }

    public static void presentarArreglo(int[][] arreglo) {
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                System.out.print("[ " + valor + " ] ");
            }
            System.out.println();
        }
    }

}
