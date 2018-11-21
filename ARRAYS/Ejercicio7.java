/*

EJERCICIO 7

Crear un applet el cuál os pida en un JTextField el número de elementos que van
a componer el array unidimensional y después de introducir ese número, que ponga ese JTextField
como no editable y en otro diferente os vaya pidiendo enteros uno a uno para rellenar
el array. Una vez introducidos todos los enteros, mostrar el resultado del array
en un JTextArea.

*/


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class Ejercicio7 extends JApplet implements ActionListener {

    JLabel etiquetaNumeroElementos,
	etiquetaElemento;

    JTextField campoNumeroElementos,
	campoElemento;

    JTextArea areaSalida;

    int matriz[];

    int posicion;

	
    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout());

		etiquetaNumeroElementos = new JLabel ("Introduce el número de elementos del array: ");
		contenedor.add (etiquetaNumeroElementos);

		campoNumeroElementos = new JTextField (10);
		campoNumeroElementos.addActionListener (this);
		contenedor.add (campoNumeroElementos);

		etiquetaElemento = new JLabel ("Introduce el elemento: ");
		contenedor.add (etiquetaElemento);

		campoElemento = new JTextField (10);
		campoElemento.setEditable (false);
		campoElemento.addActionListener (this);
		contenedor.add (campoElemento);

		areaSalida = new JTextArea ();
		areaSalida.setEditable (false);
		contenedor.add (areaSalida);

		posicion = 0;

    }


    public void actionPerformed (ActionEvent evento) {

		if (evento.getSource() == campoNumeroElementos) {

			if (Integer.parseInt (campoNumeroElementos.getText()) != 0) {

				campoNumeroElementos.setEditable (false);
				campoElemento.setEditable (true);

				etiquetaElemento.setText ("Introduce el elemento 1");

				matriz = new int[Integer.parseInt (campoNumeroElementos.getText())];

			}
		
		}
		else {

			matriz[posicion] = Integer.parseInt (campoElemento.getText());

			posicion++;

			if (posicion == matriz.length) {

				campoElemento.setEditable (false);

				for (int i=0; i < matriz.length; i++) {

					areaSalida.append (Integer.toString(matriz[i]) + " ");

				}

			}
			else etiquetaElemento.setText ("Introduce el elemento " + (posicion+1));


		}
		}

}