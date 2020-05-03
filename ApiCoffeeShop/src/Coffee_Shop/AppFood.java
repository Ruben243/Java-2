package Coffee_Shop;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppFood {

	public static void main(String[] args) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest resquest = HttpRequest.newBuilder().uri(URI.create(
				"http://geocode.arcgis.com/arcgis/rest/services/World/GeocodeServer/findAddressCandidates?f=json&category=Food&location=-5.6615200,43.5357300&outFields=Place_addr,PlaceName,&maxLocations=10"))
				.build();

		client.sendAsync(resquest, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)
				.thenAcceptAsync(AppFood::parse).join();

	}

	/**
	 * attributes es un objeto y se saca su informacion con get string(campo);
	 * 
	 * @param result
	 * @return
	 */
	public static String parse(String result) {
		JSONObject resulta = new JSONObject(result);// convertirmos el string en un jsonobject
		JSONArray candidates = resulta.getJSONArray("candidates");// cojemos la parte que nos interesa y la pasamos a un
																	// jsonArray
		// recorremos el Jsonarray con un for
		for (int i = 0; i < candidates.length(); i++) {
			JSONObject resultado = candidates.optJSONObject(i);
			String pn = resultado.getJSONObject("attributes").getString("PlaceName");
			String pa = resultado.getJSONObject("attributes").getString("Place_addr");
			System.out.println(pn);
			System.out.println(pa);
			System.out.println("\n");
		}

		return null;
	}

}
