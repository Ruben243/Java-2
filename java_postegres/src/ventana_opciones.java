
//importamos librerias
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author ruben-gfp
 *
 */

//clase extendida de JFrame que implementa ActionListener y en la que se declaran JLabel,JButton yJCombobox
public class ventana_opciones extends JFrame implements ActionListener {
	private JLabel text, findCli, findCity;
	private JButton find, exit;
	public JComboBox comboCli, comboAero, comboCity;

	/**
	 * Funcion que comprobara si el jdbc es detectado o no.Si esta OK realizara una
	 * consulta sql a postgreSQL y usara los resultados para rellenar un JCombobox
	 * 
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
	 * @return retorna un JCombobox con los datos que necesitamos
	 * @throws SQLException
	 */
	public JComboBox llenar_comboAero() throws SQLException {
		comboAero = new JComboBox();// declaramos JCombobox
		String sql = "select nombre from aeropuerto;";// sentencia sql devolvera todos los nombres de la tabla
														// aeropuerto
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conex = null;
		String user = "postgres";
		String pass = "cuelebre243";
		String url = "jdbc:postgresql://localhost:5432/aeropuerto";
		conex = DriverManager.getConnection(url, user, pass);
		try {
			try {

				Class.forName("org.postgresql.Driver");
			} catch (Exception e) {
				System.out.println("Error driver");
			}

			boolean valido = conex.isValid(50000);
			System.out.println(valido ? "TEST OK" : "TEST FAIL");// respuesta sobre si el driver esta o no disponible

		} catch (java.sql.SQLException sqle) {
			System.out.println("ERROR " + sqle);
		}

		try {
			ps = conex.prepareStatement(sql);
			rs = ps.executeQuery();
			comboAero.addItem("");// opcion por defecto
			while (rs.next()) {

				comboAero.addItem(rs.getString("nombre"));// añadimos la informacion al combobox

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("ERROR" + e.getMessage());
		} finally {
			rs.close();/// cerramos el Statement
			conex.close();// cerramos la conexion
		}
		return comboAero;// retornamos el combobox

	}

	/**
	 * Funcion que comprobara si el jdbc es detectado o no.Si esta OK realizara una
	 * consulta sql a postgreSQL y usara los resultados para rellenar un JCombobox
	 * 
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
	 * @return retorna un JCombobox con los datos que necesitamos
	 * @throws SQLException
	 */
	public JComboBox llenar_comboCliente() throws SQLException {
		comboCli = new JComboBox();
		String sql = "select nombre from cliente;";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conex = null;
		String user = "postgres";
		String pass = "cuelebre243";
		String url = "jdbc:postgresql://localhost:5432/aeropuerto";
		conex = DriverManager.getConnection(url, user, pass);
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

		try {
			ps = conex.prepareStatement(sql);
			rs = ps.executeQuery();
			comboCli.addItem("");
			while (rs.next()) {

				comboCli.addItem(rs.getString("nombre"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("ERROR" + e.getMessage());
		} finally {
			rs.close();
			conex.close();
		}
		return comboCli;

	}

	/**
	 * Funcion que comprobara si el jdbc es detectado o no.Si esta OK realizara una
	 * consulta sql a postgreSQL y usara los resultados para rellenar un JCombobox
	 * 
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
	 * @return retorna un JCombobox con los datos que necesitamos
	 * @throws SQLException
	 */
	public JComboBox llenar_comboCity() throws SQLException {
		comboCity = new JComboBox();
		String sql = "select nombre from ciudad;";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conex = null;
		String user = "postgres";
		String pass = "cuelebre243";
		String url = "jdbc:postgresql://localhost:5432/aeropuerto";
		conex = DriverManager.getConnection(url, user, pass);
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

		try {
			ps = conex.prepareStatement(sql);
			rs = ps.executeQuery();
			comboCity.addItem("");
			while (rs.next()) {

				comboCity.addItem(rs.getString("nombre"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("ERROR" + e.getMessage());
		} finally {
			rs.close();
			conex.close();
		}
		return comboCity;

	}

	/**
	 * Funcion que creara un objeto JFrame,una ventana con JLabel,JComboBox y
	 * JButton.
	 * 
	 * @throws HeadlessException
	 * @throws SQLException
	 * @see llenar_comboCity
	 * @see llenar_comboAero
	 * @see llenar_comboCliente
	 */
	public ventana_opciones() throws HeadlessException, SQLException {
		super("Busqueda");
		text = new JLabel("Buscar por nombre de aeropuerto:");
		find = new JButton("Buscar");
		findCli = new JLabel("Buscar cliente:");
		findCity = new JLabel("Buscar por ciudad");
		comboCity = llenar_comboCity();
		comboAero = llenar_comboAero();
		comboCli = llenar_comboCliente();
		exit = new JButton("Salir");

		this.getContentPane().setLayout(null);
		this.setBounds(350, 100, 510, 400);// posicion x,y,ancho y alto de la ventana

		find.addActionListener(this);
		exit.addActionListener(this);

		text.setBounds(9, 2, 170, 25);
		comboAero.setBounds(9, 25, 170, 25);
		findCli.setBounds(300, 2, 170, 25);
		comboCli.setBounds(300, 25, 170, 25);
		comboCity.setBounds(150, 25, 100, 25);
		findCity.setBounds(9, 200, 170, 26);
		comboCity.setBounds(9, 230, 170, 20);
		find.setBounds(120, 300, 100, 25);
		exit.setBounds(320, 300, 100, 25);

		this.add(text);
		this.add(comboAero);
		this.add(findCli);
		this.add(comboCli);
		this.add(findCity);
		this.add(comboCity);
		this.add(find);
		this.add(exit);

		this.setVisible(true);

	}

	/**
	 * @param JButon  pulsa variable a la que se le asigna b.getSource dependiendo
	 *                el boton que se active.
	 * @param boolean select variable a la que se le asigna el comboAero y verifica
	 *                si esta vario o no
	 * @param boolean select2 variable a la que se le asigna el comboCity y verifica
	 *                si esta vario o no
	 * @param boolean select2 variable a la que se le asigna el comboCli y verifica
	 *                si esta vario o no
	 * 
	 */
	public void actionPerformed(ActionEvent b) {
		// TODO Auto-generated method stub
		JButton pulsa = (JButton) b.getSource();
		boolean select = comboAero.getSelectedItem().toString().isEmpty();
		boolean select2 = comboCity.getSelectedItem().toString().isEmpty();
		boolean select3 = comboCli.getSelectedItem().toString().isEmpty();

		if (pulsa == find && select == false) {// si pulsa se obtiene de el boton find y comboAero tiene valor:
			String variable = (String) comboAero.getSelectedItem();
			comboCity.setSelectedItem("");// poner a vacio los combobox
			comboCli.setSelectedItem("");// poner a vacio los combobox
			comboAero.setSelectedItem("");// poner a vacio los combobox
			tablaAeropuerto v2 = new tablaAeropuerto(variable);
			variable = "";

		} else if (pulsa == find && select2 == false) {// si pulsa se obtiene de el boton find y comboCity tiene valor:
			String variable = (String) comboCity.getSelectedItem();
			comboCli.setSelectedItem("");// poner a vacio los combobox
			comboAero.setSelectedItem("");// poner a vacio los combobox
			comboCity.setSelectedItem("");// poner a vacio los combobox
			tablaCiudad v3 = new tablaCiudad(variable);
			variable = "";

		} else if (pulsa == find && select3 == false) {// si pulsa se obtiene de el boton find y comboCli tiene valor:
			String variable = (String) comboCli.getSelectedItem();
			comboCity.setSelectedItem("");// poner a vacio los combobox
			comboAero.setSelectedItem("");// poner a vacio los combobox
			comboCli.setSelectedItem("");// poner a vacio los combobox
			tablaCliente v4 = new tablaCliente(variable);
			variable = "";

		} else if (pulsa == exit) {// si pulsa se obtiene de el boton exit:
			System.exit(0);

		}

	}

}
