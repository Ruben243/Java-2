/*

EJERCICIO 2

Crear la siguiente GUI. No hay que proporcionar ninguna funcionalidad.

*/


import javax.swing.*;
import java.awt.*;



class Ventana extends JFrame {

	private GridLayout esquema;
	private JButton[] botones;
	private String[] elementos =  {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};;



	public Ventana () {

	    super ("Calculadora");

	    esquema = new GridLayout (4,4,5,5);

	    Container contenedor = getContentPane ();
	    contenedor.setLayout (esquema);


	    botones = new JButton[16];


	    for (int i=0; i < elementos.length; i++) {

			botones[i] = new JButton (elementos[i]);

			contenedor.add (botones[i]);

	    }
      
	}

}



public class Ejercicio2 {



    public Ejercicio2 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (300,300);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {

		Ejercicio2 ejercicio = new Ejercicio2 ();

    }

}
