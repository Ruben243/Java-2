/*

EJERCICIO 2


Escriba un programa que dibuje una serie de ocho círculos concénctricos. Los
círculos deberán estar separados por 10 píxeles. Use el método drawArc.

*/


import javax.swing.JFrame;

import java.awt.Graphics;



class Ventana extends JFrame {


	public Ventana () {

		super ("Dibujar círculos concéntricos mediante arcos");

	}


	public void paint (Graphics g) {

		super.paint (g);

		for (int i = 1; i <= 8; i++) {

		g.drawArc (50 + i * 10,50 + i * 10,400 - i * 20,400 - i * 20,0,360);

		}

	}

}


public class Ejercicio2 {
 


    public Ejercicio2 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (500,500);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }


    public static void main (String args[]) {


		Ejercicio2 ejercicio = new Ejercicio2 ();

    }

}
