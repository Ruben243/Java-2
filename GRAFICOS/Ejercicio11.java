/*

EJERCICIO 11

Escriba una aplicación que simule un protector de pantalla. La aplicación deberá
dibujar líneas al azar, utilizando el método drawLine de la clase Graphics. Después
de dibujar 100 líneas, la aplicación deberá borrarse a sí misma y empezar a
dibujar líneas nuevamente. Para permitir al programa dibujar en forma continua, 
coloque una llamada repaint como la última linea el método paint. ¿ Observó
algún problema con esto en su sistema ?


*/


import javax.swing.JFrame;

import java.awt.*;



class Ventana extends JFrame {


	public Ventana () {

	    super ("Dibujar 100 líneas aleatorias, en colores aleatorios");

	}


	public void paint (Graphics g) {


	    super.paint (g);


	    for (int i = 1; i <= 100; i++)  {

			g.setColor (new Color ( 0 + (int) (Math.random () * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random () * 255)));

			g.drawLine (1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500) );

	    }

	    repaint ();

	}

}



public class Ejercicio11 {


 
    public Ejercicio11 () {

	Ventana ventana = new Ventana ();

	ventana.setSize (500,500);
	ventana.setVisible (true);

	ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }


    public static void main (String args[]) {


	Ejercicio11 ejercicio = new Ejercicio11 ();

    }

}
