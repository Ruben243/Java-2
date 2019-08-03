package baseDatos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class VentanaInsertar extends JFrame implements ActionListener {
	private JLabel lTitulo,lCodigo,lNombre,lEdad,lProfesion,lTelefono;
	private JTextField cCodigo,cNombre,cEdad,cProfesion,cTelefono,cError;
	private JButton bRegistar;
	private JTable regis;
    private JButton cerrar;
	private JScrollPane barra;
	
		
		 
		public VentanaInsertar() {
			super("Registo de personas");
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
			lTitulo.setBounds(250, 8, 300, 30);
			cError.setBounds(40, 420, 500, 27);
			
			bRegistar.addActionListener(this);
			
			
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
			this.add(cError);
			
			this.setVisible(true);
			
			
			
			
			bRegistar.addActionListener(this);
			
			
			this.setSize(470,500);
			this.setVisible(true);
			
			
			
			
			
			
			
		}

		
		
		
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try{
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://asata400:3306/registroruben";
				String user="root";
				String password="toor";
				Connection con=null;
				PreparedStatement ps=null, ps1=null;
				ResultSet rs=null;
				String sql="insert into `registro` values (?,?,?,?,?)";
				String sql2="select * from registro";
				String texto=null;
			    int i=0;
			    String nombre=cNombre.getText();
				String codigo=cCodigo.getText();
				String profesion=cProfesion.getText();
				String edad=cEdad.getText();
				String telefono=cTelefono.getText();
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
			    ps.setString(1,codigo );
			    ps.setString(2,nombre );
			    ps.setString(3,edad );
			    ps.setString(4,profesion);
			    ps.setString(5,telefono );
		        i=ps.executeUpdate();
		        if(i==0){
					 cError.setText("Error no se ha actualizado nada");
					 cError.setBackground(Color.PINK);
					 cError.setFont(new Font("Verdana",Font.BOLD,17));   
					
				    	
				    }else{
				    	     ps.close();
					    	 cError.setText("Exito "+i+" actualizados");
					    	 cError.setBackground(Color.BLUE);
							 cError.setFont(new Font("Verdana",Font.BOLD,17));  
							 
						     ps1=con.prepareStatement(sql2);
							 
							 rs=ps1.executeQuery();
							 while(rs.next()){
								 aux=new Vector();
								 aux.addElement(""+rs.getString("Codigo"));
								 aux.addElement(rs.getString("Nombre"));
								 aux.addElement(""+rs.getString("Edad"));
								 aux.addElement(""+rs.getString("Profesion"));
								 aux.addElement(""+rs.getString("Telefono"));

						         filas.add(aux);
						        
						}

				        regis=new JTable(filas,columnas);
					    barra=new JScrollPane(regis);
					    barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
						add(barra);
						rs.close();
				    } 
				
				
				
			
				
				
			
			
		}catch(Exception b){
			cError.setText("Error "+ b.getMessage());
			cError.setBackground(Color.PINK);
			cError.setFont(new Font("Verdana",Font.BOLD,17));   
			
			
		 
		  }
			
			
		}
		 
		 
		 
		 
	     
	     
	     
		
	}

