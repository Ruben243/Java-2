package JTable001;
import com.mysql.cj.jdbc.Driver;

import java.awt.*;
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

public class JTable002 extends JFrame implements ActionListener{
	private JLabel Lpresupuesto;
	private JTextField Cpresupuesto;
	private JButton send;
	private JTable departamentos;
	private JScrollPane barra;
	

	public JTable002() throws HeadlessException {
		super("Busqueda");
		Lpresupuesto=new JLabel("Presupuesto");
		Cpresupuesto=new JTextField(15);
		send=new JButton("ACEPTAR");
		departamentos=new JTable();
		
		getContentPane().setLayout(new FlowLayout());
		add(Lpresupuesto);
		add(Cpresupuesto);
		add(send);
		
		send.addActionListener(this);
	
		
		
		
		
		setSize(250,250);
		setVisible(true);
		
		
	
	
}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try{
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://asata400:3306/empresaruben2";
			String user="root";
			String password="toor";
			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			String sql="select * from departamento where presupuesto >?";
			String texto=null;
		    int i=0;
		    Vector aux=null;
		    Vector filas=new Vector();
		    Vector columnas=new Vector();
		    columnas.addElement("Codigo");
		    columnas.addElement("Nombre");
		    columnas.addElement("Presupuesto");
		    Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			ps=con.prepareStatement(sql);
			texto=Cpresupuesto.getText();
			ps.setString(1,texto );
			rs=ps.executeQuery();
			while(rs.next()){
				aux=new Vector();
				aux.addElement(""+rs.getInt(1));
				aux.addElement(rs.getString(2));
				aux.addElement(""+rs.getInt(3));
		        filas.add(aux);
			}
			
			departamentos=new JTable(filas,columnas);
			barra=new JScrollPane(departamentos);
			barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			add(barra);
			
			
			rs.close();
	}catch(Exception e){
			
			System.out.println("ERROR "+ e.getMessage());
			
			
		}
		
		
	}

	
}	

