package JTable001;

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

import javax.swing.*;

public class JTable003 extends JFrame implements ActionListener {
	private JLabel  h3;
     private JLabel Codigo;
     private JTextField tcodigo;
     private JLabel Nombre;
     private JTextField tnombre;
     private JLabel Profesion;
     private JTextField tprofesion;
     private JLabel  Edad;
     private JTextField tedad;
     private JLabel Telefono;
     private JTextField ttelfono;
	 private JButton Registar;
	 private JButton  cancelar;
	 private JTable registro;
	 private JTextField Error;
	 private JScrollPane barra;
	 private JPanel panelSuperior;
	 private JPanel panelInferior;
	 private JPanel panelcentral;
	 
	public JTable003() {
		super("Registo de personas");
		h3=new JLabel("Registro de personas");
		Codigo=new JLabel("Codigo");
		tcodigo=new JTextField(16);
		Nombre=new JLabel("Nombre");
		tnombre=new JTextField(15);
		Profesion=new JLabel("Profesion");
		tprofesion=new JTextField(16);
		Edad=new JLabel("Edad");
		tedad=new JTextField(16);
		Telefono=new JLabel("Telefono");
		ttelfono=new JTextField(16);
		registro=new JTable();
		Registar=new JButton("Registrar");
		cancelar=new JButton("Cancelar");
		Error=new JTextField(50);
		
		
		panelSuperior=new JPanel(new GridLayout(1,1));
		panelSuperior.add(h3);
		
		panelcentral=new JPanel(new FlowLayout());
		
		panelcentral.add(Codigo);
		panelcentral.add(tcodigo);
		panelcentral.add(Nombre);
		panelcentral.add(tnombre);
		
		panelcentral.add(Edad);
		panelcentral.add(tedad);
		panelcentral.add(Profesion);
		panelcentral.add(tprofesion);
		panelcentral.add(Telefono);
		panelcentral.add(ttelfono);
		panelcentral.add(Registar);
		panelcentral.add(cancelar);
		
		
		panelInferior=new JPanel(new GridLayout(2,1));
		panelInferior.add(registro);
		panelInferior.add(Error);
		
		this.getContentPane().setLayout(new BorderLayout());
		this.add(panelSuperior,BorderLayout.NORTH);
		this.add(panelcentral,BorderLayout.CENTER);
		this.add(panelInferior,BorderLayout.SOUTH);
		
		
		
		
		
		Registar.addActionListener(this);
		
		
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
		    String nombre=tnombre.getText();
			String codigo=tcodigo.getText();
			String profesion=tprofesion.getText();
			String edad=tedad.getText();
			String telefono=ttelfono.getText();
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
				 Error.setText("Error no se ha actualizado nada");
				 Error.setBackground(Color.PINK);
				 Error.setFont(new Font("Verdana",Font.BOLD,17));   
				
			    	
			    }else{
			    	     ps.close();
				    	 Error.setText("Exito "+i+" actualizados");
				    	 Error.setBackground(Color.BLUE);
						 Error.setFont(new Font("Verdana",Font.BOLD,17));  
						 
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

			        registro=new JTable(filas,columnas);
				    barra=new JScrollPane(registro);
				    barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
					add(barra);
					rs.close();
			    } 
			
			
			
		
			
			
		
		
	}catch(Exception b){
		Error.setText("Error "+ b.getMessage());
		 Error.setBackground(Color.PINK);
		 Error.setFont(new Font("Verdana",Font.BOLD,17));   
		
		
	 
	  }
		
		
	}
	 
	 
	 
	 
     
     
     
	
}
