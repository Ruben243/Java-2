/*

EJERCICIO 1

Use el arreglo unidimensional para resolver el siguiente problema; escriba un
applet que reciba como entrada 5 números, cada uno de los cuales debe estar
entre 10 y 100, inclusive. A medida, que se lea cada número, muéstrelo solamente
si no es un duplicado de un número que ya se ha leído. Prepárese para el "peor
caso", en el que los 5 números son diferentes. Use el arreglo más pequeño que
sea posible para resolver este problema. Mostrar los resultados en un objeto
JTextArea. Utilizar el método setText de JTextArea para actualizar los
resultados después que el usuario introduzca cada uno de los valores.

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ejercicio1 extends JApplet implements ActionListener {

    JLabel etiquetaNumero;

    JTextField campoNumero;

    JTextArea areaSalida;

    int matriz[] = new int[5];

    int contadorNumeros;


    public boolean buscarNumero (int numero) {


		boolean encontrado = false;


		for (int i = 0; i < matriz.length; i++) {

			if (matriz[i] == numero) 

			encontrado = true;

		}

		return encontrado;

    }

 
    public void init () {

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		etiquetaNumero = new JLabel ("Introduce número (10-100): ");
		contenedor.add (etiquetaNumero);

		campoNumero = new JTextField (10);
		campoNumero.addActionListener (this);
		contenedor.add (campoNumero);

		areaSalida = new JTextArea ();
		areaSalida.setEditable (false);
		contenedor.add (areaSalida);

		contadorNumeros = 0;

    }


    public final void actionPerformed(ActionEvent actionEvent) {

		String cadenaNumero;

		int numero;

		if (contadorNumeros < 5) {

			cadenaNumero = campoNumero.getText();

			numero = Integer.parseInt (cadenaNumero);


			if (numero >= 10 && numero <=100) {

			if (buscarNumero (numero)) {

				areaSalida.setText ("NÚMERO YA INTRODUCIDO");

			}
			else {

				areaSalida.setText (Integer.toString(numero));
				
				matriz[contadorNumeros] = numero;
				
				contadorNumeros++;

			}

			}
			else {

			areaSalida.setText ("El número debe de estar entre 10 y 100");

			}

		}
		else {

			areaSalida.setText ("Ya se han introducido todos los números");

		}

    }

}
