/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadsemana3;

/**
 *
 * @author utpl
 */
public class ejemploClase {

    public static void main(String[] args) {
        PrintNum(4);
        System.out.println("Fin");
    }

    public static void PrintNum(int n) {
        System.out.println(n);
        if (n > 1) {
            PrintNum(n - 1);
        }
        System.out.println(n);
    }
}
