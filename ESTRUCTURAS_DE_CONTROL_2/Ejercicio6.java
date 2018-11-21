/*

Ejercicio 6

Escriba una aplicación que imprima una tabla con los cuadrados de los números 
decimales, en el rango de 1 al 256. Coloque los resultados en un objeto 
JTextArea con funcionalidad de desplazamiento. Muestre el objeto JTextArea
en un cuadro de diálogo de mensaje.

*/

import javax.swing.*;

public class Ejercicio6 {


    public static void main (String args[]) {


		String resultado;

		JTextArea areaSalida = new JTextArea (50,50);

		JScrollPane barra = new JScrollPane (areaSalida);


		resultado = "Número\t\tPotencia\n";

		resultado += "-----------------------------------------------------------\n\n";

		for (int i=1; i<=256; i++) {

			resultado += i + "\t\t" + i*i + "\n";

		}

		areaSalida.setText (resultado);

		JOptionPane.showMessageDialog (null, barra, "Resultados", JOptionPane.INFORMATION_MESSAGE);

		System.exit (0);

    }

}