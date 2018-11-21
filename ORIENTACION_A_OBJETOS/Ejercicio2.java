/*

EJERCICIO 2

Cree una clase llamada Racional para realizar operaciones aritméticas con
fracciones. Escriba un programa para probar su clase. Use variables enteras
para representar las variables de instancia private de la clase: el numerador
y el denominador. Proporcione un constructor que permita a un objeto de esta
clase inicializarse al ser declarado. El constructor debe de almacenar la
fracción de manera reduccida; la fracción 2/4 es equivalente 1/2 y debe de
guardarse en el objeto como 1 en el numerador y 2 en el denominador. Proporcione
un constructor sin argumentos con valores predeterminados, en caso de que no se
proporcionen inicializadores. Proporcione métodos public que realicen cada una
de las siguientes operaciones:

a) Sumar dos números Racional: el resultado de la suma debe de almacenarse en forma
reducida.
b) Restar dos números Racional: el resultado de la resta debe de almacenarse en
forma reducida.
c) Multiplicar dos números Racional: el resultado de la resta debe de almacenarse en
forma reducida.
d) Dividir dos números Racional: el resultado de la resta debe de almacenarse en
forma reducida.
e) Imprimir números Racional en la forma a/b, en done a es el numerador y b el
denominador.
f) Imprimir números Racional en formato de punto flotante.


NOTA: Resultados en ARIAL, tamaño 12.

*/



import javax.swing.*;

import java.text.DecimalFormat;

import java.awt.*;
import java.awt.event.*;



class Racional {


    private int numerador;
    private int denominador;


    private int mcd (int a, int b) {


		if (b == 0)

			return a;

		else return mcd (b, a - b * (a/b));

    }


    public Racional (int numerador, int denominador) {


		establecerNumerador (numerador, denominador);
		establecerDenominador (numerador, denominador);

    }


    private void establecerNumerador (int numerador, int denominador) {


		this.numerador = numerador / mcd (numerador,denominador);

    }


   private void establecerDenominador (int numerador, int denominador) {


       this.denominador = denominador / mcd (numerador, denominador);

    }


    public int obtenerNumerador () {


		return this.numerador;

    }


    public int obtenerDenominador () {


		return this.denominador;

    }


    public Racional sumarRacional (Racional operando2) {


		Racional resultado;

		int numerador,
			denominador;



		numerador = 0;
		denominador = 0;


		if (obtenerDenominador () == operando2.obtenerDenominador () ) {

			numerador = obtenerNumerador () + operando2.obtenerNumerador ();

			denominador = obtenerDenominador ();

			resultado = new Racional (numerador, denominador);

		}
		else {

			numerador = (obtenerNumerador () * operando2.obtenerDenominador ()) + (operando2.obtenerNumerador () * obtenerDenominador ());

			denominador = obtenerDenominador () * operando2.obtenerDenominador ();	    
			resultado = new Racional (numerador, denominador);

		}

		return resultado;

    }


    public Racional restarRacional (Racional operando2) {


		Racional resultado;

		int numerador,
			denominador;

		numerador = 0;
		denominador = 0;


		if (obtenerDenominador () == operando2.obtenerDenominador () ) {

			numerador = obtenerNumerador () - operando2.obtenerNumerador ();

			denominador = obtenerDenominador ();

			resultado = new Racional (numerador, denominador);

		}
		else {

			numerador = (obtenerNumerador () * operando2.obtenerDenominador ()) - (operando2.obtenerNumerador () * obtenerDenominador ());
		   
			denominador =  obtenerDenominador () * operando2.obtenerDenominador ();
	 
			resultado = new Racional (numerador, denominador);

		}

		return resultado;
    }


    public Racional multiplicarRacional (Racional operando2) {


		Racional resultado;

		int numerador,
			denominador;


		numerador = obtenerNumerador () * operando2.obtenerNumerador ();

		denominador = obtenerDenominador () * operando2.obtenerDenominador ();

		resultado = new Racional (numerador, denominador);

		return resultado;

    }


