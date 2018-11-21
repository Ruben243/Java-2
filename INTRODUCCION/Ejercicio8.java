/*

EJERCICIO 8

Escriba un programa que lea el primer nombre y el apellido del usuario, como
dos entradas separadas, y que concatene el primer nombre y el apellido,
separándolos por un espacio. Mostrar el nombre concatenado en un cuadro de
diálogo de mensaje.

*/

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main (String args[]) {

		String nombre;
		String apellido;

		nombre = JOptionPane.showInputDialog ("Introduce el nombre: ");

		apellido = JOptionPane.showInputDialog ("Introduce el apellido: ");


		JOptionPane.showMessageDialog (null, nombre + " " + apellido, "Resultado", JOptionPane.PLAIN_MESSAGE);

		System.exit (0);

    }

}