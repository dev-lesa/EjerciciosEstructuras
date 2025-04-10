/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

/**
 *
 * @author utpl
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        String cadena = "Universidad";
        System.out.println(cadena);
        for (int i = 1; i <= cadena.length() / 2; i++) {
            System.out.println(cadena.substring(i, cadena.length() - i));
        }

    }

}
