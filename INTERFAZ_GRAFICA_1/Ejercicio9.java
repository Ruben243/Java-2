/*

EJERCICIO 9

Modificar el ejercicio anterior para dibujar cada una de las 20 figuras de tamaño aleatorio en un color seleccionado al azar. Use los 13 objetos Color predefinidos en un arreglo de objetos Color.

*/



import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



class Ventana extends JFrame { 


    private int figura;

    private JComboBox listaFiguras;

    private String nombreFiguras[] = {"Linea","Rectangulo","Ovalo"};

    private Color colores[] = {Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.BLACK,
			       Color.WHITE, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY, Color.RED,
			       Color.GREEN, Color.BLUE};



    private void establecerFigura (int figura) {


	this.figura = (figura >= 0 && figura <= 2) ? figura : 0;

    }



    private int obtenerFigura () {


	return figura;

    }


    public Ventana () {


	super ("Dibujar figuras aleatoriamente, colores aleatorios");

	  
	establecerFigura (0);


	Container contenedor = getContentPane ();
	contenedor.setLayout (new BorderLayout (15,15));


	listaFiguras = new JComboBox (nombreFiguras);
	contenedor.add (listaFiguras, BorderLayout.NORTH);
	 
   
	listaFiguras.addItemListener (

				      new ItemListener () {

				      public void itemStateChanged (ItemEvent evento) {

					  if (evento.getStateChange () == ItemEvent.SELECTED)
							  
					      establecerFigura (listaFiguras.getSelectedIndex());

					  repaint ();
						  
				      }

				  });
	    
    }


	
    public void paint (Graphics g) {

	    

	super.paint (g);

	g.setColor (colores[(int) (Math.random() * colores.length)]);


	Figura figuras[] = new Figura[20];

	    
	for (int i = 0; i < figuras.length; i++) {

	    switch (figura) {

	    case 0:

		figuras[i] = new Linea (50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300));
 
		break;

	    case 1:
		    
		figuras[i] = new Rectangulo (50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300));

		break;

	    case 2:

		figuras[i] = new Ovalo (50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300),50 + (int) (Math.random () * 300));
		   
		break;

	    }

	    figuras[i].dibujar (g);

	}
	    
	    
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



public class Ejercicio9 {



    public Ejercicio9 () {


	Ventana ventana = new Ventana ();

	ventana.setSize (500,500);
	ventana.setVisible (true);

	ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {


	Ejercicio9 ejercicio = new Ejercicio9 ();

    }

}
