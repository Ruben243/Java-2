
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author ruben-gfp
 * Clase contructora de la ventana de bienvenida que hereda de JFrame e implementa
 * un ActionListener
 * @param logo es el una imagen png  
 * @param entrar en un boton que al activarse crea otra ventana y cierra la actual
 * @param String de bienvenida
 *
 */
public class ventana_bienvenida extends JFrame implements ActionListener{
	private JLabel logo;
	private JButton entrar;
	private JLabel bienvenida;
	
	/**
	 * Constructor de la ventana
	 * @throws HeadlessException
	 */
    public ventana_bienvenida() throws HeadlessException{
    	super("Bienvenida Usuario");//Texto que le da nombre a la ventana
    	entrar=new JButton("Entrada al programa");//texto del boton
    	bienvenida=new JLabel("Programa de consulta de vuelos internacionales"
    			+ "EEUU-Tokio-España");//texto de bienvenida
    	logo=new JLabel(new ImageIcon("/home/ruben-gfp/Imágenes/logo.png"));//ruta del logo
    	
    	this.getContentPane().setLayout(null);
    	this.setBounds(350,100,510,600);//posicion x,y,ancho y alto de la ventana
    	
    	entrar.addActionListener(this);//vinculamos el listener al boton
    	setFont(new Font("Arial",3, 13));//Establecemos el estilo y el tamaño de letra
    	bienvenida.setBounds(9,2,500,100);//tamaño y situacion de los componentes de los componentes
    	bienvenida.setFont(getFont());
    	logo.setBounds(9,50,500,400);
    	entrar.setBounds(125,450,250,30);
    	this.add(bienvenida);//añadimos los componentes al panel
    	this.add(logo);
    	this.add(entrar);
    	
    	this.setVisible(true);//hacemos visible el panel con setVisible(true)
    }

    
    
    
    
    
    

	public void actionPerformed(ActionEvent b) {
		// TODO Auto-generated method stub
		JButton pulsa=(JButton)b.getSource();
		if (pulsa==entrar) {
			this.setVisible(false);
			try {
				ventana_opciones v2=new ventana_opciones();
			} catch (HeadlessException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());;
			}
		
		}
		
		
		
	}

}
