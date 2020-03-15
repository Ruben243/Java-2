import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class tablaCliente extends JFrame implements ActionListener {

	private JTable resultado;
	private JScrollPane barra;
	private JMenuBar msalir;
	private JMenuItem smSAlir;
	
	
	PreparedStatement ps=null;
	ResultSet rs=null;
	Connection conex=null;
	String user="postgres";
	String pass="cuelebre243";
	String url="jdbc:postgresql://localhost:5432/aeropuerto";
	

	public tablaCliente(String variable) {
		// TODO Auto-generated constructor stub
		super("Tabla de resultados");
		String para=variable;
		msalir=new JMenuBar();
		smSAlir=new JMenuItem("Salir");
		this.getContentPane().setLayout(null);
    	this.setBounds(350,100,600,600);//posicion x,y,ancho y alto de la ventana
		smSAlir.addActionListener(this);
		
	    this.add(msalir);
		msalir.add(smSAlir);
		 
		 this.setJMenuBar(msalir);
		 
	    this.setVisible(true);

	/*****************************************************************/	
		
		try {
			conex=DriverManager.getConnection(url,user,pass);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
    	try {
			try {
				
			 Class.forName("org.postgresql.Driver");
			} catch (Exception e) {
				System.out.println("Error driver");		
				}
		  
			boolean valido=conex.isValid(50000);
			System.out.println(valido ?"TEST OK" : "TEST FAIL");
			
		} catch (java.sql.SQLException sqle) {
			System.out.println("ERROR "+sqle);
		}
    	
    	
    	
    	/***********************************************/
    	try {
       String sql="select cliente.nombre,cliente.apellido1,vuelo.fecha_salida,vuelo.fecha_llegada,vuelo.id_vuelo \n" + 
       		"from cliente\n" + 
       		"inner join tarjeta_embarque \n" + 
       		"on cliente.id_cliente=tarjeta_embarque.id_cliente \n" + 
       		"inner join vuelo\n" + 
       		"on vuelo.id_vuelo=tarjeta_embarque.id_vuelo \n" + 
       		"inner join aeropuerto\n" + 
       		"on vuelo.aeropuerto_salida=aeropuerto.id_aeropuerto\n" + 
       		"inner join ciudad\n" + 
       		"on ciudad.id_ciudad=aeropuerto.id_ciudad where cliente.nombre=?;";
       
            Vector filas=new Vector();
            Vector colum=new Vector();
            Vector aux=new Vector();
            colum.addElement("cliente.nombre");
            colum.addElement("cliente.apellido1");
            colum.addElement("vuelo.fecha_salida");
            colum.addElement("vuelo.fecha_llegada");
            colum.addElement("vuelo.id_vuelo");





            ps=conex.prepareStatement(sql);
            ps.setString(1,para);
            rs=ps.executeQuery();

        	while (rs.next()) {
    			 aux=new Vector();
    			 aux.addElement(""+rs.getString("nombre"));
    			 aux.addElement(""+rs.getString("apellido1"));
    			 aux.addElement(""+rs.getString("fecha_salida"));
    			 aux.addElement(""+rs.getString("fecha_llegada"));
    			 aux.addElement(""+rs.getString("id_vuelo"));

    			filas.add(aux);

    	
				
			}
    	    resultado=new JTable(filas,colum);
    		barra=new JScrollPane(resultado);
    		barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			barra.setBounds(9, 2, 600,400);
			add(barra);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("ERROR"+ e.getMessage());
		}finally {
			
			try {
				rs.close();
				conex.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
               System.out.println(e.getMessage());			
               }
		}

		
		
	}


	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		String comando=a.getActionCommand();
		if (a.getSource() instanceof JMenuItem){
			if (comando.equals("Salir")) {
				this.dispose();
				
			}
		} 
			
		
	}
	
	
}
