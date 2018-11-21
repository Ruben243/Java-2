/*

EJERCICIO 1

Escriba un método llamado esPar que utilice el operador residuo (%) para
determinar si un entero dado es par. El metodo debe de tomar un argumento
entero y devolver true si el entero es par, y false en caso contrario. Incorpore
este método en un applet que reciba como entrada una secuencia de enteros (uno
a la vez, utilizando un objeto JTextField).

*/

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Ejercicio1 extends JApplet implements ActionListener {

    JTextField campoNumero;
    JLabel etiquetaNumero;


    public boolean esPar (int numero) {

		if ( numero % 2 == 0 )

			return true;

		else return false;

    }

    public void init () {

		Container contenedor = getContentPane();
		contenedor.setLayout ( new FlowLayout() );

		etiquetaNumero = new JLabel ("Intoduce el número: ");
		contenedor.add (etiquetaNumero);

		campoNumero = new JTextField (10);
		campoNumero.addActionListener (this);
		contenedor.add (campoNumero);

    }

    public void actionPerformed (ActionEvent actionEvent) {

		int numeroIntroducido;

		numeroIntroducido = Integer.parseInt (campoNumero.getText());

		showStatus ("Calculando ... ");

		if ( esPar(numeroIntroducido) )

			showStatus ("El número introducido es PAR");

		else

			showStatus ("El número introducido NO ES PAR");

    }

}

