package EjerciciosGraficos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EuroConversor extends JFrame implements ActionListener{
  //los atributos seran los componentes
	private JTextField cantidad;
	private JButton botonEuros,botonPesetas;
	private JLabel logo;
	
	
	//creo el constructor
	
	public EuroConversor()
			throws HeadlessException {
		super("Euroconversor");//nombre de la ventana
		
		//creamos los componentes
		botonEuros=new JButton("A Euros");//texto del boton
		botonPesetas=new JButton("A pesetas");
		cantidad=new JTextField(10);//tamaño del campo
		logo=new JLabel(new ImageIcon("C:/Users/AsataTarde/Desktop/logo.png"));//text o label tipo html  o ruta de la imagen
		
		//diseñamos paneles
	
	    super.setLayout(new FlowLayout());
	    
	    //añadimos los componentes
	     super.add(logo);
	     super.add(botonEuros);
         super.add(cantidad);
         super.add(botonPesetas);
         
         //funtes de sonido o botones de accion
          botonEuros.addActionListener(this);
          botonPesetas.addActionListener(this);
         
         
         //hacer visible el contenedor
         super.setSize(350,400);//dimensiones
         super.setVisible(true);//lo hacemos visible
         setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}


	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		//cojemos el boton que pulsamos
		JButton botonPulsado=(JButton)a.getSource();
		//variable para los datos de la caja de texto
		String dato=null;
		//variable en la que convertimos el dato a double
		Double total;
		//programamos llas acciones
		if(botonPulsado==botonEuros){
			//cojemos el dato de la caja de texto
			dato=cantidad.getText();
			//asignamos el dato recojido a la variable tipo double
			total=new Double(dato);
			//hacemos la operacion
			total=(double)(total)/166.386;
			//llevamos el resultado a la caja de texto
			cantidad.setText(""+total);
			cantidad.setBackground(Color.WHITE);
			cantidad.setForeground(Color.red);
			
			
		}else if(botonPulsado==botonPesetas){
			//cojemos el dato de la caja de texto
			dato=cantidad.getText();
			//asignamos el dato recojido a la variable tipo double
			total=new Double(dato);
			//hacemos la operacion
			total=(double)(total)*166.386;
			//llevamos el resultado a la caja de texto
			cantidad.setText(""+total);
			cantidad.setForeground(Color.blue);
			
			
			
		}
		
		
	}
	
	
   
	
}
