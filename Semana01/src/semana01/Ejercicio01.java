/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana01;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra = entrada.nextLine();
        for (int i = 0; i<palabra.length();i++){
            System.out.print(palabra.substring(i, (i+1))+ " ");
        }
    }
    
}
