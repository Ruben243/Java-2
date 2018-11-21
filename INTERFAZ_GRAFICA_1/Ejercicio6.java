/*

EJERCICIO 6

Modifique el programa anterior para poder dibujar distintas figuras. El usuario deberá poder elegir entre un óvalo, una línea y un rectángulo. Además, muestre la coordenada del ratón en la barra de estado.

*/



import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



class Ventana extends JFrame { 


	private int figura;

	private Figura[] figuras;

	private JComboBox listaFiguras;

	private JLabel etiquetaCoordenadas;

	private String nombreFiguras[] = {"Linea","Rectangulo","Ovalo"};


	private void inicializarFiguras () {


	    figuras = new Figura[3];

	    figuras[0] = new Linea (0,0,0,0);
	    figuras[1] = new Rectangulo (0,0,0,0);
	    figuras[2] = new Ovalo (0,0,0,0);

	}



	private void establecerFigura (int figura) {


	    this.figura = (figura >= 0 && figura <= 2) ? figura : 0;

	}



	private int obtenerFigura () {


	    return figura;

	}



	private void establecerCoordenadas (int x, int y) {


	    figuras[obtenerFigura()].establecerPosX (x);
	    figuras[obtenerFigura()].establecerPosY (y);

	}



	private void establecerCoordenadasFinales (int x, int y) {


	    figuras[obtenerFigura()].establecerPosXFinal (x);
	    figuras[obtenerFigura()].establecerPosYFinal (y);

	}



	public Ventana () {


	    super ("Dibujar figuras");

	    establecerFigura (0);

		inicializarFiguras ();
            
	    Container contenedor = getContentPane ();
	    contenedor.setLayout (new BorderLayout (15,15));


	    etiquetaCoordenadas = new JLabel ();
	    contenedor.add (etiquetaCoordenadas, BorderLayout.SOUTH);


	    listaFiguras = new JComboBox (nombreFiguras);
	    contenedor.add (listaFiguras, BorderLayout.NORTH);
	 
   
	    listaFiguras.addItemListener (

					  new ItemListener () {

					      public void itemStateChanged (ItemEvent evento) {

							  if (evento.getStateChange () == ItemEvent.SELECTED)
							  
								  establecerFigura (listaFiguras.getSelectedIndex());
						  
					      }

					  });

	    addMouseMotionListener (

				    new MouseMotionAdapter () {

						public void mouseMoved (MouseEvent evento) {

							etiquetaCoordenadas.setText ("Posición X: " + evento.getX () + " Posición Y: " + evento.getY ());

						}

				    });
				    
	    addMouseListener (

			      new MouseAdapter () {

					  public void mousePressed (MouseEvent evento) {

						  establecerCoordenadas (evento.getX(), evento.getY());

					  }



					  public void mouseReleased (MouseEvent evento) {

						  establecerCoordenadasFinales (evento.getX(), evento.getY());
						  repaint ();
					  }
  
			      });

	    
	}


	
	public void paint (Graphics g) {


	    super.paint (g);
	
	    figuras[obtenerFigura()].dibujar (g);
	    
	}
	
}



abstract class Figura {


	private int posX;
	private int posY;
	private int posXFinal;
	private int posYFinal;



	public Figura (int posX, int posY, int posXFinal, int posYFinal) {

	    establecerPosX (posX);
	    establecerPosY (posY);
	    establecerPosXFinal (posXFinal);
	    establecerPosYFinal (posYFinal);

	}



	protected void establecerPosX (int posX) {

	    this.posX = posX;

	}



	protected void establecerPosY (int posY) {

	    this.posY = posY;

	}



	protected void establecerPosXFinal (int posXFinal) {

	    this.posXFinal = posXFinal;

	}



	protected void establecerPosYFinal (int posYFinal) {


	    this.posYFinal = posYFinal;

	}



	protected int obtenerPosX () {

	    return posX;

	}


	protected int obtenerPosY () {

	    return posY;

	}



	protected int obtenerPosXFinal () {

	    return posXFinal;

	}



	protected int obtenerPosYFinal () {

	    return posYFinal;

	}


	protected abstract void dibujar (Graphics g);

}


class Linea extends Figura {


	public Linea (int posX, int posY, int posXFinal, int posYFinal) {

	    super (posX, posY, posXFinal, posYFinal);

	}



	protected void dibujar (Graphics g) {

	    g.drawLine (obtenerPosX (), obtenerPosY (), obtenerPosXFinal (), obtenerPosYFinal ());
	    	    
	}

}


class  Rectangulo extends Figura {


	private int anchura;
	private int altura;



	public Rectangulo (int posX, int posY, int anchura, int altura) {

	    super (posX, posY, posX + anchura, posY + altura);

	    establecerAnchura (anchura);
	    establecerAltura (altura);

	}



	protected void establecerAltura (int altura) {

	    this.altura = altura;

	}



	protected void establecerAnchura (int anchura) {

	    this.anchura = anchura;

	}



	protected int obtenerAnchura () {

	    return anchura;

	}



	protected int obtenerAltura () {

	    return altura;

	}



	protected void dibujar (Graphics g) {

		establecerAnchura (obtenerPosXFinal() - obtenerPosX());
		establecerAltura (obtenerPosYFinal() - obtenerPosY());
            
	    g.drawRect (obtenerPosX (), obtenerPosY (), obtenerAnchura (), obtenerAltura ());

	}

}


class Ovalo extends Rectangulo {



	public Ovalo (int x, int y, int anchura, int altura) {

	    super (x,y,anchura,altura);
	}



	protected void dibujar (Graphics g) {

		establecerAnchura (obtenerPosXFinal() - obtenerPosX());
		establecerAltura (obtenerPosYFinal() - obtenerPosY());
            
	    g.drawOval (obtenerPosX (), obtenerPosY (), obtenerAnchura (), obtenerAltura ());

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
