/*

EJERCICIO 5


Implemente los siguientes métodos enteros:

a ) El método centigrados que devuelva la equivalencia en grados Centígrados de
una temperatura en grados Fahrenheit, utilizando el cálculo:

C = 5.0 / 9.0 * ( F - 32 );

b ) El método fahrenheit que devuelve la equivalencia en grados Fahrenheit de una
temperatura en grados Centígrados, utilizando el cálculo:

F = 9.0 / 5.0 * C + 32;

c ) Utilice los métodos de las partes (a) y (b) para escribir un applet que
permite al usuario, ya sea escribir una temperatura en grados Fahrenheit y mostrar
su equivalente en grados Centígrados, o escribir una temperatura en grados
Centígrados y mostrar su equivalente en grados Fahrenheit.

Nota: Este applet requerirá dos objetos JTextField que tengan eventos de acción
registrados. Cuando se llama a actionPerformed, el parámetro ActionEvent cuenta
con el método getSource() para determinar con cuál componente de la GUI 
interactuó el usuario. El método actionPerformed debe contener una instrucción
if .. else de la forma

if ( actionEvent.getsource()  == entrada1 ) {
	// procesar la interacción de entrada1 aquí
}
else {
	if ( actionEvent.getSource() == entrada2 ) {
		// procesar la interacción de entrada2 aquí
	}
}

donde entrada1 y entrada2 son referencia a objetos JTextField

*/

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.text.DecimalFormat;

public class Ejercicio5 extends JApplet implements ActionListener {

    JLabel etiquetaGradosCentigrados,
	etiquetaGradosFahrenheit,
	etiquetaResultado;

    JTextField campoGradosCentigrados,
	campoGradosFahrenheit,
	campoResultado;


    public double centigrados (double grados) {

		return 5.0 / 9.0 * ( grados - 32 );

    }

    public double fahrenheit (double grados) {

		return 9.0 / 5.0 * grados + 32;

    }

    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout() );

		etiquetaGradosCentigrados = new JLabel ("Grados Centígrados");
		contenedor.add (etiquetaGradosCentigrados);

		campoGradosCentigrados = new JTextField (10);
		campoGradosCentigrados.addActionListener (this);
		contenedor.add (campoGradosCentigrados);

		etiquetaGradosFahrenheit = new JLabel ("Grados Fahrenheit");
		contenedor.add (etiquetaGradosFahrenheit);

		campoGradosFahrenheit = new JTextField (10);
		campoGradosFahrenheit.addActionListener (this);
		contenedor.add (campoGradosFahrenheit);

		etiquetaResultado = new JLabel ("RESULTADO: ");
		contenedor.add (etiquetaResultado);

		campoResultado = new JTextField (10);
		campoResultado.setEditable (false);
		contenedor.add (campoResultado);

    }

    public void actionPerformed (ActionEvent evento) {

		DecimalFormat formato = new DecimalFormat (".00");

		if (evento.getSource() == campoGradosCentigrados) {

			campoResultado.setText (formato.format(fahrenheit(Double.parseDouble(campoGradosCentigrados.getText()))));

		}
		else {

			campoResultado.setText (formato.format(centigrados(Double.parseDouble(campoGradosFahrenheit.getText()))));

		}

    }
}
