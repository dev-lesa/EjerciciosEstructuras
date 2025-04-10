/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

/**
 *
 * @author utpl
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        String cadena = "Universidad Tecnica";
        cadena = cadena.toLowerCase();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            String letraPalabra = cadena.substring(i, (i + 1));
            switch (letraPalabra) {
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
            }
        }
        System.out.println("Tiene " + contador + " vocales");
    }

}
