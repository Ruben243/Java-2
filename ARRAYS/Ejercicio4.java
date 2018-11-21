/*

EJERCICIO 4

Escriba un método recursivo llamado imprimirArreglo que tome un arreglo de valores
int y la longitud del arreglo como argumentos, y que no devuelva nada. Este método
deberá dejar de procesarse y regresar cuando reciba un arreglo de longitud cero.

NOTA: Mostrar el array con fuente MONOSPACED, TAMAÑO 12.

 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Ejercicio4 extends JApplet implements ActionListener  {


    JTextArea areaSalida;


    public void imprimirArreglo (int matriz[], int longitud) {

		if (longitud != 0) {

			imprimirArreglo (matriz, longitud - 1);
			areaSalida.append (matriz[longitud] + " ");
		}
		else areaSalida.append (matriz[longitud] + " ");

    }


    public void init () {


		int datos[] = {1,-1,2,3,-45,4,5,-54};

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		areaSalida = new JTextArea ();
		areaSalida.setEditable (false);
		areaSalida.setFont (new Font ("Monospaced", Font.BOLD, 12));
		contenedor.add (areaSalida);

		imprimirArreglo (datos, datos.length - 1);

    }


    public void actionPerformed (ActionEvent evento) {

    }
}
