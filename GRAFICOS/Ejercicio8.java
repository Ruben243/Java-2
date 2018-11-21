/*

EJERCICO 8


Escriba un programa que dibuje una cuadrícula de 8 x 8. Use el método drawLine.

*/


import javax.swing.JFrame;

import java.awt.*;


class Ventana extends JFrame {


	public Ventana () {

	    super ("Dibujar cuadrícula");

	}



	public void paint (Graphics g) {


	    super.paint (g);


	    for (int i = 1; i <= 9; i++) {

		g.drawLine (50*i,50,50*i,450);
		g.drawLine (50,50*i,450,50*i);

	    }

	}

}
    
    
    
public class Ejercicio8 {



    public Ejercicio8 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (500,500);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {


		Ejercicio8 ejercicio = new Ejercicio8 ();

    }


}
