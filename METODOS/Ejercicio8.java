/*

EJERCICIO 8

El máximo común divisor de los enteros "x" e "y" es el entero más grande que puede
dividir tanto a "x" como a "y". Escriba un método recursivo llamado mcd que devuelva
el máximo común divisor de "x" e "y". El mcd de "x" e "y" se define recursivamente
de la siguiente manera: si "y" es igual a 0, entonces mcd (x,y) e "x"; de no ser
así, mcd (x,y) es mcd (y, x%y), en donde % es el operador modulo.

 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ejercicio8 extends JApplet implements ActionListener {

    JLabel etiquetaX, etiquetaY, etiquetaResultado;

    JTextField campoX, campoY, campoResultado;

    JButton boton;


    public int mcd (int x, int y) {

		if (y == 0) 

			return x;
		
		else return mcd(y , x % y);

    }


    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout());

		etiquetaX = new JLabel ("Introduce entero x: ");
		contenedor.add (etiquetaX);

		campoX = new JTextField(10);
		contenedor.add (campoX);

		etiquetaY = new JLabel ("Introduce entero y: ");
		contenedor.add (etiquetaY);

		campoY = new JTextField (10);
		contenedor.add (campoY);

		etiquetaResultado = new JLabel ("RESULTADO: ");
		contenedor.add (etiquetaResultado);

		campoResultado = new JTextField (10);
		campoResultado.setEditable (false);
		contenedor.add (campoResultado);

		boton = new JButton ("Calcular");
		boton.addActionListener (this);
		contenedor.add (boton);

    }


    public void actionPerformed(ActionEvent actionEvent) {

		int x, y;

		x = Integer.parseInt (campoX.getText());

		y = Integer.parseInt (campoY.getText());

		campoResultado.setText (Integer.toString (mcd(x,y)));

    }

}
