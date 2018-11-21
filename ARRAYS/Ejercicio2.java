/*

EJERCICIO 2

Una pequeña aerolínea acaba de comprar un ordenador para su nuevo sistema de
reservas automatizado. Se le pide realizar un programa para el nuevo sistema.
Usted va a escribir un applet para asignar asientos en cada vuelo del único
avión de las aerolíneas (capacidad: 10 asientos).

Su programa debe mostrar las siguientes alternativas: Por favor escriba 1 para
PrimeraClase y Por favor escriba 2 para Económico. Si el usuario escribe 1, su
programa debe asignarle un asiento en la sección de primera clase (asientos 1 a 5).
Si la persona escribe 2, su programa debe asignarle un asiento en la sección
económica (asientos 6 a 10). Su programa deberá entonces imprimir un pase de
abordaje, indicando el número del asiento de la persona y si se encuentra en la
sección de primera clase o económica del avión.

Usar una matriz unidimensional del tipo primitivo boolean para representar la
tabla de asientos del avión.Inicialice, todos los elementos del arreglo con false
para indicar que todos los asientos estan vacíos. A medida que se asigne cada
asiento, establezca los elementos correspondientes del arreglo en true para inidicar
que ese elemento ya no está disponible.

Su programa nunca deberá asignar un asiento que ya haya sido asignado. Cuando esté
llena la sección indicar "SU SECCIÓN ESTA COMPLETA, RESERVA NO REALIZADA".


NOTA: Utilizar una fuente Monospaced, negrita, tamaño 12 para el mensaje de solicitud de opción y una fuente ARIAL, negrita, tamaño 14 para mostrar el
billete


*/


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class Ejercicio2 extends JApplet implements ActionListener {


    JTextArea areaMensaje,
	areaResultado;

    JTextField campoOpcion;

    boolean[] avion;



    public int asignarAsiento (int inicioSeccion, int finalSeccion) {


		int numeroAleatorio;

		boolean asientoAsignado;


		asientoAsignado = false;

		do {
		
			numeroAleatorio = inicioSeccion + (int) (Math.random() * ((finalSeccion - inicioSeccion) + 1));

			if (avion[numeroAleatorio]) {

			asientoAsignado = false;

			}
			else {

			avion[numeroAleatorio] = true;

			asientoAsignado = true;

			}

		} while (!asientoAsignado);


		return numeroAleatorio;

    }


    public boolean seccionLlena (int inicioSeccion, int finalSeccion) {


		boolean llena = true;

		for (int i=inicioSeccion; i <= finalSeccion; i++ ) {

			if (avion[i] == false) {

			llena = false;
			break;

			}

		}

		return llena;
    }


    public void inicializarAvion () {

		avion = new boolean[11];

		for (int i=0; i<avion.length; i++ ) 

			avion [i] = false;

    }


    public void init () {


		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		areaMensaje = new JTextArea ();
		areaMensaje.setText ("Por favor escriba 1 para Primera Clase\n y Por favor escriba 2 para Economico: ");
		areaMensaje.setEditable (false);
		areaMensaje.setFont (new Font ("Monospaced", Font.BOLD, 12));
		contenedor.add (areaMensaje);

		campoOpcion = new JTextField (10);
		campoOpcion.addActionListener (this);
		contenedor.add (campoOpcion);

		areaResultado = new JTextArea ();
		areaResultado.setEditable (false);
		areaResultado.setFont (new Font ("Arial", Font.BOLD, 14));
		contenedor.add (areaResultado);

		inicializarAvion ();

    }


    public final void actionPerformed(ActionEvent evento) {

		int reserva;

		String cadenaReserva,
			mensaje;



		if (!seccionLlena (1,10)) {

			cadenaReserva = campoOpcion.getText ();

			reserva = Integer.parseInt (cadenaReserva);

			switch (reserva) {

			case 1: 

			if (!seccionLlena (1,5)) {

				mensaje = "PASE DEL AVIÓN\n\n";

				mensaje += "ASIENTO PRIMERA CLASE " + asignarAsiento (1,5);

			}

			else

				mensaje = "SECCIÓN PRIMERA COMPLETA\n\nRESERVA NO REALIZADA";
			break;

			case 2:

			if (!seccionLlena (6,10)) {

				mensaje = "PASE DEL AVIÓN\n\n";

				mensaje += "ASIENTO CLASE ECONÓMICA " + asignarAsiento (6,10);

			}

			else 

				mensaje = "SECCIÓN ECONÓMICA COMPLETA\n\nRESERVA NO REALIZADA";

			break;

			default: 

			mensaje = "OPCIÓN INCORRECTA";

			break;

			}

		}
		else {

			mensaje = "AVIÓN COMPLETO";

			campoOpcion.setEditable (false);

		}

		areaResultado.setText (mensaje);

    }

}
