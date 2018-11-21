/*
Ejercicio 2

Utilizando bucles mostrar la tabla de multiplicar del número que se le solicite.

*/


import javax.swing.JOptionPane;


public class Ejercicio2 {

    public static void main (String args[]) {


		String cadenaTabla;
		String resultado;

		int tabla;
		int contador;

		cadenaTabla = JOptionPane.showInputDialog("Introduce el número de la tabla de multiplicar: ");

		tabla = Integer.parseInt(cadenaTabla);

		contador = 1;

		resultado = "";

		while (contador <= 10) {

			resultado += tabla + " * " + contador + " = " + (tabla*contador) + " \n";

			contador++;

		}

		JOptionPane.showMessageDialog (null, resultado);

		System.exit (0);

    }

}