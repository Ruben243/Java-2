/*

EJERCICIO 3


Modificar el ejercicio 1, para dibujar los óvalos mediante el uso de instancias
de la clase Ellipse2D.Double y el método draw de la clase Graphics2D.

*/


import javax.swing.JFrame;

import java.awt.*;
import java.awt.geom.*;



class Ventana extends JFrame {


	public Ventana () {

	    super ("Dibujar ovalos mediante Ellipse2D.Double");

	}


	public void paint (Graphics g) {


	    super.paint (g);

	    Graphics2D g2d = ( Graphics2D ) g;


	    for (int i = 1; i <= 8; i++) 

		g2d.draw ( new Ellipse2D.Double (50 + i * 10,50 + i * 10,400 - i * 20,400 - i * 20) );

	}

}
    
    
public class Ejercicio3 {


    public Ejercicio3 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (500,500);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }


    public static void main (String args[]) {


		Ejercicio3 ejercicio = new Ejercicio3 ();

    }

}
