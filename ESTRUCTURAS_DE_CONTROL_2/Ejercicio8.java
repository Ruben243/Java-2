/*

Ejercicio 8

Escriba una aplicación que pida un número y según ese número el valor que tome
imprima la correspondiente figura:

1)

**********
*        *
*        *
*        *
**********

2)

    *
   * *
  *   *
 *     *
*********

3)

*********
*
*
*
*********

Cualquier otro:

"Ha elegido cualquier otro valor"

*/


import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Ejercicio8 {

    public static void main (String args[]) {


		String cadenaNumero;
		String resultado;

		JTextArea areaSalida = new JTextArea ();

		int numero;


		resultado = "";

		cadenaNumero = JOptionPane.showInputDialog ("Introduce un número del (1 - 3): ");

		numero = Integer.parseInt (cadenaNumero);

		switch (numero) {


		case 1:

			resultado += "**********\n";
			resultado += "*            *\n";
			resultado += "*            *\n";
			resultado += "*            *\n";
			resultado += "**********\n";

			break;

		case 2:

			resultado += "       *\n";
			resultado += "    *    *\n";
			resultado += "   *      *\n";
			resultado += " *         *\n";
			resultado += "**********\n";

			break;

		case 3:

			resultado += "**********\n";
			resultado += "*\n";
			resultado += "*\n";
			resultado += "*\n";
			resultado += "**********\n";

			break;

		default:

			resultado += "Ha elegido cualquier otro valor";

		}

		areaSalida.setText (resultado);

		JOptionPane.showMessageDialog (null, areaSalida);

		System.exit (0);

    }


}


