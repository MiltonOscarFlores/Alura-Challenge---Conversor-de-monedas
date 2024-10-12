# Conversor de Divisas

Una aplicación para convertir entre diferentes monedas de manera rápida. Este challenge fue desarrollado como parte de la formación Backend Java de Alura/Oracle.

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


## Licencia

Este proyecto está bajo la licencia MIT. Puedes ver más detalles en el archivo `LICENSE`.
