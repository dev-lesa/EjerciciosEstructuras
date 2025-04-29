/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Problema {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];

        boolean bandera = true;
        int contador = 0;
        int numero;
        while (bandera) {
            System.out.println("ingrese un numero para la posicion " + contador);
            numero = entrada.nextInt();

            if (verificar(arreglo, numero, contador)) {
                arreglo[contador] = numero;
                contador++;
            } else {
                System.out.println("Los numeros no deben repetirse");
            }
            if (contador >= 10) {
                bandera = false;
            }
        }
        presentarArreglo(arreglo);
        int[] arregloOrdenado = ordenarBurbuja(arreglo);
        presentarArreglo(arregloOrdenado);
    }

    public static boolean verificar(int[] arreglo, int num, int contador) {
        boolean bool = true;
        arreglo[contador] = num;
        for (int i = 0; i < contador; i++) {
            if (arreglo[i] == num) {
                bool = false;
            }
        }
        return bool;
    }

    public static void presentarArreglo(int[] arreglo) {
        System.out.println("valores del arreglo:");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo en el indice [" + i + "] = " + arreglo[i]);
        }
        System.out.println("");
    }

    public static int[] ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        return arreglo;
    }
}
