/*

EJERCICIO 6


Escribir un programa que muestre triángulos generados al azar en distintos colores.
Cada triángulo deberá rellenarse con un color distinto. Use la clase GeneralPath
y el método fill de la clase Graphics2D para dibujar los triángulos.

*/


import javax.swing.JFrame;

import java.awt.*;
import java.awt.geom.*;



class Ventana extends JFrame {


	public Ventana () {

	    super ("Dibujar triángulos al azar");

	}



	public void paint (Graphics g) {


	    super.paint (g);

	    int puntosX[] = {0,50,100};
	    int puntosY[] = {100,50,100};

	    Graphics2D g2d = ( Graphics2D ) g;

	    GeneralPath triangulo = new GeneralPath ();

	    int numeroTriangulos = 1 + (int) (Math.random () * 100);


	    triangulo.moveTo (puntosX[0], puntosY[0]);

	    for (int contador = 1; contador < puntosX.length; contador ++) 

			triangulo.lineTo (puntosX[contador], puntosY[contador]);

			triangulo.closePath();


	    for (int i = 1; i <= numeroTriangulos; i++)  {

			g2d.translate (1 + (int) (Math.random() * 50) ,1 + (int) (Math.random () * 50));

			g2d.setColor ( new Color ( 0 + (int) (Math.random () * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random () * 255)));
			
			g2d.fill (triangulo);

	    }

	}

}


public class Ejercicio6 {



    public Ejercicio6 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (500,500);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {


		Ejercicio6 ejercicio = new Ejercicio6 ();

    }


}
