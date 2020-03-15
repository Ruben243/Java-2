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

/**
 * 
 * @author ruben-gfp
 * @param String                      sql sentencia sql que se le pasara a
 *                                    PostgreSQL
 * @param Connection                  conex Interface que representa una
 *                                    conexión SQL contra la base de datos.
 * @param PreparedStatement           ps se encarga es de definir una consulta
 *                                    SQL a ejecutar contra el motor de la base
 *                                    de datos.
 * @param ResultSet                   rs mantiene un cursor apuntando a su fila
 *                                    de datos actual.
 * @param String                      user parametro donde se almacena el
 *                                    usuario de la base de datos.
 * @param String                      pass parametro donde se almacena la
 *                                    contraseña del usuario para la basse de
 *                                    datos
 * @param String                      url parametro donde se almacena la
 *                                    ip,puerto y base de datos a la que te
 *                                    quieres conectar
 * @param DriverManager.getConnection Método que nos permite establecer una
 *                                    conexión con la base de datos.
 */

public class tablaCiudad extends JFrame implements ActionListener {

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

	public tablaCiudad(String variable) {
		// TODO Auto-generated constructor stub
		super("Tabla de resultados");
		String para = variable;
		msalir = new JMenuBar();
		smSAlir = new JMenuItem("Salir");
		this.getContentPane().setLayout(null);
		this.setBounds(350, 100, 600, 600);// posicion x,y,ancho y alto de la ventana
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
			String sql = "select aeropuerto.nombre,vuelo.fecha_salida,vuelo.fecha_llegada ,ciudad.nombre from vuelo"
					+ "	    				inner join aeropuerto"
					+ "	    				on aeropuerto.id_aeropuerto=vuelo.aeropuerto_salida"
					+ "	    				inner join ciudad on ciudad.id_ciudad=aeropuerto.id_ciudad"
					+ "	    				where ciudad.nombre=?;";

			Vector filas = new Vector();
			Vector colum = new Vector();
			Vector aux = new Vector();
			colum.addElement("aeropuerto.nombre");
			colum.addElement("vuelo.fecha_salida");
			colum.addElement("vuelo.fecha_llegada");
			colum.addElement("ciudad.nombre");
			ps = conex.prepareStatement(sql);
			ps.setString(1, para);
			rs = ps.executeQuery();

			while (rs.next()) {
				aux = new Vector();
				aux.addElement("" + rs.getString("nombre"));
				aux.addElement("" + rs.getString("fecha_salida"));
				aux.addElement("" + rs.getString("fecha_llegada"));
				aux.addElement("" + rs.getString("nombre"));

				filas.add(aux);

			}
			resultado = new JTable(filas, colum);
			barra = new JScrollPane(resultado);
			barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			barra.setBounds(9, 2, 600, 400);
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

	/**
	 * Funcion que escuchara un evento
	 * @param String comando variable a la que se le asignara a.getActionCommand
	 */
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		String comando = a.getActionCommand();
		if (a.getSource() instanceof JMenuItem) {
			if (comando.equals("Salir")) {//si comando es igual a salir
				this.dispose();//destruimos esta ventana

			}
		}

	}

}
