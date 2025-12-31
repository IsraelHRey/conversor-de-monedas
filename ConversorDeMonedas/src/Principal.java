import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ApiConexionConvertor consultor = new ApiConexionConvertor();

        String datos = consultor.obtenerDatosApi("USD","MXN");
        System.out.println(datos);

        JsonObject jsonObject = JsonParser.parseString(datos).getAsJsonObject();
        double valorMoneda = jsonObject.get("conversion_rate").getAsDouble();
        System.out.println("El valor de la tasa es: "+valorMoneda);

        Scanner lector = new Scanner(System.in);
        System.out.println("Que cantidad deseas realizar tu conversion?");
        double cantidad = lector.nextDouble();

        double conversion = valorMoneda*cantidad;
        System.out.println("La conversion es de " + String.format("%.2f", conversion) + " MXN") ;

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("******************************************");
            System.out.println("Sea bienvenido/a al Conversor de Monedas");
            System.out.println("1) Peso Mexicano ==> Dólar");
            System.out.println("2) Dólar ==> Peso Mexicano");
            System.out.println("3) Dólar ==> Real Brasileño");
            System.out.println("4) Real Brasileño ==> Dólar");
            System.out.println("5 Dolar ==> peso Argentino");
            System.out.println("6 Peso Argentino ==> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("******************************************");

            System.out.println("Elija una opcion");
            opcion = lector.nextInt();


            switch (opcion){
                case 1:
                    consultor.obtenerDatosApi("MXN", "USD");
                    break;
                case 2:
                    consultor.obtenerDatosApi("USD","MXN");
                    break;
                case 3: consultor.obtenerDatosApi("USD","BRL");
                    break;
                case 4:consultor.obtenerDatosApi("BRL","USD");
                    break;
                case 5: consultor.obtenerDatosApi("USD","ARS");
                    break;
                case 6: consultor.obtenerDatosApi("ARS","USD");
                    break;
                case 7:
                    System.out.println("Gracias por usar la aplicacion");
                    break;
                default:
                    System.out.println("Solo se admiten las opciones mencionadas");
            }

        }
     }

    public static void realizarConversion(String base, String destino, ApiConexionConvertor consultor, Scanner lector) {
        String datos = consultor.obtenerDatosApi(base, destino);

    }




}
