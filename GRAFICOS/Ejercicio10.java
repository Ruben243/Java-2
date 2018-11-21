/*

EJERCICIO 10


Escriba un programa que dibuje una cuadrícula de 10 x 10. Use el método drawRect.


*/


import javax.swing.JFrame;

import java.awt.*;




class Ventana extends JFrame {


	public Ventana () {

	    super ("Dibujar cuadrícula con 10x10 con drawRect");

	}



	public void paint (Graphics g) {


	    super.paint (g);


	    for (int i = 1; i <= 10; i++) {


			g.drawRect (50*i,50,50,500);	
			g.drawRect (50,50*i,500,50);

	    }

	}

}

public class Ejercicio10 {



	public Ejercicio10 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (800,800);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {


		Ejercicio10 ejercicio = new Ejercicio10 ();

    }


}
