PROYECTO: Flujo de Compra - Serenity BDD

Este proyecto contiene una prueba funcional automatizada (E2E) del flujo de compra en el sitio: http://opencart.abstracta.us/

REQUISITOS:
- Java 11 o superior
- Instalación Gradle 4.7
- Instalación Git
- Maven instalado y configurado
- Navegador Chrome
- IDE (recomendado: IntelliJ)
- Instalación Plugin Cucumber for Java
- Instalación NodeJS

EJECUCIÓN PASO A PASO:

1. Clonar el repositorio:
   git clone https://github.com/MoniBusB/flujo-compra-serenity.git

2. Ingresar a la carpeta del proyecto:
   cd flujo-compra-serenity

3. Ejecutar la prueba con Maven:
   mvn clean verify

4. Ver el reporte:
   Abrir el archivo generado en la ruta:
   target/site/serenity/index.html

ESTRUCTURA:
- src/test/java/... → contiene las clases de definición, tareas, preguntas, etc.
- src/test/resources/features → contiene el archivo .feature
- pom.xml → archivo de configuración del proyecto con Serenity y dependencias

AUTORA: Mónica Bustamante
