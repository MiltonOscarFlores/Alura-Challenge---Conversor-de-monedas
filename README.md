# Conversor de Divisas

Este es un proyecto de consola en Java que realiza conversiones de divisas utilizando una API de tasas de cambio. Los usuarios pueden seleccionar entre diferentes pares de divisas y obtener el resultado de la conversión en tiempo real.

![Captura de pantalla 2024-10-11 205156](https://github.com/user-attachments/assets/548a0b02-88f6-4213-95bb-ecfe0704c04b)

## Características

- Conversión entre diferentes divisas utilizando la [ExchangeRate-API](https://www.exchangerate-api.com/).
- Permite convertir entre varias monedas comunes como USD, ARS, BRL, COP, entre otras.
- Interfaz de consola simple y fácil de usar.

## Requisitos

- **Java 21** o superior
- **Maven** para la gestión de dependencias

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tuusuario/conversor-divisas.git
    cd conversor-divisas
    ```

2. Configura Maven para instalar las dependencias:

    ```bash
    mvn install
    ```

3. Modifica el archivo `ConsultaApi.java` para agregar tu propia clave de la API en la variable `apiKey`:

    ```java
    private final String apiKey = "TU_CLAVE_API";
    ```

    Puedes obtener una clave gratuita desde [ExchangeRate-API](https://www.exchangerate-api.com/).

## Uso

1. Ejecuta el programa desde tu IDE o con el siguiente comando desde la terminal:

    ```bash
    mvn exec:java -Dexec.mainClass="org.example.Main"
    ```

## Dependencias

Este proyecto utiliza las siguientes dependencias de Maven:

- **Gson** para el manejo de JSON:

    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
    ```

## Contribuciones

Las contribuciones son bienvenidas. Si tienes alguna mejora o corrección, puedes abrir un _pull request_ o crear un _issue_.

## Licencia

Este proyecto está bajo la licencia MIT. Puedes ver más detalles en el archivo `LICENSE`.
