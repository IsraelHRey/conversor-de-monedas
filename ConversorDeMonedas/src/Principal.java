import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ApiConexionConvertor consultor = new ApiConexionConvertor();

        Scanner lector = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 7) {

            try {


                System.out.println("\n******************************************\n");
                System.out.println("Sea bienvenido/a al Conversor de Monedas\n");
                System.out.println("1) Peso Mexicano ==> Dólar");
                System.out.println("2) Dólar ==> Peso Mexicano");
                System.out.println("3) Dólar ==> Real Brasileño");
                System.out.println("4) Real Brasileño ==> Dólar");
                System.out.println("5 Dolar ==> peso Argentino");
                System.out.println("6 Peso Argentino ==> Dolar");
                System.out.println("7) Salir");
                System.out.println("Elija una opción válida:\n");
                System.out.println("******************************************\n");
                System.out.println("Elija una opcion");

                opcion = lector.nextInt();


                switch (opcion) {
                    case 1:
                        realizarConversion("MXN", "USD", consultor, lector);
                        break;
                    case 2:
                        realizarConversion("USD", "MXN", consultor, lector);
                        break;
                    case 3:
                        realizarConversion("USD", "BRL", consultor, lector);
                        break;
                    case 4:
                        realizarConversion("BRL", "USD", consultor, lector);
                        break;
                    case 5:
                        realizarConversion("USD", "ARS", consultor, lector);
                        break;
                    case 6:
                        realizarConversion("ARS", "USD", consultor, lector);
                        break;
                    case 7:
                        System.out.println("Gracias por usar la aplicacion");
                        break;
                    default:
                        System.out.println("Solo se admiten las opciones mencionadas");
                }
            } catch (InputMismatchException e){System.out.println("\n Error: Elija una opción válida (solo números del 1 al 7).");
                lector.next();}

        }
     }

    public static void realizarConversion(String base, String destino, ApiConexionConvertor consultor, Scanner lector) {
        try {
            String datos = consultor.obtenerDatosApi(base, destino);
            JsonObject jsonObject = JsonParser.parseString(datos).getAsJsonObject();
            double valorMoneda = jsonObject.get("conversion_rate").getAsDouble();
            System.out.println("Que cantidad deseas realizar tu conversion?\n");
            double cantidad = lector.nextDouble();
            double conversion = valorMoneda * cantidad;
            System.out.println("\nLa conversion es de " + String.format("%.2f", conversion));
        }catch (Exception e){
            System.out.println("\nERROR: Por favor, ingresa solo números.");
            lector.nextLine();
        }

    }




}
