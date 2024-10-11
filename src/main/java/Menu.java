import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final ConsultaApi consultaApi = new ConsultaApi();

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n ****************************************");
            System.out.println("Bienvenido a Conversor de Divisas");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Dolar a Peso Argentino (USD to ARS)");
            System.out.println("2. Peso Argentino a Dolar (ARS to USD)");
            System.out.println("3. Dolar a Real Brasileño (USD to BRL)");
            System.out.println("4. Real Brasileño a Dolar (BRL to USD)");
            System.out.println("5. Dolar a Peso Colombiano (USD to COP)");
            System.out.println("6. Peso Colombiano a Dolar (COP to USD)");
            System.out.println("7. Salir");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Introduce la cantidad a convertir: ");
                double cantidad = scanner.nextDouble();
                String baseCurrency = ""; // Define tu base currency según la opción
                String targetCurrency = ""; // Define tu target currency según la opción

                switch (opcion) {
                    case 1:
                        baseCurrency = "USD";
                        targetCurrency = "ARS";
                        break;
                    case 2:
                        baseCurrency = "ARS";
                        targetCurrency = "USD";
                        break;
                    case 3:
                        baseCurrency = "USD";
                        targetCurrency = "BRL";
                        break;
                    case 4:
                        baseCurrency = "BRL";
                        targetCurrency = "USD";
                        break;
                    case 5:
                        baseCurrency = "USD";
                        targetCurrency = "COP";
                        break;
                    case 6:
                        baseCurrency = "COP";
                        targetCurrency = "USD";
                        break;
                }

                // Realiza la conversión
                ApiRespuesta respuesta = consultaApi.obtenerConversion(baseCurrency, targetCurrency, cantidad);
                if (respuesta != null) {
                    // Calcular el resultado de la conversión
                    double resultadoConversion = respuesta.conversion_result() * cantidad;

                    // Mostrar el resultado en el formato deseado
                    System.out.printf("\n %.0f %s es igual a %.0f %s%n", cantidad, baseCurrency, resultadoConversion, targetCurrency);
                } else {
                    System.out.println("No se pudo obtener la conversión.");
                }

            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el Conversor de Divisas. ¡Hasta luego!");
    }
}
