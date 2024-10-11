import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    private final String apiKey = "74bd854605794966aef0215c";
    private final HttpClient client = HttpClient.newHttpClient();

    public ApiRespuesta obtenerConversion(String baseCurrency, String targetCurrency, double amount) {
        String direccion = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%f", apiKey, baseCurrency, targetCurrency, amount);

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar el código de estado de la respuesta
            if (response.statusCode() == 200) {
                String json = response.body();

                // Deserializar la respuesta a ApiRespuesta
                ApiRespuesta apiRespuesta = gson.fromJson(json, ApiRespuesta.class);
                return apiRespuesta;
            } else {
                System.out.println("Error: Código de estado " + response.statusCode());
            }

        } catch (Exception e) {
            System.out.println("ALGO FALLÓ: " + e.getMessage());
        }

        return null; // Retornar null si hubo un error
    }
}
