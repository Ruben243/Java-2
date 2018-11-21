/*

EJERCICIO 2

Escriba un método llamado cuadradoDeAsteriscos que muestre un cuadrado de relleno
(mismo número fila y columnas) de asteriscos cuyo lado sea especificado en el
parámetro entero lado. Ej, lado es 4 el método debe de mostrar:

****
****
****
****

Incorpore este método a un applet que reciba como entrada por parte del usuario
un valor entero lado, y que realice el dibujo con el método cuadradoDeAsteriscos.
Este método debe de llamarse desde el método paint del applet, y que debe de
recibir el objeto Graphics de paint.


*/

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Ejercicio2 extends JApplet implements ActionListener {


    JLabel etiquetaLado;
    JTextField campoLado;
    JTextArea areaSalida;

    int lados;

    public void cuadradoDeAsteriscos (int lado) {


		areaSalida.setText ("Pantalla de salida: \n\n");


		for (int i=1; i<=lado; i++) {

			for (int j=1; j<=lado; j++) {

				areaSalida.append ("*");

			}
			
			areaSalida.append ("\n");

		}

    }


    public void init () {


		Container contenedor = getContentPane();
		contenedor.setLayout ( new FlowLayout() );

		etiquetaLado = new JLabel ("Introduce el número lados del cuadrado: ");
		contenedor.add (etiquetaLado);

		campoLado = new JTextField (10);
		campoLado.addActionListener (this);
		contenedor.add (campoLado);

		areaSalida = new JTextArea ();
		areaSalida.setText ("Pantalla de salida: \n\n");
		areaSalida.setEditable( false );
		contenedor.add (areaSalida);

    }

    public void paint (Graphics g) {

		super.paint (g);

		cuadradoDeAsteriscos (lados);

    }


    public void actionPerformed ( ActionEvent evento ) {

	
		lados = Integer.parseInt ( campoLado.getText() );

		repaint ();

    }

}