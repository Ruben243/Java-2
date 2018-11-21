/*

EJERCICIO 4

Escriba un applet que utilice un método llamado circuloArea, que pida al usuario
el radio de un círculo y que calcule e imprima el área de ese círculo.

*/

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import java.text.DecimalFormat;

public class Ejercicio4 extends JApplet implements ActionListener {

    JLabel etiquetaRadio, etiquetaResultado;
    JTextField campoRadio, campoResultado;

    public void circuloArea (double radio) {

		double resultado;

		DecimalFormat formato = new DecimalFormat (".00");

		resultado = Math.PI * Math.pow (radio,2);

		campoResultado.setText (formato.format(resultado));

    }


    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout() );

		etiquetaRadio = new JLabel ("Introduce el radio del círculo: ");
		contenedor.add (etiquetaRadio);

		campoRadio = new JTextField (10);
		campoRadio.addActionListener (this);
		contenedor.add (campoRadio);

		etiquetaResultado = new JLabel ("Resultado: ");
		contenedor.add (etiquetaResultado);

		campoResultado = new JTextField (50);
		campoResultado.setEditable (false);
		contenedor.add (campoResultado);

    }


    public void actionPerformed(ActionEvent evento) {

		circuloArea (Double.parseDouble (campoRadio.getText ()));

    }


}
