/*

EJERCICIO 5

Un programa que calcule el NIF de tú DNI.

NOTA: 

Debemos de tener un array unidimensional de caracteres que tenga las letras
almacenadas en el siguiente orden 'TRWAGMYFPDXBNJZSQVHLCKE'. Y para calcular
el NIF, es DNI % 23.

Mostrar el NIF con fuente Monospaced, negrita, tamaño 14.

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ejercicio5 extends JApplet implements ActionListener {

    JLabel etiquetaDni;

    JTextField campoDni,
	campoNif;


    public String obtenerNif (String dni) {

		char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

		char letraNif;

		letraNif = letras[Integer.parseInt (dni) % 23];

		return dni + " - " + letraNif;
 
    }


    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout());

		etiquetaDni = new JLabel ("Introduce tú DNI");
		contenedor.add (etiquetaDni);

		campoDni = new JTextField (20);
		campoDni.addActionListener (this);
		contenedor.add (campoDni);

		campoNif = new JTextField (20);
		campoNif.setEditable (false);
		campoNif.setFont (new Font ("Monospaced", Font.BOLD, 14));
		contenedor.add (campoNif);

    }

    public void actionPerformed(ActionEvent actionEvent) {

		campoNif.setText (obtenerNif(campoDni.getText()));

    }

}
