/*

EJERCICIO 6

Un palíndromo es una cadena que se deletrea igual al derecho y al revés. Ej:
ojo, radar, oso. Escriba un método recursivo llamado pruebaPalindromo que
devuelva el valor true tipo boolean si la cadena guardada en el arreglo es un
palíndromo, y false en caso contrario.

Nota: Utilizar el metodo toCharArray de la clase String para obtener un array char
que contenga los caracteres en el objeto String.

Mostrar el resultado con una fuente ARIAL, tamaño 20.

*/

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Ejercicio6 extends JApplet implements ActionListener {


    JLabel etiquetaPalabra;

    JTextField campoPalabra,
	campoResultado;


    public boolean pruebaPalindromo (char cadena[]) {

		boolean palindromo;

		palindromo = true;

		for (int i=0; i < cadena.length; i++) {

			if (cadena[i] != cadena[cadena.length-(i+1)])

			palindromo = false;

		}

		return palindromo;

    }


    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout());

		etiquetaPalabra = new JLabel ("Introduce palabra ");
		contenedor.add (etiquetaPalabra);

		campoPalabra = new JTextField (10);
		campoPalabra.addActionListener (this);
		contenedor.add (campoPalabra);

		campoResultado = new JTextField (20);
		campoResultado.setEditable (false);
		campoResultado.setFont (new Font ("Arial", Font.PLAIN, 20));
		contenedor.add (campoResultado);


    }


    public void actionPerformed(ActionEvent actionEvent) {

		char cadena[];

		cadena = campoPalabra.getText().toCharArray();

		if (pruebaPalindromo (cadena))

			campoResultado.setText ("ES PALINDROMO");

		else

			campoResultado.setText ("NO ES PALINDROMO");

		}

}