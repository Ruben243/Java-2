/*

EJERCICIO 7


Escriba un programa que dibuje caracteres al azar, en distintos tamaños y colores
de tipo de letra.

*/


import javax.swing.JFrame;

import java.awt.*;



class Ventana extends JFrame {


	public Ventana () {

	    super ("Caracteres al azar");

	}



	public void paint (Graphics g) {


	    super.paint (g);


	    int numeroCaracteres = 1 * (int) (Math.random () * 500);

	    String tiposLetra[] = {"Arial", "Verdana", "San Serif"};


	    for (int i = 1; i <= numeroCaracteres; i++) {

			g.setFont (new Font (tiposLetra[0 + (int)(Math.random () * 2 ) ], Font.PLAIN, 1 + (int) (Math.random () * 48)));

			g.setColor (new Color (0 + (int) (Math.random () * 255),0 + (int) (Math.random () * 255),0 + (int) (Math.random () * 255)));

			g.drawString (Character.toString ((char) (0 + (int) (Math.random() * 127))), 50 + (int) (Math.random () *500), 50 + (int) (Math.random () * 500));

	    }

	}

}

public class Ejercicio7 {



    public Ejercicio7 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (500,500);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {


		Ejercicio7 ejercicio = new Ejercicio7 ();

    }


}
