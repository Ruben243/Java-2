/*

EJERCICIO 9

Escriba un applet que juegue a "adivina un número" de la siguiente manera: su
programa elige el número a adivinar, seleccionando un enteror aleatorio en el
rango de 1 a 1000. El applet muestra el indicador "Adivina un número entre 1 y 1000"
enseguida de un objeto JTextField. El jugador escribe su primer intento en el
objeto JTextField y oprime Intro. Si la respuesta del jugador es incorrecta, su
programa debe mostrar el mensaje "Demasiado alto, Intentelo de nuevo", o "Demasiado
bajo, Intente de nuevo", en la barra de estado, para ayudar que el jugador se
acerque a la respuesta correcta. El programa debe borrar el objeto JTextField de
manera que el usuario pueda escribir su siguiente intento. Cuando el usuario
escriba la respuesta correcta, muestre el mensaje ¡Felicidades, Adivinó el número!
en la barra de estado y borre el objeto JTextField de manera que el usuario pueda
jugar otra vez.

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio9 extends JApplet implements ActionListener {

    JLabel etiquetaEnunciado;

    JTextField campoValor;

    int numero;


    public int generarNumero () {

		return (int) (1 + (Math.random () * 1001));
    
    }


    public void init () {

		Container contenedor = getContentPane();
		contenedor.setLayout (new FlowLayout ());

		etiquetaEnunciado = new JLabel ("Adivine un número entre 1 y 1000: ");
		contenedor.add (etiquetaEnunciado);

		campoValor = new JTextField (10);
		campoValor.addActionListener (this);
		contenedor.add (campoValor);

		numero = generarNumero();

    }


    public void actionPerformed(ActionEvent actionEvent) {

		int valor;

		valor = Integer.parseInt (campoValor.getText());

		if (valor == numero) {

			showStatus ("¡Felicidades, Adivinó el número");

			campoValor.setText ("");

			numero = generarNumero ();

		}
		else if ( valor < numero ) {

			showStatus ("Demasiado bajo, intente de nuevo");

			campoValor.setText ("");

		}
		else {

			showStatus ("Demasiado alto, intente de nuevo");

			campoValor.setText ("");

		}

    }

}
