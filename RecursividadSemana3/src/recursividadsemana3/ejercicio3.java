/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadsemana3;

/**
 *
 * @author utpl
 */
public class ejercicio3 {
    public static void main(String[] args) {
        multiploIterativo(3);
        System.out.println("");
        multiploRecursivo(3);
    }
    public static void multiploIterativo (int n){
        while (n<30){
            System.out.println(n);
            n+=3;
        }
    }
    public static void multiploRecursivo (int n){
        if (n<30){
            System.out.println(n);
            multiploRecursivo(n+3);
        }
    }
}

