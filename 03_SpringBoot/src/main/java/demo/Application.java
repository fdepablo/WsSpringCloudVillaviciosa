package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Persona;

//Esta clase de aqui va a ser nuestro punto de entrada de la
//aplicacion

//Esta anotacionde aqui, carga todo el contexto
//de spring y autoconfigura la aplicacion para funcionar

//Ejemplo, va a arrancar automaticamente nuestro contexto de spring
//Tambien va a buscar dentro de este paqueten anotanciones spring
//para darlas de alta

//mas, si tu le has dicho en el starte que quieres
//usar una base de datos, si no configuras una base de datos
//Esta anotacion te levanta una base de datos en memoria 
//perfectamente operativa

@SpringBootApplication
public class Application {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Persona p = context.getBean("persona", Persona.class);
		p.setNombre("Harry Potter");
		System.out.println(p);
		
		Persona p2 = context.getBean("persona", Persona.class);
		System.out.println(p2);
	}

}
