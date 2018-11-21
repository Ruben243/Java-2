/*
 
EJERCICIO 2

Mejorar el ejercicio anterior para permitir al usuario alterar el radio con un
objeto JSlider. El programá deberá funcionar para todos los radios en el rango
de 100 a 200. A medida que cambie el radio, el diámetro, área y circunferencias
deberán actualizarse y mostrarse. El radio inicial debe ser 150. Use las
ecuaciones del ejercicio anterior. Todos los dibujos deberán realizarse en una
subclase de JPanel, y los resultados de los cálculos deberán mostrarse en un
objeto JTextArea de sólo lectura.

*/


import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;
import javax.swing.event.*;



class Circulo {

	
	
	private int radio;
	
	
	public Circulo (int radio) {
		
		setRadio (radio);
		
	}

	
	
	protected void setRadio (int radio) {
		
		this.radio = radio > 0 ? radio : 0;
		
	}

	
	
	protected int getRadio () {
		
		return radio;
		
	}

	
	
	protected int getDiametro () {
		
		return 2 * getRadio ();
		
	}

	
	
	protected double getArea () {
		
		return Math.PI * Math.pow (radio,2);
		
	}

	
	
	protected double getCircunferencia () {
		
		return 2 * Math.PI * radio;
		
	}
	


	public String toString () {


		String cadena;

		DecimalFormat formato = new DecimalFormat ("0.00");
				
		cadena = "El diametro de la figura es: " + getDiametro () + "\n\n";
		cadena += "El area de la figura es: " + formato.format (getArea ()) + "\n\n";
		cadena += "La circunferencia de la figura es: " + formato.format(getCircunferencia ()) + "\n\n";
		
		return cadena;
		
	}
	
}



class PanelDibujoCirculo extends JPanel {
	

	Circulo circulo;


	public PanelDibujoCirculo (Circulo circulo) {

	
		this.circulo = circulo;
		
	}

	
	
	public void paintComponent (Graphics g) {


		super.paintComponent (g);
		
		g.setColor (Color.ORANGE);
		
		g.fillOval (200 - circulo.getRadio (), 200 - circulo.getRadio (), circulo.getDiametro () , circulo.getDiametro ());
		
	}

}



class Ventana extends JFrame {

	
	private Container contenedor;

	private JLabel etiquetaTexto, etiquetaGrafico;
	
	private JTextArea areaSalidaTexto;
	
	private JSlider barraRadio;

	private GridBagLayout esquema;
	
	private GridBagConstraints restricciones;
	
	private PanelDibujoCirculo panelDeDibujo;
	
	private Circulo circulo;
	
	

	private void agregarComponente (Component componente, int fila, int columna, int anchura, int altura) {
	
	
		restricciones.gridx = columna;
		restricciones.gridy = fila;
		
		restricciones.gridwidth = anchura;
		restricciones.gridheight = altura;
		
		esquema.setConstraints (componente, restricciones);
		contenedor.add (componente);
			
	}


	
	public void actualizarDatos (int radio) {
		
		circulo.setRadio (radio);
		areaSalidaTexto.setText (circulo.toString ());
		
	}
	
	
	
	public Ventana () {
	
		
		super ("Circulo, JSlider");

		circulo = new Circulo (150);					
		
		esquema = new GridBagLayout ();
		restricciones = new GridBagConstraints ();
		restricciones.insets = new Insets (10,10,10,10);
		
		contenedor = getContentPane ();
		contenedor.setLayout (esquema);
		
		etiquetaTexto = new JLabel ("Resultado texto");
		etiquetaTexto.setFont (new Font ("Verdana", Font.BOLD, 22));
		
		etiquetaGrafico = new JLabel ("Resultado grafico");
		etiquetaGrafico.setFont (new Font ("Verdana", Font.BOLD, 22));
		
		areaSalidaTexto = new JTextArea ();
		areaSalidaTexto.setPreferredSize (new Dimension (400,400));
		areaSalidaTexto.setFont (new Font ("Arial", Font.BOLD, 12));
		areaSalidaTexto.setText (circulo.toString ());
		areaSalidaTexto.setEditable (false);
		
		panelDeDibujo = new PanelDibujoCirculo (this.circulo);
		panelDeDibujo.setPreferredSize (new Dimension (400,400));
		
		barraRadio = new JSlider (SwingConstants.HORIZONTAL, 100, 200, 150);
		barraRadio.setMajorTickSpacing (10);
		barraRadio.setPaintTicks (true);
		
		barraRadio.addChangeListener (
		
			new ChangeListener ( ) {
				
				public void stateChanged (ChangeEvent evento) {


						actualizarDatos (barraRadio.getValue ());
						repaint ();
				}
				
			});
		
		agregarComponente (etiquetaTexto, 0, 0, 1, 1);
		agregarComponente (etiquetaGrafico, 0, 1, 1, 1);
		
		agregarComponente (areaSalidaTexto, 1, 0, 1, 1);
		agregarComponente (panelDeDibujo, 1, 1, 1, 1);
		
		restricciones.fill = GridBagConstraints.BOTH;
		
		agregarComponente (barraRadio, 2,0,2,1);

	}
	
		
}



public class Ejercicio2 {



	public Ejercicio2 () {

		
		Ventana ventana = new Ventana ();

		
		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		ventana.pack ();
		
		ventana.setVisible (true);
		
	}
	
	
	
	public static void main (String args[]) {


		Ejercicio2 ejercicio = new Ejercicio2 ();	
		
	}
	
	
}
