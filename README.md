# Conversor de Monedas - Challenge ONE

¡Bienvenido al Conversor de Monedas! Este proyecto fue desarrollado como parte del Challenge de Java para el programa **Oracle Next Education (ONE)**. Es una aplicación de consola que permite realizar conversiones de divisas en tiempo real utilizando una API externa.

## Funcionalidades

* **Conversión en tiempo real:** Utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio más actualizadas.
* **Soporte multi-moneda:** Permite convertir entre Pesos Mexicanos (MXN), Dólares (USD), Pesos Argentinos (ARS) y Reales Brasileños (BRL).
* **Interfaz Interactiva:** Menú dinámico construido con un ciclo `while` y estructura `switch-case`.
* **Robustez (Manejo de Errores):** El programa está blindado con bloques `try-catch` para manejar excepciones de entrada (como cuando el usuario ingresa letras en lugar de números) y errores de conexión a la API.

##  Tecnologías Utilizadas

* **Java JDK 17** o superior.
* **Gson (Google):** Para el análisis y procesamiento de datos en formato JSON.
* **HttpClient & HttpRequest:** Para la comunicación con el servidor de la API.

##  Cómo utilizar el programa

1. Clona este repositorio.
2. Abre el proyecto en tu IDE favorito (se recomienda IntelliJ IDEA).
3. Asegúrate de tener la librería **Gson** configurada en las dependencias.
4. Ejecuta la clase `Principal.java`.
5. Selecciona una opción del menú y sigue las instrucciones en consola.

Desarrollado por IsraelHRey
