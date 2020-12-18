JPA y Spring JPA Data
-
La evolución mas o menos del acceso a datos podria ser lo siguiente:

1) JDBC
2) Frameworks ORM, object relational mapping
	lo que buscaban estos frameworks era automatizar el acceso a datos
	Tenemos equivalencias entre la bbdd y la poo
	a) las clases en poo con las tablas en bbdd
	b) los atributos en poo son las columnas en bbdd
	c) los objetos en poo son los registros en bbdd
	Estos framewords mediante anotaciones hacemos todo el mapeo (@Entity, etc)
	Que ocurrio? Aparecieron muuuuuchos ORMs en el mercado, por ejemplo Hibernate
	, o Hibatis o EclipseLink. Era un descontrol porque cada framework utiliza sus propias
	etiquetas. Entonces es cuando nacio JPA
3) JPA, Java Persistence Api, que lo que hizo fue unificar a todos los ORMs en las mismas 
etiquetas. Esta tecnologia es la recomendado y al final es un conjunto de interfaces

4) Spring JPA DATA, la cual nos facilita el acceso a los datos dentro de nuestra app