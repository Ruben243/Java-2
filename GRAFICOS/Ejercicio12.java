/*

EJERCICIO 12

He aquí un adelanto. El paquete javax.swing contiene una clase Timer, la cuál
es capaz de llamar al método actionPerformed de la interfaz ActionListener durante
un intervalo de tiempo fijo (especificamente en milisegundos). Modifique el ejercicio
anterior para eliminar la llamada a repaint desde el método paint. Declare su
clase de manera que implemente a ActionListener (El método actionPerformed deberá
simplemente llamar a repaint). Declare una variable de instancia de tipo Timer,
llamada temporizador, en su clase. En el constructor para su clase, escriba las
siguientes instrucciones:

temporizador = new Timer (1000, this );
temporizador.start ();

Esto crea una instancia de la clase Timer que llamará al método actionPerformed
del objeto this cada 1000 milisegundos (es decir, cada segundo).


*/


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



class Ventana extends JFrame implements ActionListener {


	public Ventana () {

	    super ("Dibujar 100 líneas aleatorias, en colores aleatorios, con temporizador");

	    Timer temporizador = new Timer (1000, this);
	    temporizador.start ();

	}



	public void paint (Graphics g) {


	    super.paint (g);


	    for (int i = 1; i <= 100; i++)  {

			g.setColor (new Color ( 0 + (int) (Math.random () * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random() * 255), 0 + (int) (Math.random () * 255)));

			g.drawLine (1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500), 1 + (int) (Math.random () * 500) );

	    }

	}



	public void actionPerformed (ActionEvent evento) {

	    repaint ();

	}

}
    
    

public class Ejercicio12 {



    public Ejercicio12 () {

	Ventana ventana = new Ventana ();

	ventana.setSize (500,500);
	ventana.setVisible (true);

	ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {


	Ejercicio12 ejercicio = new Ejercicio12 ();

    }

}
