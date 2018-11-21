/*

EJERCICIO 1


Escriba un programa que dibuje una serie ocho de círculos concéntricos. Los círculos
deberán estar separados por 10 píxeles. Use el método drawOval de la clase
Graphics.


*/


import javax.swing.JFrame;

import java.awt.*;


class Ventana extends JFrame {


	public Ventana () {

		super ("Dibujar círculos concéntricos");

	}


	public void paint (Graphics g) {

		super.paint (g);

		for (int i = 1; i <= 8; i++) 

		g.drawOval (50 + i * 10,50 + i * 10,400 - i * 20,400 - i * 20);

	}

}



public class Ejercicio1 {


    public Ejercicio1 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (500,500);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }


    public static void main (String args[]) {


		Ejercicio1 ejercicio = new Ejercicio1 ();

    }

}
