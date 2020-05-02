package apiConsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class api {
	private static HttpURLConnection connect;

	public static void main(String[] args) {

		// metodo 1 : java.net.HttpUrlConnection metodo antes de java 11
/*
		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/comments");
			try {
				connect = (HttpURLConnection) url.openConnection();

				// request setup connect.setRequestMethod("GET");
				connect.setConnectTimeout(5000);
				connect.setReadTimeout(5000);

				int status = connect.getResponseCode();

				// System.out.println(status);

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

				parse(result);

			} catch (IOException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (MalformedURLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connect.disconnect();
		}
	}
*/
	/*
	 * metodo 2 java.net.httpClient java 11 creamos un cliente HttpCliente,la
	 * consulta con su construtor url a la que va dirigida la consulta //mandamos la
	 * consulta como asyncrona la clase api llama a parse
	 */
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest resquest = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/comments"))
			.build();

	client.sendAsync(resquest,HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAcceptAsync(api::parse).join();

	}

	/*
	 * convertirmos el string a un JSONArray el JSONObjecy cojera el valor del
	 * JSonArray en posicion i accedemos a los valores //Mostramos los valores
	 */
	public static String parse(String responseBody) {
		JSONArray comments = new JSONArray(responseBody);
		for (int i = 0; i < comments.length(); i++) {
			JSONObject comment = comments.getJSONObject(i);
			String email = comment.getString("email");
			String comentario = comment.getString("body");

			System.out.println(email + " says:" + "\r");
			System.out.println(comentario + "\n");
		}

		return null;
	}

}
