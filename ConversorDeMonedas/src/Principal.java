public class Principal {
    public static void main(String[] args) {

        ApiConexionConvertor consultor = new ApiConexionConvertor();

        String datos = consultor.obtenerDatosApi("USD","MXN");
        System.out.println(datos);

    }




}
