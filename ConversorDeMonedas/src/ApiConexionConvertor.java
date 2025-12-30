import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConexionConvertor {
    public static void main(String[] args) {

    }

        public String obtenerDatosApi(String monedaBase, String monedaDestino){
         String direccion = "https://v6.exchangerate-api.com/v6/55a3630b0ce6bdb2f7a8f907/pair/"+monedaBase+"/"
                 +monedaDestino;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = null;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return response.body();
        }



}
