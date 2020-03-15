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

public class tablaAeropuerto extends JFrame implements ActionListener {
	private JTable resultado;
	private JScrollPane barra;
	private JMenuBar msalir;
	private JMenuItem smSAlir;

	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conex = null;
	String user = "postgres";
	String pass = "cuelebre243";
	String url = "jdbc:postgresql://localhost:5432/aeropuerto";

	public tablaAeropuerto(String variable) {
		// TODO Auto-generated constructor stub
		super("Tabla de resultados");
		String para = variable;
		msalir = new JMenuBar();
		smSAlir = new JMenuItem("Salir");
		this.getContentPane().setLayout(null);
		this.setBounds(350, 100, 510, 400);// posicion x,y,ancho y alto de la ventana
		smSAlir.addActionListener(this);

		this.add(msalir);
		msalir.add(smSAlir);

		this.setJMenuBar(msalir);

		this.setVisible(true);

		/*****************************************************************/

		try {
			conex = DriverManager.getConnection(url, user, pass);
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

			boolean valido = conex.isValid(50000);
			System.out.println(valido ? "TEST OK" : "TEST FAIL");

		} catch (java.sql.SQLException sqle) {
			System.out.println("ERROR " + sqle);
		}

		/***********************************************/
		try {
			String sql = "select aeropuerto.nombre,vuelo.fecha_salida  \n" + ",vuelo.fecha_llegada  from vuelo\n"
					+ "inner join aeropuerto \n" + "on aeropuerto.id_aeropuerto=vuelo.aeropuerto_salida\n"
					+ "inner join ciudad\n" + "on ciudad.id_ciudad=aeropuerto.id_ciudad\n" + "inner join pais\n"
					+ "on ciudad.id_pais=pais.id_pais where aeropuerto.nombre=?;";

			Vector filas = new Vector();
			Vector colum = new Vector();
			Vector aux = new Vector();
			colum.addElement("aeropuerto.nombre");
			colum.addElement("vuelo.fecha_salida");
			colum.addElement("vuelo.fecha_llegada");
			ps = conex.prepareStatement(sql);
			ps.setString(1, para);
			rs = ps.executeQuery();

			while (rs.next()) {
				aux = new Vector();
				aux.addElement("" + rs.getString("nombre"));
				aux.addElement("" + rs.getString("fecha_salida"));
				aux.addElement("" + rs.getString("fecha_llegada"));

				filas.add(aux);

			}
			resultado = new JTable(filas, colum);
			barra = new JScrollPane(resultado);
			barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			barra.setBounds(9, 2, 500, 300);
			add(barra);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("ERROR" + e.getMessage());
		} finally {

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
		String comando = a.getActionCommand();
		if (a.getSource() instanceof JMenuItem) {
			if (comando.equals("Salir")) {
				this.dispose();

			}
		}

	}

}
