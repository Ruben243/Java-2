/*

Ejercicio 9

Un almacen de pedidos vende cinco productos cuyos precios son los siguientes:

Producto 1 --> 2.30 euros
Producto 2 --> 4.12 euros
Producto 3 --> 6.11 euros
Producto 4 --> 5.12 euros
Producto 5 --> 4.77 euros

Escribir una aplicación que pida el número de producto y la cantidad vendida de
ese producto, hasta que se introduzca el valor -1.

A partir de hay debe de mostrar la lista de productos vendidos, su cantidad, y el
valor del producto * cantidad del producto y al final la suma de todos los
productos.

Ej:

Producto		Cantidad		Total producto

Producto 1		 2			4.60
Producto 2		 1			4.12

TOTAL							8.72


*/


import javax.swing.*;
import java.text.NumberFormat;
//import java.util.Locale;


public class Ejercicio9 {


    public static void main (String args[]) {


		JTextArea areaSalida = new JTextArea (50,50);
		JScrollPane barra = new JScrollPane (areaSalida);

		NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance ();

		String cadenaNumero;
		String cadenaCantidad;
		String resultado;


		int numero;
		int cantidad;
		double total;

		numero = 0;
		cantidad = 0;
		total = 0;

		resultado = "PRODUCTO\t\tCANTIDAD\t\tEUROS\n";

		resultado += "----------------------------------------------------------------------------------------------------\n\n";

		while (numero != -1) {

			cadenaNumero = JOptionPane.showInputDialog ("Introduce el número del producto: ");

			numero = Integer.parseInt (cadenaNumero);

			if (numero != -1) {

			cadenaCantidad = JOptionPane.showInputDialog ("Introduce la cantidad: ");

			cantidad = Integer.parseInt (cadenaCantidad);

			switch (numero) {

			case 1:

				total += 2.30 * cantidad;
				resultado += "Producto 1\t\t" + cantidad + "\t\t" + formatoMoneda.format (2.30*cantidad) + "\n";

				break;

			case 2:

				total += 4.12 * cantidad;
				resultado += "Producto 2\t\t" + cantidad + "\t\t" + formatoMoneda.format (4.12*cantidad) + "\n";

				break;

			case 3:

				total += 6.11 * cantidad;
				resultado += "Producto 3\t\t" + cantidad + "\t\t" + formatoMoneda.format (6.11*cantidad) + "\n";

				break;

			case 4:

				total += 5.12 * cantidad;
				resultado += "Producto 4\t\t" + cantidad + "\t\t" + formatoMoneda.format (5.12*cantidad) + "\n";

				break;

			case 5:

				total += 4.77 * cantidad;
				resultado += "Producto 5\t\t" + cantidad + "\t\t" + formatoMoneda.format (4.77*cantidad) + "\n";

				break;

			default:

				resultado += "\n\nEl número " + numero + " no es correcto para el producto\n\n";

			}

			}

		}

		resultado += "\n\nTOTAL\t\t\t\t" + formatoMoneda.format (total);

		areaSalida.setText (resultado);

		JOptionPane.showMessageDialog (null, barra, "Resultados", JOptionPane.INFORMATION_MESSAGE);

		System.exit (0);

    }

}