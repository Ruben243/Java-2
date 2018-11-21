/*

EJERCICIO 3

Declare a una subclase de JPanel llamada MiSelectorDeColores, que proporcione
tres objetos JSlider y tres objetos JTextField. Cada objeto JSlider representa
los valores 0 a 255 para las partes rojo, azul y verde de un color. Use los 
valores de rojo, verde y azul como argumentos para el constructor de Color, para
crear un nuevo objeto Color. Muestre el valor actual de cada objeto JSlider en
el objeto JTextField correspondiente. Cuando el usuario cambie el valor del objeto
JSlider, el objeto JTextField deberá cambiar de manera acorde. Declare la clase
MiSelectorDeColores de manera que pueda reutilizarse en otras aplicaciones o
subprograma (applets). Use su nuevo componente de la GUI como parte de un 
subprograma que muestre el valor actual de Color, dibujando un rectángulo relleno.

*/



import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;



abstract class Figura {


    private int posX;
    private int posY;
    private int posXFinal;
    private int posYFinal;
    private Color color;



    public Figura (int posX, int posY, int posXFinal, int posYFinal, Color color) {

		establecerPosX (posX);
		establecerPosY (posY);
		establecerPosXFinal (posXFinal);
		establecerPosYFinal (posYFinal);
		establecerColor (color);

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



	protected void establecerColor (Color color) {
	
		this.color = color;
		
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



	protected Color obtenerColor () {
	
		return color;
		
	}
	
	
	
    protected abstract void dibujar (Graphics g);


}



class  Rectangulo extends Figura {


    private int anchura;
    private int altura;



    public Rectangulo (int posX, int posY, int anchura, int altura, Color color) {

		super (posX, posY, posX + anchura, posY + altura, color);

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
				
		g.setColor (obtenerColor ());
				
		g.fillRect (obtenerPosX (), obtenerPosY (), obtenerAnchura (), obtenerAltura ());

    }

}



class PanelDibujoRectangulo extends JPanel {
	

	Rectangulo rectangulo;



	public PanelDibujoRectangulo (Rectangulo rectangulo) {

	
		this.rectangulo = rectangulo;
		
	}


	
	protected void setColor (Color color) {
	
		rectangulo.establecerColor (color);
		
	}


	
	public void paintComponent (Graphics g) {


		super.paintComponent (g);
		
		
		rectangulo.dibujar (g);

		
	}

}



class MiSelectorDeColores extends JPanel {
	
	
	private GridBagLayout esquema;
	
	private GridBagConstraints restricciones;
	
	private JLabel etiquetaRojo, etiquetaVerde, etiquetaAzul;
	
	private JTextField campoRojo, campoVerde, campoAzul;
	
	private JSlider selectorRojo, selectorVerde, selectorAzul;
	
	
	
	public MiSelectorDeColores () {
		
		
		esquema = new GridBagLayout ();
		
		setLayout (esquema);
		
		restricciones = new GridBagConstraints ();
		
		restricciones.insets = new Insets (10,10,10,10);
		
		
		etiquetaRojo = new JLabel ("Rojo");
		etiquetaRojo.setFont (new Font ("Verdana", Font.BOLD, 12));
		
		etiquetaVerde = new JLabel ("Verde");
		etiquetaVerde.setFont (new Font ("Verdana", Font.BOLD, 12));

		etiquetaAzul = new JLabel ("Azul");
		etiquetaAzul.setFont (new Font ("Verdana", Font.BOLD, 12));

		
		campoRojo = new JTextField ();
		campoRojo.setPreferredSize (new Dimension (50,50));
		campoRojo.setEditable (false);
		campoRojo.setBackground (new Color (255,0,0));

		campoVerde = new JTextField ();
		campoVerde.setPreferredSize (new Dimension (50,50));
		campoVerde.setEditable (false);
		campoVerde.setBackground (new Color (0,255,0));


		campoAzul = new JTextField ();
		campoAzul.setPreferredSize (new Dimension (50,50));
		campoAzul.setEditable (false);
		campoAzul.setBackground (new Color (0, 0, 255));

		
		selectorRojo = new JSlider (SwingConstants.HORIZONTAL, 0, 255, 255);
		selectorRojo.setMajorTickSpacing (5);
		selectorRojo.setPaintTicks (true);
		
		selectorVerde = new JSlider (SwingConstants.HORIZONTAL, 0, 255, 255);
		selectorVerde.setMajorTickSpacing (5);
		selectorVerde.setPaintTicks (true);
		
		selectorAzul = new JSlider (SwingConstants.HORIZONTAL, 0, 255, 255);
		selectorAzul.setMajorTickSpacing (5);
		selectorAzul.setPaintTicks (true);
		
		agregarComponente (etiquetaRojo, 0, 0, 1, 1);
		agregarComponente (etiquetaVerde, 0, 1, 1, 1);
		agregarComponente (etiquetaAzul, 0, 2, 1, 1);
		
		agregarComponente (campoRojo, 1, 0, 1, 1);
		agregarComponente (campoVerde, 1, 1, 1, 1);
		agregarComponente (campoAzul, 1, 2, 1, 1);
		
		agregarComponente (selectorRojo, 2, 0, 1, 1);
		agregarComponente (selectorVerde, 2, 1, 1, 1);
		agregarComponente (selectorAzul, 2, 2, 1, 1);
		
		
	}



	private void agregarComponente (Component componente, int fila, int columna, int anchura, int altura) {
	
	
		restricciones.gridx = columna;
		restricciones.gridy = fila;
		
		restricciones.gridwidth = anchura;
		restricciones.gridheight = altura;
		
		esquema.setConstraints (componente, restricciones);
		add (componente);
			
	}



	protected Color getColor () {
	
	
		return new Color (selectorRojo.getValue (), selectorVerde.getValue (), selectorAzul.getValue ());
		
	}
	
	
	
	protected JSlider getSelectorRojo () {
		
		return selectorRojo;
		
	}
	
	
	
	protected JSlider getSelectorVerde () {
		
		return selectorVerde;
		
	}
	
	
	
	protected JSlider getSelectorAzul () {
		
		return selectorAzul;
		
	}
	
	
	
	protected void setColorRojo () {
	
		campoRojo.setBackground (new Color (selectorRojo.getValue (), 0, 0));
		repaint ();
		
	}
	

	
	protected void setColorVerde () {

		campoVerde.setBackground (new Color (0, selectorVerde.getValue (), 0));
		repaint ();

	}
	

	
	protected void setColorAzul () {
	
		campoAzul.setBackground (new Color (0 , 0 , selectorAzul.getValue()));
		repaint ();
			
	}
		
}



class Ventana extends JFrame {

	
	
	private Rectangulo rectangulo;
	
	private MiSelectorDeColores selectorDeColores;
	
	private PanelDibujoRectangulo panelRectangulo;
	
	private JSlider selectorRojo, selectorVerde, selectorAzul;

	
	
	public Ventana () {


		super ("Seleccionar color");
		
		Container contenedor = getContentPane ();
		contenedor.setLayout (new GridLayout (2,1));

		selectorDeColores = new MiSelectorDeColores ();	

		rectangulo = new Rectangulo (50,50,550,100, selectorDeColores.getColor());
		
		panelRectangulo = new PanelDibujoRectangulo (rectangulo);

		selectorRojo = selectorDeColores.getSelectorRojo ();

		selectorVerde = selectorDeColores.getSelectorVerde ();

		selectorAzul = selectorDeColores.getSelectorAzul ();


		selectorRojo.addChangeListener (
		
			new ChangeListener ( ) {
				
				public void stateChanged (ChangeEvent evento) {

					selectorDeColores.setColorRojo ();	
					panelRectangulo.setColor (selectorDeColores.getColor());
					panelRectangulo.repaint ();	
				}
				
			});


		selectorVerde.addChangeListener (
		
			new ChangeListener ( ) {
				
				public void stateChanged (ChangeEvent evento) {

					selectorDeColores.setColorVerde ();
					panelRectangulo.setColor (selectorDeColores.getColor());
					panelRectangulo.repaint ();	

				}
				
			});


		selectorAzul.addChangeListener (
		
			new ChangeListener ( ) {
				
				public void stateChanged (ChangeEvent evento) {

					selectorDeColores.setColorAzul ();
					panelRectangulo.setColor (selectorDeColores.getColor());
					panelRectangulo.repaint ();	

				}
				
			});

			
		contenedor.add (panelRectangulo);
		contenedor.add (selectorDeColores);
		
	}
	
}



public class Ejercicio3 {

	
	
	public Ejercicio3 () {
		

		Ventana ventana = new Ventana ();

			
		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		ventana.pack ();
		
		ventana.setVisible (true);
			
	}

	
	
	public static void main (String args[]) {
	
		
		Ejercicio3 ejercicio = new Ejercicio3 ();
		
	}

	
}
