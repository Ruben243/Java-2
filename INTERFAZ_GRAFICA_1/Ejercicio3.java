/*

EJERCICIO 3

Crear la siguiente GUI. No hay que proporcionar ninguna funcionalidad.

*/


import javax.swing.*;
import java.awt.*;



class Ventana extends JFrame {

	private JPanel panelBotones, 
	    panelCheckBox;

	private JButton[] botones;

	private JComboBox comboColores;

	private JCheckBox opciones[];

	private String[] colores = {"Rojo", "Azul", "Verde"};



	public Ventana () {


	    super ("Seleccionar color");

	    Container contenedor = getContentPane ();
	    contenedor.setLayout (new BorderLayout (5,5));

	    comboColores = new JComboBox (colores);

	    panelCheckBox = new JPanel (new FlowLayout (FlowLayout.CENTER));

	    opciones = new JCheckBox[2];
	    opciones[0] = new JCheckBox ("Segundo Plano");
	    opciones[1] = new JCheckBox ("Primer Plano");

	    panelCheckBox.add (opciones[0]);
	    panelCheckBox.add (opciones[1]);

	    panelBotones = new JPanel (new FlowLayout (FlowLayout.CENTER));

	    botones = new JButton[2];
	    botones[0] = new JButton ("Aceptar");
	    botones[1] = new JButton ("Cancelar");

	    panelBotones.add (botones[0]);
	    panelBotones.add (botones[1]);

	    contenedor.add (comboColores,BorderLayout.NORTH);
	    contenedor.add (panelCheckBox, BorderLayout.CENTER);
	    contenedor.add (panelBotones,BorderLayout.SOUTH);
    
	}

}



public class Ejercicio3 {



 	public Ejercicio3 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (300,150);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {

		Ejercicio3 ejercicio = new Ejercicio3 ();

    }

}
