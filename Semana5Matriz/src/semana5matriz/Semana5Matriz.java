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
        System.out.println("ingrese el tamaño del arreglo");
        int tamaño = entrada.nextInt();
        int[][] arreglo = new int[tamaño][tamaño];
        int aux;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("arreglo original");
        presentarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i+1; j < arreglo[i].length; j++) {
                aux = arreglo[i][j];
                arreglo[i][j] = arreglo[j][i];
                arreglo[j][i] = aux;
            }
        }
        
        System.out.println("arreglo traspuesto");
        presentarArreglo(arreglo);
    }
    public static void presentarArreglo (int[][] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print("[ " + arreglo[i][j] + " ] ");
            }
            System.out.println("");
        }
    }

}
