/*

EJERCICIO 5


Escriba una aplicación que permita al usuario dibujar un rectángulo, arrastrando el ratón en la ventana de aplicación. La coordenada superior izquierda deberá ser la ubicación en donde el usuario oprima el botón del ratón, y la coordenada inferior derecha ser la ubicación en donde el usuario suelte el botón del ratón. Además, muestre el área del rectángulo en un objeto Jlabel, en la región SOUTH de un esquema BorderLayout. Use la siguiente formula para el área:

area = anchura x altura

*/



import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



class Ventana extends JFrame { 


	private Rectangulo rectangulo;

	private JLabel etiquetaArea;



	public Ventana () {


	    super ("Dibujar rectángulo");


	    rectangulo = new Rectangulo (0,0,0,0);


	    Container contenedor = getContentPane ();
	    contenedor.setLayout (new BorderLayout (15,15));


	    etiquetaArea = new JLabel ("Area: ");
	    contenedor.add (etiquetaArea, BorderLayout.SOUTH);


	    addMouseListener (


		new MouseAdapter () {

		    public void mousePressed (MouseEvent evento) {

			rectangulo.establecerPosX (evento.getX());
			rectangulo.establecerPosY (evento.getY());

		    }



		    public void mouseReleased (MouseEvent evento) {

			rectangulo.establecerAnchura (evento.getX());
			rectangulo.establecerAltura (evento.getY());
			repaint ();
		    }
  
		}
			      );
	    
	}



	public void paint (Graphics g) {


	    super.paint (g);
	 
	    g.drawRect (rectangulo.obtenerPosX (), rectangulo.obtenerPosY (), rectangulo.obtenerAnchura (), rectangulo.obtenerAltura ());

	    etiquetaArea.setText (rectangulo.toString());

	}

}



class Rectangulo {


	private int posX;
	private int posY;
	private int anchura;
	private int altura;



	public Rectangulo (int posX, int posY, int anchura, int altura) {

	    establecerPosX (posX);
	    establecerPosY (posY);
	    establecerAnchura (anchura);
	    establecerAltura (altura);

	}



	protected void establecerPosX (int posX) {

	    this.posX = posX > 0 ? posX : 0;

	}



	protected void establecerPosY (int posY) {

	    this.posY = posY > 0 ? posY : 0;

	}



	protected void establecerAnchura (int posXFinal) {

	    anchura = posXFinal > 0 ? posXFinal - posX : 0;

	}



	protected void establecerAltura (int posYFinal) {


	    altura = posYFinal > 0 ? posYFinal - posY : 0;

	}



	protected int obtenerPosX () {

	    return posX;

	}


	protected int obtenerPosY () {

	    return posY;

	}



	protected int obtenerAnchura () {

	    return anchura;

	}



	protected int obtenerAltura () {

	    return altura;

	}



	public String toString () {

	    return "Area: " + (obtenerAnchura () * obtenerAltura ());
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
