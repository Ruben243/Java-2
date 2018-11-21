/*

EJERCICIO 4


Escriba un programa que dibuje líneas de longitudes aleatorias, en colores
aleatorios.


*/


import javax.swing.JFrame;

import java.awt.*;


class Ventana extends JFrame {


	public Ventana () {

		super ("Dibujar líneas aleatorias, en colores aleatorios");

	}


	public void paint (Graphics g) {


		super.paint (g);


		int numeroLineas = 1 + (int) (Math.random () * 100);


		for (int i = 1; i <= numeroLineas; i++)  {

		g.setColor (new Color ( 0 + (int) (Math.random () * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random () * 255)));

		g.drawLine (1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500) );

		}

	}

}

public class Ejercicio4 {


 
    public Ejercicio4 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (500,500);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }


    public static void main (String args[]) {


		Ejercicio4 ejercicio = new Ejercicio4 ();

    }

}
