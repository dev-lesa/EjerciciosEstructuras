/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadsemana3;

/**
 *
 * @author utpl
 */
public class ejercicio2RecursivaIndirecta {

    public static void main(String[] args) {
        PrintNum(4);
        System.out.println("Fin");
    }

    public static void PrintNum(int n) {
        PrintNum2(n);
        System.out.println(n);
    }

    public static void PrintNum2(int n) {
        System.out.println(n);
        if (n > 1) {
            PrintNum(n - 1);
        }
    }
}
