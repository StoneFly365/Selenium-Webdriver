# Selenium Webdriver Project

Este proyecto utiliza Selenium Webdriver para la automatización de pruebas.

## Estructura del Proyecto

- `.gitattributes` y `.gitignore`: Archivos de configuración de Git.
- `build.gradle`, `gradlew`, `gradlew.bat`, `settings.gradle`: Archivos de configuración de Gradle.
- `.gradle/`: Directorio de caché específico del proyecto Gradle.
- `.idea/`: Archivos de configuración del proyecto de IntelliJ IDEA.
- `.vscode/`: Archivos de configuración del proyecto de Visual Studio Code.
- `build/`: Directorio de salida de compilación de Gradle.
- `chromedriver_win32/`: Contiene el ejecutable de ChromeDriver y su licencia.
- `gradle/`: Contiene configuraciones adicionales de Gradle.
- `src/`: Directorio de código fuente.
- `test/`: Directorio de pruebas.
- `target/`: Directorio de resultados de pruebas y reportes.

## Requisitos

- Java Development Kit (JDK)
- Gradle
- ChromeDriver

## Configuración

1. Clona el repositorio:
    ```sh
    git clone <URL_DEL_REPOSITORIO>
    cd Selenium-Webdriver
    ```

2. Configura el entorno de Gradle:
    ```sh
    ./gradlew build
    ```

3. Asegúrate de tener el `chromedriver.exe` en el directorio `chromedriver_win32/`.

## Ejecución de Pruebas

Para ejecutar las pruebas, utiliza el siguiente comando:
```sh
./gradlew test
```

Los resultados de las pruebas se generarán en el directorio `build/test-results/`.

## Reportes

Los reportes de Cucumber se generarán en el directorio `target/cucumber-reports`.

## Contribución

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.