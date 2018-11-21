/*

EJERCICIO 3

Modifique el método creado en el ejercicio anterior para formar el cuadrado con
cualquier carácter que este contenido en el parámetro tipo carácter caracterRelleno.
Por ejemplo, si lado es 5 y caracterRelleno es "#", el método debe imprimir

#####
#####
#####
#####
#####

*/


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class Ejercicio3 extends JApplet implements ActionListener {


    JLabel etiquetaLado, etiquetaRelleno;
    JTextField campoLado, campoRelleno;
    JTextArea areaSalida;

    int lados;
    String caracter;


    public void cuadradoDeAsteriscos (int lado, String caracter) {


		areaSalida.setText ("Pantalla de salida: \n\n");


		for (int i=1; i<=lado; i++) {

			for (int j=1; j<=lado; j++) {

				areaSalida.append (caracter);

			}
			
				areaSalida.append ("\n");

		}

    }


    public void init () {


		lados = 0;
		caracter = "*";

		Container contenedor = getContentPane();
		contenedor.setLayout ( new FlowLayout() );

		etiquetaLado = new JLabel ("Introduce el número lados del cuadrado: ");
		contenedor.add (etiquetaLado);

		campoLado = new JTextField (10);
		campoLado.addActionListener (this);
		contenedor.add (campoLado);

		etiquetaRelleno = new JLabel ("Introduce el caracter de relleno: ");
		contenedor.add (etiquetaRelleno);

		campoRelleno = new JTextField (10);
		campoRelleno.addActionListener (this);
		contenedor.add (campoRelleno);

		areaSalida = new JTextArea ();
		areaSalida.setText ("Pantalla de salida: \n\n");
		areaSalida.setEditable( false );
		contenedor.add (areaSalida);

    }


    public void paint (Graphics g) {

		super.paint (g);

		cuadradoDeAsteriscos (lados, caracter);

    }


    public void actionPerformed ( ActionEvent evento ) {

		if ( evento.getSource() == campoLado ) {
		
			lados = Integer.parseInt ( campoLado.getText() );

		}
		else caracter = campoRelleno.getText();

		repaint ();

    }

}