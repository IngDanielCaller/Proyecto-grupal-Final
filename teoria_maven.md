# **TEORIA DE MAVEN**
## **¿Qué es Maven?**
![Maven](https://keepcoding.io/wp-content/uploads/2024/10/imagen-5.png)
Maven es **una herramienta de gestión y compilación de proyectos que simplifica el desarrollo de software, principalmente en Java** pero se puede adaptar a otros lenguajes de programación.

**Su función principal es gestionar el ciclo de vida del proyecto, desde la compilación, empaquetado, pruebas, instalación y despliegue, hasta la gestión de dependencias (librerías externas).**
Mediante un modelo de objetos de proyecto (POM), Maven gestiona la compilación, las pruebas y la documentación de un proyecto.
Utiliza un modelo basado en "convención sobre configuración" y un archivo de configuración XML llamado pom.xml para estandarizar la estructura y el ciclo de vida del proyecto, lo que mejora la colaboración y la eficiencia del equipo. 
## *¿Cómo usar MAVEN?*
Para usar Maven se sigue una serie de pasos que va desde la instalación, la configuración y una pequeña prueba para saber si se instaló correctamente en tu equipo.

Empecemos desde la instalación:

1. Ingresas al navegador de tu preferencia y en el buscador pones Maven y entras a la primera página que dice maven apache.
![Apache Maven](imagenes\imagen1.jpg)
2. Vas a la sección de descargas y buscas el enlace de descarga que diga **"apache-maven-3.9.11-bin.zip"**
![Apache Maven](imagenes\imagen2.jpg)
3. Lo instalas en tu equipo de forma normal y por defecto se va instalar en el disco local C, Archivos del Programa y ahí estará la carpeta del maven con todos los archivos que se instalaron.
![Apache Maven](imagenes\imagen3.jpg)
Muy bien completaste todos los pasos de **instalación**, ahora continuemos con la configuración de maven en tu equipo para que funcione correctamente:

4. Primero en el buscador de windows (windows 7 en este caso) buscas **Variables de entorno del Sistema**.
![Apache Maven](imagenes\imagen4.jpg)
5. Al dar click se abrira una ventana como la siguiente;
le das click al botón que dice **"Variables de entorno"**
![Apache Maven](imagenes\imagen5.jpg)
6. Se abrirá otra ventana parecida a está:
![Apache Maven](imagenes\imagen6.jpg)
7. Le haces click en el botón **"Nueva"** y se abrirá una ventana vacía donde en la parte que dice **Nombre de la variable** tienes que colocar **MAVEN_HOME** y en el **Valor de la variable** tienes que poner la ruta de la carpeta donde está Maven, por defecto estará en: **C:\Program Files\apache-maven-3.9.11** y das click al botón aceptar.
![Apache Maven](imagenes\imagen7.jpg)
8. Y les tiene que aparecer una nueva variable con el nombre y la ruta que pusimos en el paso anterior:
![Apache Maven](imagenes\imagen6.jpg)
9. Ahora vamos a la sección de Variable del sistema y buscamos el **Path**, haces click y le das al botón editar:
![Apache Maven](imagenes\imagen8.jpg)
10. En el caso de Windows 7 en el **valor de la variable** tienes que poner un ";" al final de la última variable y colocas la ruta de la carpeta donde está **bin** dentro de la carpeta de maven y por defecto será: **C:\Program Files\apache-maven-3.9.11\bin**
![Apache Maven](imagenes\imagen9.jpg)
11. Haces click en el botón aceptar en todas las ventanas abiertas y reinicias el equipo para que se guarde la nueva variable del sistema

**Felicidades ya configuraste Maven para windows 7 (en este caso) de forma exitosa!!!**

Ahora solo falta verificar si la instalación y la configuración está correctamente.

12. Para eso ingresa al **Git Bash** e ingresa el comando **mvn -v** y tendría que salir algo como esto:
![Apache Maven](imagenes\imagen10.jpg)

Si sale algo igual o similar a la imagen entonces **Felicidades todo salió bien y ya tienes Maven en tu equipo**.

## **¿Por qué usar Maven?**
Maven se usa porque automatiza y simplifica el manejo de proyectos Java (y otros lenguajes).
Sin Maven, tendrías que compilar, enlazar librerías y crear el .jar o .war manualmente.
Con Maven, todo eso se hace con un solo comando y de forma consistente en cualquier computadora.

**Principales razones:**

✅ Gestión automática de dependencias

No necesitas descargar manualmente librerías externas (como JUnit, MySQL Connector, etc.).

Maven las descarga desde repositorios en línea (Maven Central).

Ahorra tiempo y evita conflictos de versiones.

✅ Estructura estandarizada del proyecto

Todos los proyectos Maven tienen la misma estructura (src/main/java, src/test/java, etc.),
lo que facilita que cualquier desarrollador entienda el código.

✅ Automatización del ciclo de vida del proyecto

Compilar (mvn compile)

Probar (mvn test)

Empaquetar (mvn package)

Instalar o desplegar (mvn install, mvn deploy)
Todo se realiza con comandos simples, sin hacerlo manualmente.

✅ Reproducibilidad y portabilidad

Si compartes tu proyecto en Git, otro desarrollador solo necesita ejecutar mvn install para compilarlo igual que tú.

Evita el clásico “en mi PC sí funciona”.

✅ Integración con IDEs y herramientas CI/CD

Funciona perfectamente con Eclipse, IntelliJ, NetBeans, Jenkins, GitHub Actions, etc.

Facilita compilaciones automáticas y despliegues continuos.

✅ Documentación y control de versiones

Maven puede generar reportes de dependencias, documentación y versiones

## ¿Cuándo usar Maven?

Maven se usa cuando necesitas orden, automatización y escalabilidad en un proyecto.

🔸 Úsalo cuando:

- Estás trabajando en un proyecto Java mediano o grande.

- Tu proyecto usa varias librerías externas.

- Necesitas automatizar la compilación, pruebas y empaquetado.

- Colaboras con más de un desarrollador (facilita el trabajo en equipo).

- Quieres integrar tu código con Jenkins, GitHub Actions u otro sistema de integración continua.

- Quieres mantener versiones claras de dependencias y configuraciones.

🔸 No es necesario usar Maven cuando:

- Estás aprendiendo Java con programas pequeños (uno o dos archivos).

- No necesitas dependencias externas ni empaquetado.

- Solo quieres probar código rápido en un entorno sencillo (por ejemplo, usando javac directamente).