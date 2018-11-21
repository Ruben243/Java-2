/*

EJERCICIO 5


Modificar el ejercicio anterior para dibujar líneas aleatorias en colores aleatorios
y grosores de línea aleatorios. Use la clase Line2D.Double y el método draw de
la clase Graphics2D para dibujar las líneas.

*/


import javax.swing.JFrame;

import java.awt.*;
import java.awt.geom.*;



class Ventana extends JFrame {


	public Ventana () {

		super ("Dibujar líneas aleatorias, en colores aleatorios, grosores aleatorios");

	}



	public void paint (Graphics g) {


		super.paint (g);


		Graphics2D g2d = ( Graphics2D ) g;

		int numeroLineas = 1 + (int) (Math.random () * 100);


		for (int i = 1; i <= numeroLineas; i++)  {

			g2d.setColor ( new Color ( 0 + (int) (Math.random () * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random () * 255)));

			g2d.setStroke (new BasicStroke ( 1 + (int) (Math.random () * 10) ) ) ;

			g2d.draw ( new Line2D.Double (1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500) ) );

		}

	}

}


public class Ejercicio5 {






    public Ejercicio5 () {

	Ventana ventana = new Ventana ();

	ventana.setSize (500,500);
	ventana.setVisible (true);

	ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {


	Ejercicio5 ejercicio = new Ejercicio5 ();

    }


}
