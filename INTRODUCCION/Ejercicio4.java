/*

EJERCICIO 4

Escriba una aplicación que reciba del usuario el radio de un círculo como un
entero, y que imprima el diámetro, circunferencia y área de ese círculo. Utilice
el valor 3.14159 para el número pi. También puede utilizar Math.PI.

*/

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main (String args[]) {

		String cadenaRadio;

		int radio;



		cadenaRadio = JOptionPane.showInputDialog ("Introduce el radio de un circulo: ");

		radio = Integer.parseInt (cadenaRadio);

		JOptionPane.showMessageDialog (null, "Diámetro: " + (2*radio) + "\n\nCircunferencia: " +
						   (2*Math.PI*radio) + "\n\nÁrea: " + (Math.PI*radio*radio));

		System.exit (0);

    }

}