package PosicionamientoAbsoluto;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import EjerciciosGraficos.nuevaVentana;

public class Ventana extends JFrame implements ActionListener{
	private JLabel lTitulo,lCodigo,lNombre,lEdad,lProfesion,lTelefono;
	private JTextField cCodigo,cNombre,cEdad,cProfesion,cTelefono,cError;
	private JButton bRegistar,bBuscar;

	
	
	
	
	public Ventana() throws HeadlessException {
		super("Registro");
		lTitulo=new JLabel("REGISTRO PERSONAS");
		lTitulo.setFont(new Font("Arial",Font.ITALIC,20));
		lTitulo.setForeground(Color.RED);
		lCodigo=new JLabel("CODIGO");
		lNombre=new JLabel("NOMBRE");
		lEdad=new JLabel("EDAD");
		lProfesion=new JLabel("PROFESION");
		lTelefono=new JLabel("TELEFONO");
		
		
		cCodigo=new JTextField();
		cNombre=new JTextField();
		cEdad=new JTextField();
		cProfesion=new JTextField();
		cTelefono=new JTextField();
		cError=new JTextField();
		bRegistar=new JButton("REGISTRAR");
		bBuscar=new JButton("BUSCAR");
		//tamaño y creacion del panel
		this.getContentPane().setLayout(null);
		this.setBounds(250, 280, 700, 700);
		
		//colocamos componentes
		lCodigo.setBounds(075, 50, 77, 27);
		cCodigo.setBounds(150,50,130,27);
		lNombre.setBounds(075,100,77,27);
		cNombre.setBounds(150,100, 130, 27);
		lEdad.setBounds(330,100, 77, 27);
		cEdad.setBounds(400,100, 130, 27);
		lProfesion.setBounds(075, 150, 77, 27);
		cProfesion.setBounds(150, 150, 130, 27);
		lTelefono.setBounds(330, 150, 77, 27);
		cTelefono.setBounds(400, 150, 130, 27);
		bRegistar.setBounds(250, 270, 100, 27);
		bBuscar.setBounds(360, 270,100, 27);
		lTitulo.setBounds(250, 8, 300, 30);
		cError.setBounds(40, 420, 500, 27);
		
		bRegistar.addActionListener(this);
		bBuscar.addActionListener(this);
		
		this.add(lTitulo);
		this.add(lCodigo);
		this.add(cCodigo);
		this.add(lNombre);
		this.add(cNombre);
		this.add(lEdad);
		this.add(cEdad);
		this.add(lProfesion);
		this.add(cProfesion);
		this.add(lTelefono);
		this.add(cTelefono);
		this.add(bRegistar);
		this.add(bBuscar);
		this.add(cError);
		
		this.setVisible(true);
	 }




	@Override
	public void actionPerformed(ActionEvent a) {
		JButton pulsado=(JButton) a.getSource();
            if(pulsado==bRegistar){
            	try{
					String driver="com.mysql.cj.jdbc.Driver";
					String url="jdbc:mysql://asata400:3306/registroruben";
					String user="root";
					String password="toor";
					Connection con=null;
					PreparedStatement ps=null, ps1=null;
					ResultSet rs=null;
					String sql="insert into `registro` values (?,?,?,?,?)";
					String texto=null;
				    int i=0;
				    String nombre=cNombre.getText();
					String codigo=cCodigo.getText();
					String profesion=cProfesion.getText();
					String edad=cEdad.getText();
					String telefono=cTelefono.getText();
					
					Class.forName(driver);
					con=DriverManager.getConnection(url,user,password);
					ps=con.prepareStatement(sql);
			        ps=con.prepareStatement(sql);
				    ps.setString(1,codigo );
				    ps.setString(2,nombre );
				    ps.setString(3,edad );
				    ps.setString(4,profesion);
				    ps.setString(5,telefono );
			        i=ps.executeUpdate();
			        if(i==0){
			        	 cError.setText("NADA ACTUALIZADO");
			        	 cError.setBackground(Color.PINK);
						 cError.setFont(new Font("Verdana",Font.BOLD,17));  
					    	
					    }else{
					    	     ps.close();
						    	 cError.setText("Exito "+i+" actualizados");
						    	 cError.setBackground(Color.BLUE);
								 cError.setFont(new Font("Verdana",Font.BOLD,17));  
								 
							   
							        
							}    
					
					
					
				}catch (Exception b){
				 cError.setText("ERROR " + b.getMessage() );
				
				
			 
			  }
            	
            	
            }else if(pulsado==bBuscar){
            	this.setVisible(false);
            	NuevaVentana v2=new NuevaVentana(this);
            	
            	
            }
	    
		
		
		
	    }
     }//action listenes
		
	
	

