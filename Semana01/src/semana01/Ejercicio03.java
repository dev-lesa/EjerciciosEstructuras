/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

/**
 *
 * @author utpl
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String cadena = "Anita lava la tina";
        String cadenaSinEspacio = cadena.replaceAll(" ", "").toLowerCase();
        String cadenaInvertida = "";
        for (int i = cadenaSinEspacio.length() - 1; i >= 0; i--) {
            cadenaInvertida = String.format("%s%s", cadenaInvertida, cadenaSinEspacio.substring(i, (i + 1)));
        }
        if (cadenaInvertida.equals(cadenaSinEspacio)) {
            System.out.println("Si es");
        } else {
            System.out.println("no es");
        }
    }

}
