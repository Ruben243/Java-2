package JTable001;

import com.mysql.cj.jdbc.Driver;

import java.awt.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class JTable001 extends JFrame implements ActionListener{
	private JLabel Lpresupuesto;
	private JTextField Cpresupuesto;
	private JButton send;
	private JTable departamentos;
	private JScrollPane barra;
	
	
	public JTable001() throws HeadlessException {
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
	public void actionPerformed(ActionEvent a) {
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
			String columnas[]={"codigo","nombre","salario"};
			int i=0;
			String filas[][]=new String[5][3];
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			ps=con.prepareStatement(sql);
			texto=Cpresupuesto.getText();
			ps.setString(1,texto );
			rs=ps.executeQuery();
			while(rs.next()){
				filas[i][0]=""+ rs.getInt(1);
				filas[i][1]=rs.getString(2);
				filas[i][2]=""+rs.getInt(3);
				i++;
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
