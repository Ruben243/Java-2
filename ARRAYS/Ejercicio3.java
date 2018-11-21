/*

EJERCICIO 3

En este problema usted recreará la clásica carrera de la tortuga y la liebre.
Utilizará la generación de números aleatorios para desarrollar una simulación
de este memorable suceso.

Nuestros competidores empezarán la carrera en la posición 1 de 70 posiciones.
Cada posición representa a una posible posición a lo largo del curso de la
carrera. La linea de meta se encuentra en la posición 70. El primer
competidor en llegar a la posición 70 recibirá una cubeta llena con zanahorias
y lechuga frescas. El recorrido se abre paso hasta la cima de una resbalosa
montaña, por lo que ocasionalmente los competidores pierden terreno.

Un reloj hace tictac una vez por segundo. Con cada tic del reloj, su applet debe
ajustar la posición de los animales de acuerdo a unas reglas. Use variables para
llevar a cabo el registro de las posiciones de los animales (los números son
del 1 al 70). Empiece con cada animal en la posición 1 (la "puerta de inicio").
Si un animal se resbala hacia la izquierda antes de la posición 1, regréselo a
la posición 1.

Reglas:

Se generan produciendo un número aleatorio i para la tortuga y otro para la liebre.

Los números cada uno de ellos en el rango de 1 a 10, ambos inclusive.

TORTUGA

"Paso pesado rápido" cuando 1 <= i <= 5, 3 posiciones a la derecha
"Resbalón" cuando 6 <= i <= 7, 6 posiciones a la izquierda
"Paso pesado lento" cuando 8 <= i <= 10, 1 posición a la derecha

LIEBRE

"Dormir" cuando 1 <= j <= 2, Ningún movimiento
"Gran salto" cuando 3 <= j <= 4, 9 posiciones a la derecha
"Gran resbalón" cuando 5 <= j <= 6, 12 posiciones a la izquierda
"Pequeño salto" cuando 7 <= j <= 9, 1 posición a la derecha
"Pequeño resbalón" cuando j = 10, 2 posiciones a la izquierda

Empiece la carrera imprimiendo el mensaje

¡¡¡ PUM !!!
¡¡¡ Y ARRANCAN !!!

Luego para cada tic de reloj, imprima una línea de 70 posiciones, mostrando la
letra T en la posición de la tortuga y la letra L en la posición de la liebre.
En ocasiones los competidores se encontrarán en la misma posición. En este caso,
la tortuga muerde a la liebre y su programa debe imprimir ¡¡OUCH!! Empezando en
esa posición. Todas las posiciones de impresión distintas de la T, la L o el
mensaje ¡¡ OUCH !! (en caso de un empate) deben estar en blanco.

Después de imprimir cada linea, compruebe si uno de los animales ha llegado o se
ha pasado de la posición 70. De ser así, imprima quien fue el ganador y termine
la simulación. Si la tortuga gana, imprima ¡¡¡ LA TORTUGA GANA !!! ¡¡¡ YAY !!!.
Si la liebre gana. Qué mal. Si ambos animales ganan en el mismo tic del reloj
tal vez usted quiera favorecer a la tortuga o tal vez quiera imprimir ES UN EMPATE.
Si ninguno de los dos animales gana, ejecute el ciclo de nuevo para simular el 
siguiente tic del reloj.


NOTA: Mostrar el recorrido con letra ARIAL, TAMAÑO 14;

*/


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio3 extends JApplet implements ActionListener {

    JButton botonReloj;

    JLabel etiquetaRecorrido;

    JTextArea campoRecorrido;

    boolean[] recorridoTortuga;
    boolean[] recorridoLiebre;
    boolean empezarCarrera;


    public void inicializarRecorrido (boolean[] matriz) {


		for (int i = 0; i < matriz.length; i++) {

			matriz[i] = false;

		}


    }


    public int posicionRecorrido (boolean[] matriz) {

		int posicion;

		for (posicion=1; posicion < matriz.length; posicion++) {

			if (matriz[posicion] == true)

			break;

		}

		return posicion;

    }


    public int posicionesRecorridasTortuga () {


		int numeroAleatorio;
		int posiciones;

		posiciones = 0;

		numeroAleatorio = 1 + (int) (Math.random() * 10);

		if (numeroAleatorio >= 1 && numeroAleatorio <= 5) {

			posiciones = 3;

		}
		else 
			if (numeroAleatorio >= 6 && numeroAleatorio <= 7) {

			posiciones = -6;

			}
			else if (numeroAleatorio >= 8 && numeroAleatorio <= 10) {

			posiciones = 1;

			}

		return posiciones;

    }


    public int posicionesRecorridasLiebre () {


		int numeroAleatorio;
		int posiciones;

		posiciones = 0;

		numeroAleatorio = 1 + (int) (Math.random() * 10);

		if (numeroAleatorio >= 1 && numeroAleatorio <= 2) {

			posiciones = 0;

		}
		else 
			if (numeroAleatorio >= 3 && numeroAleatorio <= 4) {

			posiciones = 9;

			}
			else if (numeroAleatorio >= 5 && numeroAleatorio <= 6) {

			posiciones = -12;

			}
			else if (numeroAleatorio >= 7 && numeroAleatorio <= 9) {

			posiciones = 1;

			}
			else if (numeroAleatorio == 10) {

			posiciones = -2;

			}

		return posiciones;

    }


    public void imprimirCarrera (int posicionTortuga, int posicionLiebre) {

		String cadenaTortuga;
		String cadenaLiebre;

		cadenaTortuga = "";
		cadenaLiebre = "";



			for (int i=1; i<=posicionTortuga-1; i++)

			cadenaTortuga += " ";


		for (int i=1; i<=posicionLiebre-1; i++)

			cadenaLiebre += " ";


		if (posicionTortuga == posicionLiebre && empezarCarrera == true) {

			cadenaTortuga += "¡¡OUCH!! - T";
			cadenaLiebre += "L";
		}
		else {

			cadenaTortuga += "T";
			cadenaLiebre += "L";

		}

		for (int i=posicionTortuga+1; i<=70; i++)

			cadenaTortuga += " ";

		for (int i=posicionLiebre+1; i<=70; i++)

			cadenaLiebre += " ";

		if (posicionTortuga == 70 && posicionLiebre == 70) {

			cadenaTortuga += "   ES UN EMPATE  ";
			cadenaLiebre += "   ES UN EMPATE  ";

		}
		else if (posicionTortuga == 70)

			cadenaTortuga += "  ¡¡¡ LA TORTUGA GANA !!! ¡¡¡ YAY !!!  ";

		else  if (posicionLiebre == 70)

			cadenaLiebre += " ¡¡¡ QUE PENA LA TORTUGA HA PERDIDO !!!";

		campoRecorrido.setText (cadenaTortuga + "\n" + cadenaLiebre);

    }


    public void init () {


		recorridoTortuga = new boolean[71];
		recorridoLiebre = new boolean[71];
		
		empezarCarrera = false;

		//Inicializamos el recorrido

		inicializarRecorrido (recorridoTortuga);
		inicializarRecorrido (recorridoLiebre);

		//Colocar la tortuga y la liebre en la posición inicial

		recorridoTortuga[1] = true;
		recorridoLiebre[1] = true;


		//Crear interfaz gráfico
		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		etiquetaRecorrido = new JLabel ("Recorrido: ");
		contenedor.add (etiquetaRecorrido);

		campoRecorrido = new JTextArea ();
		campoRecorrido.setEditable (false);
		campoRecorrido.setFont (new Font ("Arial", Font.PLAIN, 14));
		contenedor.add (campoRecorrido);

		botonReloj = new JButton ("Tic Tac");
		botonReloj.addActionListener (this);
		contenedor.add (botonReloj);

		campoRecorrido.setText ("¡¡¡PUM!!!\n¡¡¡Y ARRANCA!!!");
		imprimirCarrera (1,1);

    }


    public void actionPerformed(ActionEvent actionEvent) {

		int posicionTortuga,
			posicionLiebre,
			posicionesTortuga,
			posicionesLiebre,
			nuevaPosicionTortuga,
			nuevaPosicionLiebre;

		empezarCarrera = true;

		posicionTortuga = posicionRecorrido (recorridoTortuga);
		posicionLiebre = posicionRecorrido (recorridoLiebre);

		posicionesTortuga = posicionesRecorridasTortuga ();
		posicionesLiebre = posicionesRecorridasLiebre ();

		nuevaPosicionTortuga = posicionTortuga + posicionesTortuga;
		nuevaPosicionLiebre = posicionLiebre + posicionesLiebre;

		nuevaPosicionTortuga = (nuevaPosicionTortuga < 1 ?  1 : nuevaPosicionTortuga);
		nuevaPosicionLiebre = (nuevaPosicionLiebre < 1 ? 1 : nuevaPosicionLiebre);

		nuevaPosicionTortuga = (nuevaPosicionTortuga > 70 ? 70 : nuevaPosicionTortuga);
		nuevaPosicionLiebre = (nuevaPosicionLiebre > 70 ? 70 : nuevaPosicionLiebre);

		recorridoTortuga[posicionTortuga] = false;
		recorridoLiebre[posicionLiebre] = false;

		recorridoTortuga[nuevaPosicionTortuga] = true;
		recorridoLiebre[nuevaPosicionLiebre] = true;

		imprimirCarrera (nuevaPosicionTortuga, nuevaPosicionLiebre);

    }

}
