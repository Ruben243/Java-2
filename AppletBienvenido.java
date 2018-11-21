

import java.awt.Graphics;
import javax.swing.JApplet;

public class AppletBienvenido extends JApplet {
	
	public void paint (Graphics g)
	{
		super.paint(g);
		
		g.drawString("Bienvenidos al curso", 25, 25);
		g.drawString("Adios mundo", 25, 40);
		
		g.drawLine(15, 10, 210, 10);
		g.drawLine(15, 45, 210, 45);
	}
	
}