    public Racional dividirRacional (Racional operando2) {


		Racional resultado;

		int numerador,
			denominador;


		numerador = obtenerNumerador () * operando2.obtenerDenominador ();

		denominador = obtenerDenominador () * operando2.obtenerNumerador ();

		resultado = new Racional (numerador, denominador);

		return resultado;

    }


    public String imprimirRacional1 () {


		String cadena;


		cadena = obtenerNumerador() + "/" + obtenerDenominador ();

		return cadena;

    }


    public String imprimirRacional2 () {


		String cadena;
		
		DecimalFormat dosDigitos = new DecimalFormat ("0.00");

		cadena = dosDigitos.format((double) obtenerNumerador () / obtenerDenominador ());

		return cadena;

    } 

}



public class Ejercicio2 extends JApplet implements ActionListener {


    JLabel etiquetaNumerador1,
	etiquetaDenominador1,
	etiquetaNumerador2,
	etiquetaDenominador2;

    JTextField campoNumerador1,
	campoDenominador1,
	campoNumerador2,
	campoDenominador2;

    JButton botonCalcular;

    JTextArea areaResultados;



    public void init () {


		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		etiquetaNumerador1 = new JLabel ("Numerador 1");
		contenedor.add (etiquetaNumerador1);

		campoNumerador1 = new JTextField (10);
		contenedor.add (campoNumerador1);

		etiquetaDenominador1 = new JLabel ("Denominador 1");
		contenedor.add (etiquetaDenominador1);

		campoDenominador1 = new JTextField (10);
		contenedor.add (campoDenominador1);

		etiquetaNumerador2 = new JLabel ("Numerador 2");
		contenedor.add (etiquetaNumerador2);

		campoNumerador2 = new JTextField (10);
		contenedor.add (campoNumerador2);

		etiquetaDenominador2 = new JLabel ("Denominador 2");
		contenedor.add (etiquetaDenominador2);

		campoDenominador2 = new JTextField (10);
		contenedor.add (campoDenominador2);

		areaResultados = new JTextArea (20,20);
		areaResultados.setEditable (false);
		areaResultados.setFont (new Font ("Arial", Font.PLAIN, 12));
		contenedor.add (areaResultados);

		botonCalcular = new JButton ("CALCULAR");
		botonCalcular.addActionListener (this);
		contenedor.add (botonCalcular);

    }


    public final void actionPerformed(final ActionEvent actionEvent) {


	int numerador1,
	    denominador1,
	    numerador2,
	    denominador2;

	Racional numero1,
	    numero2,
	    resultado;


		numerador1 = Integer.parseInt (campoNumerador1.getText());
		denominador1 = Integer.parseInt (campoDenominador1.getText());

		numerador2 = Integer.parseInt (campoNumerador2.getText());
		denominador2 = Integer.parseInt (campoDenominador2.getText());

		numero1 = new Racional (numerador1, denominador1);
		numero2 = new Racional (numerador2, denominador2);
			
		resultado = numero1.sumarRacional (numero2);

		areaResultados.setText (numero1.imprimirRacional1 () + " + " + numero2.imprimirRacional1 () + " = " + resultado.imprimirRacional1 () + " = " + resultado.imprimirRacional2 () + "\n\n" );
		
		resultado = numero1.restarRacional (numero2);

		areaResultados.append (numero1.imprimirRacional1 () + " - " + numero2.imprimirRacional1 () + " = " + resultado.imprimirRacional1 () + " = " + resultado.imprimirRacional2 () + "\n\n" );

		resultado = numero1.multiplicarRacional (numero2);

		areaResultados.append (numero1.imprimirRacional1 () + " * " + numero2.imprimirRacional1 () + " = " + resultado.imprimirRacional1 () + " = " + resultado.imprimirRacional2 () + "\n\n" );

		resultado = numero1.dividirRacional (numero2);

		areaResultados.append (numero1.imprimirRacional1 () + " : " + numero2.imprimirRacional1 () + " = " + resultado.imprimirRacional1 () + " = " + resultado.imprimirRacional2 () + "\n\n" );

    }

}
