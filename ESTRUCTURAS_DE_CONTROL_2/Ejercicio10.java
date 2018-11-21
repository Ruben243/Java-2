/*

Ejercicio 10

Escribir una aplicación que un JTextArea en un cuadro de dialogo, nos muestre la
tabla de multiplicar del 1 al 10.

*/

import javax.swing.*;

public class Ejercicio10 {


    public static void main (String args[]) {


		JTextArea areaSalida = new JTextArea (20,20);

		JScrollPane barra = new JScrollPane (areaSalida);

		String resultado;

		resultado = "";



		for (int i=1; i<=10; i++) {

			resultado += "La tabla de multiplicar del " + i + "\n\n";

			for (int j=1; j<=10; j++) {

			resultado += i + " * " + j + " = " + (i*j) + "\n";

			}

			resultado += "\n\n";

		}

		areaSalida.setText (resultado);

		JOptionPane.showMessageDialog (null, barra, "Tablas de multiplicar", JOptionPane.INFORMATION_MESSAGE);

		System.exit (0);

    }

}
