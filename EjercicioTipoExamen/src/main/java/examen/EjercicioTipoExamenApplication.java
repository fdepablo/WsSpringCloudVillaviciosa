package examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import examen.entidad.Autor;
import examen.entidad.Email;
import examen.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:objetosSpring.xml")
public class EjercicioTipoExamenApplication {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = SpringApplication.run(EjercicioTipoExamenApplication.class, args);
	
		Email email = context.getBean("email", Email.class);
		
		//como el email con id "email" es prototipado, cada vez
		//que lo solicite me dara una instancia nueva
		Email otroEmailDistinto = context.getBean("email", Email.class);
	
		Email email1 = context.getBean("email1", Email.class);
		System.out.println(email1.getId());
		email1.setId(67);
		
		//Al ser email1 de tipo singletono sera siempre la misma
		//instancia
		Email elMismoMalditoEmailQueAntes = 
				context.getBean("email1", Email.class);
		System.out.println(elMismoMalditoEmailQueAntes.getId());
		
		//esta instancia sera nueva cada vez
		Libro libro = context.getBean("libro", Libro.class);
		//equivalente en java normal
		Libro otroLibro = new Libro();
		Autor otroAutor = new Autor();
		otroLibro.setAutor(otroAutor);
		
		System.out.println(libro);
	}
	
	

}
