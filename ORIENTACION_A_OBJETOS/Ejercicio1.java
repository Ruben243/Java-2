/*

EJERCICIO 1

Cree una clase llamada Rectangulo. La clase debe de tener los atributos longitud
y anchura, cada uno de los cuales debe de tener un valor predeterminado de 1. Debe
tener también métodos para calcular el perímetro y el area rectángulo. Debe de
tener los métodos establecer y obtener tanto para la longítud como para anchura.
Los métodos establecer deben de verificar que la longitud y la anchura sean números
en coma flotante mayores que 0.0 y menores que 20.0. Escriba un programa para
probar la clase Rectangulo.


NOTA: La fuente de salida debe de ser arial, tamaño 12.

*/



import javax.swing.*;

import java.awt.event.*;
import java.awt.*;



class Rectangulo {


    private double longitud;
    private double anchura;



    public Rectangulo ()  {


		establecerLongitud (1);
		establecerAnchura (1);

    }


    public void establecerLongitud (double longitud)  {


		this.longitud =	(longitud >= 0.0 && longitud <= 20.0 ? longitud : 1);

    }


    public void establecerAnchura (double anchura) {


		this.anchura = (anchura >= 0.0 && anchura <= 20.0 ? anchura : 1);

    }


    public double obtenerLongitud () {


		return longitud;

    }


    public double obtenerAnchura () {


		return anchura;

    }


    public double calcularPerimetro () {


		return  2 * obtenerAnchura () +  2 * obtenerLongitud ();

    }


    public double calcularArea () {


		return obtenerAnchura () * obtenerLongitud ();

    }

}



public class Ejercicio1 extends JApplet implements ActionListener {


    JLabel etiquetaLongitud,
	etiquetaAnchura;

    JTextField campoLongitud,
	campoAnchura;

    JTextArea areaResultado;



    public void init () {


		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout());


		etiquetaLongitud = new JLabel ("Longitud");
		contenedor.add (etiquetaLongitud);

		campoLongitud = new JTextField (10);
		campoLongitud.addActionListener (this);
		contenedor.add (campoLongitud);

		etiquetaAnchura = new JLabel ("Anchura");
		contenedor.add (etiquetaAnchura);

		campoAnchura = new JTextField (10);
		campoAnchura.addActionListener (this);
		contenedor.add (campoAnchura);

		areaResultado = new JTextArea ();
		areaResultado.setEditable (false);
		areaResultado.setFont (new Font ("Arial", Font.PLAIN, 12));
		contenedor.add (areaResultado);

    }


    public void actionPerformed (ActionEvent evento) {


		Rectangulo rectangulo = new Rectangulo ();


		if (evento.getSource () == campoLongitud) {

			rectangulo.establecerLongitud (Double.parseDouble (campoLongitud.getText()));

		} else if (evento.getSource () == campoAnchura) {

			rectangulo.establecerAnchura (Double.parseDouble (campoAnchura.getText()));

		}


		areaResultado.setText ("El perímetro del rectangulo es " + rectangulo.calcularPerimetro () +
					   "\nEl area del rectangulo es " + rectangulo.calcularArea ());

    }

}