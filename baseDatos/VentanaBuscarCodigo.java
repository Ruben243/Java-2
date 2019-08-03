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

public class VentanaBuscarCodigo extends JFrame implements ActionListener {
	private JLabel lTitulo,lCodigo;
	private JTextField cCodigo,cError;
	private JButton bRegistar;
	private JTable regis;
    private JButton cerrar;
	private JScrollPane barra;
	
	public VentanaBuscarCodigo(){
		super("Registo de personas");
		lTitulo=new JLabel("REGISTRO PERSONAS");
		lTitulo.setFont(new Font("Arial",Font.ITALIC,20));
		lTitulo.setForeground(Color.RED);
		lCodigo=new JLabel("CODIGO");
		
		cCodigo=new JTextField();
		
		cError=new JTextField();
		bRegistar=new JButton("REGISTRAR");
		
		this.getContentPane().setLayout(null);
		this.setBounds(250, 280, 700, 700);
		
		lCodigo.setBounds(075, 50, 77, 27);
		cCodigo.setBounds(150,50,130,27);
		
		bRegistar.setBounds(075,80, 100, 27);
		lTitulo.setBounds(250, 8, 300, 30);
		cError.setBounds(40, 150, 500, 27);
		
		bRegistar.addActionListener(this);
		
		this.add(lCodigo);
		this.add(cCodigo);
		
		this.add(bRegistar);
		this.add(cError);
		
		this.setVisible(true);
		
		
		
		
		bRegistar.addActionListener(this);
		
		
		this.setSize(470,500);
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try{
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://asata400:3306/registroruben";
			String user="root";
			String password="toor";
			Connection con=null;
			PreparedStatement ps=null, ps1=null;
			ResultSet rs=null;
			String sql="select * from registro where codigo=?";
			String texto=null;
			String codigo=cCodigo.getText();
			
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
		    rs=ps.executeQuery();
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
			    barra.setBounds(075,200,500,500);
				add(barra);
				rs.close();
		    
		    
		}catch(Exception a){
			cError.setText("Error "+ a.getMessage());
			cError.setBackground(Color.PINK);
			cError.setFont(new Font("Verdana",Font.BOLD,17));   
			
			
			
			
		}
	}
}
