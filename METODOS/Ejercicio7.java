/*

EJERCICIO 7


Escriba un método recursivo llamado potencia (base, exponente) que, al ser
llamado, devuelva el resultado de

	base(elevado exponente)

Por ejemplo pontencia (3, 4) = 3 * 3 * 3 * 3. Suponga exponente es un entero
mayor o igual a 1.

Ayuda:

base (elevado a exponente) = base * base (elevado a exponente - 1 )

caso elemental:

base (elevado a 1) = base

*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio7 extends JApplet implements ActionListener {

    JLabel etiquetaExponente,
	etiquetaBase,
	etiquetaResultado;

    JTextField campoExponente,
	    campoBase,
	    campoResultado;

    JButton boton;

    public int potencia (int base, int exponente) {

		if (exponente == 1 )

			return base;

		else

			return base * potencia (base,exponente-1);

    }

    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());


		etiquetaExponente = new JLabel ("Introduce el exponente de la potencia: ");
		contenedor.add (etiquetaExponente);

		campoExponente = new JTextField (10);
		contenedor.add (campoExponente);

		etiquetaBase = new JLabel ("Introduce la base de la potencia: ");
		contenedor.add (etiquetaBase);

		campoBase = new JTextField (10);
		contenedor.add (campoBase);

		etiquetaResultado = new JLabel ("RESULTADO: ");
		contenedor.add (etiquetaResultado);

		campoResultado = new JTextField (10);
		campoResultado.setEditable (false);
		contenedor.add (campoResultado);

		boton = new JButton ("Calcular potencia");
		boton.addActionListener (this);
		contenedor.add (boton);

    }

    public void actionPerformed(ActionEvent actionEvent) {

		int base, exponente;

		exponente = Integer.parseInt (campoExponente.getText());

		base = Integer.parseInt (campoBase.getText());

		campoResultado.setText (Integer.toString(potencia(base,exponente)));

    }

}
