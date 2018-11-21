/*

EJERCICIO 4 


Utilizando la técnica de los ejercicios realizados en temas anteriores y
en este tema, cree un programa de dibujo como el de la figura:


La aplicación dispone de un menú, y una ventana interna denominada
Herramientas de dibujo, cuando damos a Agregar/Nueva ventana va originar
el Área de dibujo 1, Área de dibujo 2, etc … en las cuáles solo se podrá
dibujar en cada una de ellas las figuras que estaba seleccionada en
la Herramienta de dibujo, con el color que estaba seleccionado en el
correspondiente momento.

NOTA: Elementos a utilizar, JDesktopPane, JInternalFrame, JSlider,
JRadioButton, JMenu, JMenuItem, JPane, etc ….


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


		setPosX (posX);
		setPosY (posY);
		setPosXFinal (posXFinal);
		setPosYFinal (posYFinal);
		setColor (color);

    }



    protected void setPosX (int posX) {


		this.posX = posX;

    }



    protected void setPosY (int posY) {


		this.posY = posY;

    }



    protected void setPosXFinal (int posXFinal) {


		this.posXFinal = posXFinal;

    }



    protected void setPosYFinal (int posYFinal) {


		this.posYFinal = posYFinal;

    }



	protected void setColor (Color color) {

	
		this.color = color;
		
	}
	
	
	
    protected int getPosX () {


		return posX;

    }



    protected int getPosY () {


		return posY;

    }



    protected int getPosXFinal () {


		return posXFinal;

    }



    protected int getPosYFinal () {


		return posYFinal;

    }



	protected Color getColor () {

	
		return color;
		
	}
	
	
	
    protected abstract void dibujar (Graphics g);


}



class Linea extends Figura {



    public Linea (int posX, int posY, int posXFinal, int posYFinal, Color color) {


		super (posX, posY, posXFinal, posYFinal, color);

    }



    protected void dibujar (Graphics g) {

		
		g.setColor (getColor ());
		
		g.drawLine (getPosX (), getPosY (), getPosXFinal (), getPosYFinal ());
	    	    
    }
    
}



class  Rectangulo extends Figura {



    private int anchura;
    private int altura;



    public Rectangulo (int posX, int posY, int anchura, int altura, Color color) {


		super (posX, posY, posX + anchura, posY + altura, color);

		setAnchura (anchura);
		setAltura (altura);

    }



    protected void setAltura (int altura) {


		this.altura = altura;

    }



    protected void setAnchura (int anchura) {


		this.anchura = anchura;

    }



    protected int getAnchura () {


		return anchura;

    }



    protected int getAltura () {


		return altura;

    }


    protected void dibujar (Graphics g) {


		setAnchura (getPosXFinal() - getPosX());
		setAltura (getPosYFinal() - getPosY());

		g.setColor (getColor ());
				
		g.fillRect (getPosX (), getPosY (), getAnchura (), getAltura ());

    }

}



class Ovalo extends Rectangulo {



    public Ovalo (int x, int y, int anchura, int altura, Color color) {


		super (x,y,anchura,altura,color);

    }



    protected void dibujar (Graphics g) {


		setAnchura (getPosXFinal() - getPosX());
		setAltura (getPosYFinal() - getPosY());
            
        g.setColor (getColor ());
            
		g.fillOval (getPosX (), getPosY (), getAnchura (), getAltura ());

    }

}



class PanelDibujoRectangulo extends JPanel {

	

	Rectangulo rectangulo;



	public PanelDibujoRectangulo (Rectangulo rectangulo) {

	
		this.rectangulo = rectangulo;
		
	}


	
	protected void setColor (Color color) {

	
		rectangulo.setColor (color);
		
	}


	
	public void paintComponent (Graphics g) {


		super.paintComponent (g);
		
		
		rectangulo.dibujar (g);

		
	}

}



class PanelDibujo extends JPanel {
	
	
	private GridBagLayout esquema;
	
	private GridBagConstraints restricciones;
	
	private JLabel etiquetaRojo, etiquetaVerde, etiquetaAzul, etiquetaFigura;
	
	private JTextField campoRojo, campoVerde, campoAzul;
	
	private JSlider selectorRojo, selectorVerde, selectorAzul;
	
	private JRadioButton radioBotonLinea, radioBotonRectangulo, radioBotonOvalo;
	
	private PanelDibujoRectangulo panelRectangulo;
	
	
	
	public PanelDibujo () {
		
		
		esquema = new GridBagLayout ();
		
		setLayout (esquema);
		
		restricciones = new GridBagConstraints ();
		
		restricciones.insets = new Insets (10,10,10,10);
		
		
		panelRectangulo = new PanelDibujoRectangulo (new Rectangulo (0,0,100,100, new Color (255, 255, 255)));
		panelRectangulo.setPreferredSize (new Dimension (100,100));
		
		
		etiquetaRojo = new JLabel ("Rojo");
		etiquetaRojo.setFont (new Font ("Verdana", Font.BOLD, 12));

		
		etiquetaVerde = new JLabel ("Verde");
		etiquetaVerde.setFont (new Font ("Verdana", Font.BOLD, 12));


		etiquetaAzul = new JLabel ("Azul");
		etiquetaAzul.setFont (new Font ("Verdana", Font.BOLD, 12));

		
		campoRojo = new JTextField ();
		campoRojo.setPreferredSize (new Dimension (40,40));
		campoRojo.setEditable (false);
		campoRojo.setBackground (new Color (255,0,0));


		campoVerde = new JTextField ();
		campoVerde.setPreferredSize (new Dimension (40,40));
		campoVerde.setEditable (false);
		campoVerde.setBackground (new Color (0,255,0));


		campoAzul = new JTextField ();
		campoAzul.setPreferredSize (new Dimension (40,40));
		campoAzul.setEditable (false);
		campoAzul.setBackground (new Color (0, 0, 255));

		
		selectorRojo = new JSlider (SwingConstants.HORIZONTAL, 0, 255, 255);
		selectorRojo.setMajorTickSpacing (100);
		selectorRojo.setMinorTickSpacing (5);
		selectorRojo.setPaintTicks (true);
		selectorRojo.setPaintLabels (true);

		
		selectorVerde = new JSlider (SwingConstants.HORIZONTAL, 0, 255, 255);
		selectorVerde.setMajorTickSpacing (100);
		selectorVerde.setMinorTickSpacing (5);
		selectorVerde.setPaintTicks (true);
		selectorVerde.setPaintLabels (true);

		
		selectorAzul = new JSlider (SwingConstants.HORIZONTAL, 0, 255, 255);
		selectorAzul.setMajorTickSpacing (100);
		selectorAzul.setMinorTickSpacing (5);
		selectorAzul.setPaintTicks (true);
		selectorAzul.setPaintLabels (true);

	
		etiquetaFigura = new JLabel ("Selecciona figura a dibujar");

		
		radioBotonLinea = new JRadioButton ("Linea");	
		radioBotonLinea.setSelected (true);
		radioBotonRectangulo = new JRadioButton ("Rectangulo");
		radioBotonOvalo = new JRadioButton ("Ovalo");

		
		ButtonGroup grupoRadioBotones = new ButtonGroup ();
		grupoRadioBotones.add (radioBotonLinea);
		grupoRadioBotones.add (radioBotonRectangulo);
		grupoRadioBotones.add (radioBotonOvalo);

		
		agregarComponente (etiquetaRojo, 1, 0, 1, 1);
		agregarComponente (etiquetaVerde, 1, 1, 1, 1);
		agregarComponente (etiquetaAzul, 1, 2, 1, 1);

		
		agregarComponente (campoRojo, 2, 0, 1, 1);
		agregarComponente (campoVerde, 2, 1, 1, 1);
		agregarComponente (campoAzul, 2, 2, 1, 1);

		
		agregarComponente (panelRectangulo, 0, 0, 3, 1);
		agregarComponente (selectorRojo, 3, 0, 1, 1);
		agregarComponente (selectorVerde, 3, 1, 1, 1);
		agregarComponente (selectorAzul, 3, 2, 1, 1);

		
		agregarComponente (etiquetaFigura, 4, 0, 3, 1);
		agregarComponente (radioBotonLinea, 5, 0, 1, 1);
		agregarComponente (radioBotonRectangulo, 5, 1, 1, 1);
		agregarComponente (radioBotonOvalo, 5, 2, 1, 1);
		
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
	
	
	
	protected JRadioButton getRadioBotonLinea () {
	
		
		return radioBotonLinea;
	}
	
	
	
	protected JRadioButton getRadioBotonRectangulo () {
	
	
		return radioBotonRectangulo;
		
	}

	
	
	protected JRadioButton getRadioBotonOvalo () {

	
		return radioBotonOvalo;
		
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
		panelRectangulo.setColor (getColor ());
		repaint ();

	}
	

	
	protected void setColorVerde () {


		campoVerde.setBackground (new Color (0, selectorVerde.getValue (), 0));
		panelRectangulo.setColor (getColor ());
		repaint ();

	}
	

	
	protected void setColorAzul () {

	
		campoAzul.setBackground (new Color (0 , 0 , selectorAzul.getValue()));
		panelRectangulo.setColor (getColor ());	
		repaint ();

	}


	
	public void paintComponent (Graphics g) {


		super.paintComponent (g);
		
		
		panelRectangulo.repaint ();
		
	}

}


 
class PanelAreaDibujo extends JPanel {

	
	
	private  Figura figura;

	
	public PanelAreaDibujo (Figura figura) {

		
		this.figura = figura;

		addMouseListener (


			new MouseAdapter () {

				public void mousePressed (MouseEvent evento) {


					PanelAreaDibujo.this.figura.setPosX (evento.getX());
					PanelAreaDibujo.this.figura.setPosY (evento.getY());
					
				}



				public void mouseReleased (MouseEvent evento) {


					PanelAreaDibujo.this.figura.setPosXFinal (evento.getX());
					PanelAreaDibujo.this.figura.setPosYFinal (evento.getY());

					repaint ();
				}
  
		});
	    
	}


	
	public void paintComponent (Graphics g) {


	    super.paintComponent (g);
		
		figura.dibujar (g);	 

	}
	
}



class Ventana extends JFrame {
	
	

	private JDesktopPane escritorio;
	
	private PanelDibujo panelDibujo;
	
	private JSlider selectorRojo, selectorVerde, selectorAzul;
	
	private JRadioButton radioBotonLinea, radioBotonRectangulo, radioBotonOvalo;

	private int contadorMarcos;	
	
	private int figura; // 0 - Linea, 1 - Rectangulo, 2 - Ovalo

	
	private void setFigura (int figura) {


		this.figura = figura;
		
	}
	
	
	
	private int getFigura () {
		
		
		return figura;
	}
	
	
	
	private int getContadorMarcos () {
	
	
		return contadorMarcos;
	}
	
	
	private void setContadorMarcos (int contador) {
		
		
		contadorMarcos = contador;
		
	}
	
	
	
	private void incrementarContadorMarcos () {
	
	
		setContadorMarcos (getContadorMarcos () + 1);
	
	}

	
	
	public Ventana () {


		super ("Aplicación Paneles");


		setFigura (0);
		
		setContadorMarcos (0);
		
		// Crear la barra del menu
		
		JMenuBar barraMenu = new JMenuBar ();
		
		JMenu menuAgregar = new JMenu ("Agregar");
		menuAgregar.setMnemonic ('A');
		
		JMenuItem nuevaFigura = new JMenuItem ("Nueva figura");
		nuevaFigura.setMnemonic ('N');
		
		JMenuItem salirAplicacion = new JMenuItem ("Salir");
		salirAplicacion.setMnemonic ('S');
		
		menuAgregar.add (nuevaFigura);
		menuAgregar.add (salirAplicacion);

		JMenu menuAyuda = new JMenu ("Ayuda");
		menuAyuda.setMnemonic ('u');
		
		JMenuItem menuAcercaDe = new JMenuItem ("Acerca de ...");
		menuAcercaDe.setMnemonic ('d');
		
		menuAyuda.add (menuAcercaDe);
		
		barraMenu.add (menuAgregar);
		barraMenu.add (menuAyuda);
		
		setJMenuBar (barraMenu);


		// Fin crear la barra del menu
		

		
		// Definir escritorio

		escritorio = new JDesktopPane ();
		getContentPane ().add (escritorio);
		

		
		// Crear el panel de Dibujo

		panelDibujo = new PanelDibujo ();

				
		JInternalFrame marco = new JInternalFrame ("Herramientas Dibujo", false, false, false, true);
		
		Container contenedorPanelDibujo = marco.getContentPane ();
		contenedorPanelDibujo.add (panelDibujo);
				
		marco.pack ();
		
		escritorio.add (marco);
		
		marco.setVisible (true);



		// Eventos barra menu
		
		nuevaFigura.addActionListener (
			
			new ActionListener () {
		
				public void actionPerformed (ActionEvent evento) {
					
					incrementarContadorMarcos ();
					
					JInternalFrame marcoAreaDibujo = new JInternalFrame ("Area dibujo " + getContadorMarcos (), true, true, true, true);
					
					Container contenedor = marcoAreaDibujo.getContentPane ();

					Figura figuraAdibujar = null;
					
					switch (figura) {
					
					case 0:
					
						figuraAdibujar = new Linea (0, 0, 0, 0, panelDibujo.getColor ());
						
						break;
						
					case 1:
						
						figuraAdibujar = new Rectangulo (0, 0, 0, 0, panelDibujo.getColor ());
						
						break;
						
					case 2:
					
						figuraAdibujar = new Ovalo (0, 0, 0, 0, panelDibujo.getColor ());
						
						break;
					
					}
					
										
					PanelAreaDibujo panelAreaDibujo = new PanelAreaDibujo (figuraAdibujar);
					panelAreaDibujo.setBorder (BorderFactory.createLineBorder(Color.orange));
					
					contenedor.add (panelAreaDibujo);
					
					marcoAreaDibujo.setPreferredSize (new Dimension (250,350));
					
					marcoAreaDibujo.pack ();
					
					escritorio.add (marcoAreaDibujo);
					
					marcoAreaDibujo.setVisible (true);
				}
				
			});


		salirAplicacion.addActionListener (
			
			new ActionListener () {
				
				public void actionPerformed (ActionEvent evento) {
					
					System.exit (0);
					
				}
				
			});
		
		menuAcercaDe.addActionListener (
		
			new ActionListener () {
				
				public void actionPerformed (ActionEvent evento) {
					
					JOptionPane.showMessageDialog (Ventana.this, "Este programa ha sido creado\n\n por los alumnos del\n\n CURSO DE JAVA","Acerca de ...", JOptionPane.PLAIN_MESSAGE);
					
				}
				
			});
			
		// Eventos panel de Dibujo
		
		selectorRojo = panelDibujo.getSelectorRojo ();

		selectorVerde = panelDibujo.getSelectorVerde ();

		selectorAzul = panelDibujo.getSelectorAzul ();


		selectorRojo.addChangeListener (
		
			new ChangeListener ( ) {
				
				public void stateChanged (ChangeEvent evento) {

					panelDibujo.setColorRojo ();
				}
				
			});


		selectorVerde.addChangeListener (
		
			new ChangeListener ( ) {
				
				public void stateChanged (ChangeEvent evento) {

					panelDibujo.setColorVerde ();

				}
				
			});


		selectorAzul.addChangeListener (
		
			new ChangeListener ( ) {
				
				public void stateChanged (ChangeEvent evento) {

					panelDibujo.setColorAzul ();

				}
				
			});


		radioBotonLinea = panelDibujo.getRadioBotonLinea ();
		
		radioBotonRectangulo = panelDibujo.getRadioBotonRectangulo ();
		
		radioBotonOvalo = panelDibujo.getRadioBotonOvalo ();
		
		
		radioBotonLinea.addItemListener (
		
			new ItemListener () {
				
				public void itemStateChanged (ItemEvent evento) {
		
					setFigura (0);
					
				}
			});
		
		
		radioBotonRectangulo.addItemListener (
		
			new ItemListener () {
				
				public void itemStateChanged (ItemEvent evento) {
					
					setFigura (1);
					
				}
			});
		
				
		radioBotonOvalo.addItemListener (
		
			new ItemListener () {
				
				public void itemStateChanged (ItemEvent evento) {
					
					setFigura (2);
					
				}
			});
						
				
				
		// Fin eventos panel de Dibujo
		
		// Fin panel de Dibujo

		
	}
	
}



public class Ejercicio4 {

	
	
	public Ejercicio4 () {
		

		Ventana ventana = new Ventana ();

			
		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		ventana.setPreferredSize (new Dimension (1000,800));
		
		ventana.pack ();
		
		ventana.setVisible (true);
			
	}

	
	
	public static void main (String args[]) {
	
		
		Ejercicio4 ejercicio = new Ejercicio4 ();
		
	}
	
}
