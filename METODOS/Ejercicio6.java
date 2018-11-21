/*

EJERCICIO 6

Escriba un método llamado minimo3 que devuelva el menor de tres números de punto
flotante. Use el método Math.min para implementar minimo3. Incorpore el método
en un applet que reciba como entrada los valores por parte del usuario, y 
determine el valor menor. Muestre el resultado en la barra de estado.

*/

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Ejercicio6 extends JApplet implements ActionListener {


    JLabel etiquetaNumero1,
	etiquetaNumero2,
	etiquetaNumero3;

    JTextField campoNumero1,
	campoNumero2,
	campoNumero3;

    JButton boton;

    public float minimo3 (float numero1, float numero2, float numero3) {

	    return Math.min (numero1, Math.min (numero2, numero3));

    }

    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		etiquetaNumero1 = new JLabel ("Primer número");
		contenedor.add (etiquetaNumero1);

		campoNumero1 = new JTextField (10);
		contenedor.add (campoNumero1);

		etiquetaNumero2 = new JLabel ("Segundo número");
		contenedor.add (etiquetaNumero2);

		campoNumero2 = new JTextField (10);
		contenedor.add (campoNumero2);

		etiquetaNumero3 = new JLabel ("Tercer número");
		contenedor.add (etiquetaNumero3);

		campoNumero3 = new JTextField (10);
		contenedor.add (campoNumero3);

		boton = new JButton ("Calcular mínimo");
		boton.addActionListener (this);
		contenedor.add (boton);

    }
 
    public void actionPerformed(ActionEvent actionEvent) {

		float resultado;

		resultado = minimo3 (Float.parseFloat(campoNumero1.getText()), Float.parseFloat(campoNumero2.getText()), Float.parseFloat(campoNumero3.getText()));

		showStatus (Float.toString(resultado));

    }

}
