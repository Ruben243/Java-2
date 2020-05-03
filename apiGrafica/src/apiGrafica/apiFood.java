package apiGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import org.json.JSONArray;
import org.json.JSONObject;

//clase apiFood que hereda de JFrame e implementa un ActionListener
public class apiFood extends JFrame implements ActionListener {

	private JButton btn_action;// boton
	private JLabel logo, mensaje;// logo y mensaje

	// constructor
	public apiFood() {
		super("Locales de Gijon");// titulo se la ventana
		btn_action = new JButton("Mostrar locales");// Instancia de JButton con texto del boton
		logo = new JLabel(new ImageIcon("/home/ruben-gfp/Documentos/Java/apiGrafica/img/logo.png"));// icono con su ruta
		mensaje = new JLabel("Locales de Gijon");// mensaje

		this.getContentPane().setLayout(null);

		this.setBounds(350, 100, 1400, 550);// posicionamiento de la ventana principal en la pantalla y sus dimensiones

		btn_action.addActionListener(this);// añadimos un ActionListener al boton

		/* Dimensiones y posicion de los elementos en el panel */
		mensaje.setBounds(169, 2, 200, 27);
		logo.setBounds(30, 40, 400, 400);
		btn_action.setBounds(145, 450, 150, 30);

		// Añadimos los elementos al panel
		this.add(mensaje);
		this.add(logo);
		this.add(btn_action);

		this.setVisible(true);// hacemos visible el panel

	}

	@Override
	public void actionPerformed(ActionEvent c) {
		// TODO Auto-generated method stub
		HttpURLConnection connect = null;// Instancia de la conexion
		JButton click = (JButton) c.getSource();// recogemos el click del boton
		// si click es igual al boton de nuestra app
		if (click == btn_action) {
			BufferedReader reader;
			String line;
			StringBuffer responseContent = new StringBuffer();

			try {
				URL url = new URL(
						"http://geocode.arcgis.com/arcgis/rest/services/World/GeocodeServer/findAddressCandidates?f=json&category=Food&location=-5.6615200,43.5357300&outFields=Place_addr,PlaceName,&maxLocations=30");
				try {
					connect = (HttpURLConnection) url.openConnection();

					connect.setRequestMethod("GET");
					connect.setConnectTimeout(5000);
					connect.setReadTimeout(5000);

					int status = connect.getResponseCode();// recojemos la respuesta del server

					// System.out.println(status);

					// si es mayor que 200 da error lo recojemos
					if (status > 299) {
						reader = new BufferedReader(new InputStreamReader(connect.getErrorStream()));

						while ((line = reader.readLine()) != null) {
							responseContent.append(line);

						}
						reader.close();

					} else {
						reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
						while ((line = reader.readLine()) != null) {
							responseContent.append(line);

						}
						reader.close();
					}

					String result = responseContent.toString();
					JTable locales;
					JScrollPane barra;
					Vector filas = new Vector();
					Vector colum = new Vector();
					colum.add("Local");
					colum.add("Direccion");
					JSONObject resulta = new JSONObject(result);// convertirmos el string en un jsonobject
					JSONArray candidates = resulta.getJSONArray("candidates");// cojemos la parte que nos interesa y la
					// recorremos el Jsonarray con un for
					for (int i = 0; i < candidates.length(); i++) {
						Vector fin = new Vector();
						JSONObject resultado = candidates.optJSONObject(i);
						fin.addElement("" + resultado.getJSONObject("attributes").getString("PlaceName"));//asi se accede a un objeto dentro de otro
						fin.addElement("" + resultado.getJSONObject("attributes").getString("Place_addr"));
						filas.add(fin);

					}

					locales = new JTable(filas, colum);
					barra = new JScrollPane(locales);
					barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					barra.setBounds(500, 2, 860, 502);
					this.add(barra);

				} catch (IOException e) { // TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (MalformedURLException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				connect.disconnect();
			}
		}
	}

}
