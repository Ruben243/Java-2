
// Applet para sumar numeros

import java.awt.Graphics;
import javax.swing.*;

public class AppletSuma extends JApplet {

	double suma;
	
	public void init() {
		
		String primerNumero;
		String segundoNumero;
		
		double numero1;
		double numero2;
		
		primerNumero = JOptionPane.showInputDialog("Escribe primer valor");
		segundoNumero = JOptionPane.showInputDialog("Escribe segundo valor");
			
		numero1 = Double.parseDouble(primerNumero);
		numero2 = Double.parseDouble(segundoNumero);
		
		suma = numero1 + numero2;
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.drawRect(15,10,270,20);
		
		g.drawString("La suma es " + suma, 25, 25);
	}
	
	

}
