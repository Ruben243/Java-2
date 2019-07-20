package EjerciciosGraficos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {
 private JLabel nombre,apellido;
 private JTextField tnom,tap;
 private JButton enviarCon,enviarText;
 
 
 
public Formulario() {
	   
	super("Formulario");
	nombre=new JLabel("Nombre");
    apellido=new JLabel("Apellidos");
	tnom=new JTextField(10);
    tap=new JTextField(10);
	enviarCon=new JButton("Enviar Consola");
     enviarText=new JButton("Enviar fichero");
     
     
     
     super.setLayout(new FlowLayout());
	    
     super.add(nombre);
     super.add(tnom);
     super.add(apellido);
     super.add(tap);
     super.add(enviarCon);
     super.add(enviarText);
     
     
     enviarCon.addActionListener(this);
     enviarText.addActionListener(this);
     
     
     super.setSize(400,200);//dimensiones
     super.setVisible(true);//lo hacemos visible
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     
     
     
     
     
     
	
	}
	
	
	
	
		@Override
		public void actionPerformed(ActionEvent a) {
			// TODO Auto-generated method stub
			JButton pulsado=(JButton) a.getSource();
			String nom=null;
			String ape=null;
			if(pulsado==enviarCon){
				nom=tnom.getText();
				ape=tap.getText();
				System.out.println(nom+" "+ape);
				tnom.setBackground(Color.CYAN);
				tap.setBackground(Color.CYAN);
				
				
				
			}else if(pulsado==enviarText){
				try{
					nom=tnom.getText();
					ape=tap.getText();
					FileWriter f1=new FileWriter("C:/Users/AsataTarde/Desktop/nombre.txt");
					f1.write(nom+" "+ape);
					f1.close();
					tnom.setBackground(Color.RED);
					tap.setBackground(Color.RED);
				
				}catch(Exception e){
					
					
					
				}
				
			}
			
		}
		 
 
 
 
}
