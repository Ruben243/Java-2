/*

EJERCICIO 9


Modificar el ejercicio anterior, para dibujar la cuadrícula utilizando instancias
de la clase Line2D.Double y el método draw de la clase Graphics2D.


*/


import javax.swing.JFrame;

import java.awt.*;
import java.awt.geom.*;



class Ventana extends JFrame {


	public Ventana () {

	    super ("Dibujar cuadrícula con Line2D");

	}



	public void paint (Graphics g) {


	    super.paint (g);


	    Graphics2D g2d = (Graphics2D) g;


	    for (int i = 1; i <= 9; i++) {


			g2d.draw (new Line2D.Double (50*i,50,50*i,450));
			g2d.draw (new Line2D.Double (50,50*i,450,50*i));

	    }

	}

}



public class Ejercicio9 {



    public Ejercicio9 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (500,500);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {


		Ejercicio9 ejercicio = new Ejercicio9 ();

    }


}
