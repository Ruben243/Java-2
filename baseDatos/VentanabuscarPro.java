package baseDatos;

import java.awt.Color;
import java.awt.Font;
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

import PosicionamientoAbsoluto.TableVentana;
import PosicionamientoAbsoluto.Ventana;

public class VentanabuscarPro extends JFrame implements ActionListener {
	  private JLabel lProfesion;
      private JTextField cProfesion,cError;
      private JButton bBuscar,bVolver;
      private MenuAsata inicio;
      private JTable registro;
      private JScrollPane barra;
      
      
	public VentanabuscarPro(MenuAsata v) {
		super("Ventana de busqueda");
	
		lProfesion=new JLabel("PROFESION");
		cProfesion=new JTextField();
		bBuscar=new JButton("REGISTRAR");
		bVolver=new JButton("INICIO");
		registro=new JTable();
		cError=new JTextField();
		inicio=v;
		
		this.getContentPane().setLayout(null);
		this.setBounds(250, 280,800,1000);
	
		
	
		lProfesion.setBounds(075,10, 77, 27);
		cProfesion.setBounds(150,10, 130, 27);
		bBuscar.setBounds(075,40, 100, 27);
		bVolver.setBounds(180,40, 100, 27);
		
		cError.setBounds(075,80,500, 27);
		
		this.add(lProfesion);
		this.add(cProfesion);
		this.add(bBuscar);
		this.add(bVolver);
	    this.add(cError);
		
		bBuscar.addActionListener(this);
		bVolver.addActionListener(this);
		this.setVisible(true);
	
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pulsado=(JButton) e.getSource();
		
		
		  if(pulsado==bBuscar){
				try{
					
					String driver="com.mysql.cj.jdbc.Driver";
					String url="jdbc:mysql://asata400:3306/registroruben";
					String user="root";
					String password="toor";
					Connection con=null;
					PreparedStatement ps=null;
					ResultSet rs=null;
					String sql="select * from registro where profesion=?";
					String texto=null;
					String profesion=cProfesion.getText();
					Vector aux=null;
				    Vector filas=new Vector();
				    Vector columnas=new Vector();
				    columnas.addElement("Codigo");
				    columnas.addElement("Nombre");
				    columnas.addElement("Edad");
				    columnas.addElement("Profesion");
				    columnas.addElement("Telefono");
					 Class.forName(driver);
					con=DriverManager.getConnection(url,user,password);
					ps=con.prepareStatement(sql);
			        ps=con.prepareStatement(sql);
				    ps.setString(1,profesion);
			        rs=ps.executeQuery();
		              if( rs.getRow() == 0 ) {
			        	 cError.setBackground(Color.RED);
			        	 cError.setFont(new Font("Arial",Font.BOLD,17));
			             cError.setText("ERROR EL REGISTRO NO EXISTE "); 
			        
		              }
			     
		            
		               while(rs.next()){
					        	     cError.setBackground(Color.WHITE);
					        	     cError.setFont(new Font("Verdana",Font.BOLD,17));
			                         cError.setText("Mostrando resultados");
						             aux=new Vector();
									 aux.addElement(""+rs.getString("Codigo"));
									 aux.addElement(rs.getString("Nombre"));
									 aux.addElement(""+rs.getString("Edad"));
									 aux.addElement(""+rs.getString("Profesion"));
									 aux.addElement(""+rs.getString("Telefono"));
					                 filas.add(aux);
					                 
							        
						              }
						        registro=new JTable(filas,columnas);
						        barra=new JScrollPane(registro);
							    barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
							    barra.setBounds(075,120,500,500);
								add(barra);
		           
			        
					 rs.close();
		           
			   
			  
			
					      
				 
					
					
					
				
					
					
				
				
			}catch (Exception b){
				 cError.setBackground(Color.RED);
		    	 cError.setFont(new Font("Arial",Font.BOLD,17));
		
				 cError.setText("ERROR " + b.getMessage() );
				
				
			 
			  }
		
		  }else if(pulsado==bVolver){
			  this.dispose();
			  inicio.setVisible(true);
			  
			  
		  }
		
	}
}
