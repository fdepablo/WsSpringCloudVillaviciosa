Para hacer un proyecto Spring debemos lo primero de importar
las librerias de Spring, es decir los .jar

Para crear un JAR
1) boton derecho sobre el proyecto y export
2) Exportar como "jar file"
3) Elegir el destino
4) Finish

Para usar ese jar en un proyecto
1) crear en el proyecto la carpeta lib
2) Meter dicho .jar en el classpath, que es un fichero
donde la vm de java a a buscar todas las clases para usar
en el proyecto
3) boton derecho -> Build path -> Configure build path -> add la libreria


En la industria actual para importar librerías en un proyecto java se suele utilizar MAVEN
Manven es un software ampliamente utilizado en el desarrollo de software que nos ayuda a llevar el ciclo de vida de un
programa entero, desde que empiezas a programarlo hasta que 
lo pones en producción.
Una de las partes más importantes que tiene Maven es para las
dependencias de las librerías de nuestra app

Para crear un proyecto Maven podemos hacerlo:
1) Boton derecho sobre el proyecto
2) Configure
3) Convertir a proyecto Maven

Una vez hecho esto, podemos empezar a configurar las dependencias en el fichero pom.xml

Siempre deberemos de ir al repositorio central de maven

https://mvnrepository.com/repos/central

Y copiar las dependecias en nuestro pom.xml


 SPRING
--------
Lo primero que tenemos que hacer es crear el contexto de spring, podemos hacerlo de varias maneras, una es
mediante ficheros xml, pasos
1) Crear el paquete recursos
2) Sobre recursos new File -> Spring bean configuration file
