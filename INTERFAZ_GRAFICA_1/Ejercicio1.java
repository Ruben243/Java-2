/*

EJERCICIO 1

Crear la siguiente GUI. No hay que proporcionar ninguna funcionalidad.

*/

import javax.swing.*;
import java.awt.*;


class Ventana extends JFrame {


	private JPanel panelCentral,
	    panelCentral1,
	    panelCentral2,
	    panelBotones;
	
	private JButton botones[];
	
	private JCheckBox seleccion[];
	
	private JLabel etiquetaX, etiquetaY;
	
	private JTextField contenidoX, contenidoY;



	public Ventana () {


	    super ("Alinear");

	    Container contenedor = getContentPane ();
	    contenedor.setLayout (new BorderLayout (5,5));

	    panelCentral = new JPanel ();
	    panelCentral.setLayout (new FlowLayout ());

	    seleccion = new JCheckBox[2];

	    seleccion[0] = new JCheckBox ("Ajustar a cuadrícula");
	    seleccion[1] = new JCheckBox ("Mostrar cuadrícula");

	    etiquetaX = new JLabel ("X:");
	    contenidoX = new JTextField (3);

	    etiquetaY = new JLabel ("Y:");
	    contenidoY = new JTextField (3);

	    
	    panelCentral.add (seleccion[0]);
	    panelCentral.add (etiquetaX);
	    panelCentral.add (contenidoX);
	    panelCentral.add (seleccion[1]);
	    panelCentral.add (etiquetaY);
	    panelCentral.add (contenidoY);

	    panelBotones = new JPanel ();
	    panelBotones.setLayout (new GridLayout (3,1,5,5));

	    botones = new JButton[3];

	    botones[0] = new JButton ("Aceptar");
	    botones[1] = new JButton ("Cancelar");
	    botones[2] = new JButton ("Ayuda");


	    panelBotones.add (botones[0]);
	    panelBotones.add (botones[1]);
	    panelBotones.add (botones[2]);

	  
	    contenedor.add (panelCentral,BorderLayout.CENTER);
	    contenedor.add (panelBotones,BorderLayout.EAST);
       
	}

}


public class Ejercicio1 {



    public Ejercicio1() {

		Ventana ventana = new Ventana ();

		ventana.setSize (350,150);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {

		Ejercicio1 ejercicio = new Ejercicio1 ();

    }

}
