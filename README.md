# Conversor de Divisas

Este es un proyecto de consola en Java que realiza conversiones de divisas utilizando una API de tasas de cambio. Los usuarios pueden seleccionar entre diferentes pares de divisas y obtener el resultado de la conversión en tiempo real.

 Este challenge fue desarrollado como parte de la formación Backend Java de Alura/Oracle.

![Captura de pantalla 2024-10-11 205156](https://github.com/user-attachments/assets/548a0b02-88f6-4213-95bb-ecfe0704c04b)


## Funcionalidad

Permite seleccionar el tipo de conversión y la cantidad a convertir. Soporta las siguientes conversiones:

- Dólar a Peso Argentino (USD a ARS)
- Peso Argentino a Dólar (ARS a USD)
- Dólar a Real Brasileño (USD a BRL)
- Y más...

## Características

- Conversión instantánea.
- Interfaz simple.
- Tasas de cambio actualizadas.
- Guarda un `historial.txt` para ver el historial de consultas realizadas.


## Instalación

1. Configura Maven para instalar las dependencias:

    ```bash
    mvn install
    ```

2. Modifica el archivo `ConsultaApi.java` para agregar tu propia clave de la API en la variable `apiKey`:

    ```java
    private final String apiKey = "TU_CLAVE_API";
    ```

    Puedes obtener una clave gratuita desde [ExchangeRate-API](https://www.exchangerate-api.com/).


## Licencia

Este proyecto está bajo la licencia MIT. Puedes ver más detalles en el archivo `LICENSE`.
