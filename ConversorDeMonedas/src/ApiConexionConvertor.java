public class ApiConexionConvertor {
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/55a3630b0ce6bdb2f7a8f907/pair/"))
                .build();
    }
}
