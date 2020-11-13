package negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Persona;

public class MainSpring {

	//Tendremos que guardar una referencia al contexto
	//de Spring
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Persona p1 = (Persona)context.getBean("persona1");
		
		p1.setNombre("Harry");
		p1.setEdad(19);
		p1.setPeso(58.3);
		
		//p1 = null;
		
		cambiarNombre("Ernion");
		
		//p1 = null;
		
		System.out.println(p1.getNombre());
		
		Persona p2 = new Persona();
		
		p2 = p1;
		System.out.println(p2.getNombre());
		
		p1 = context.getBean("persona2",Persona.class);
		System.out.println(p1);
		p1 = null;
		
		Persona p3 = context.getBean("personaPrototype", Persona.class);
		System.out.println(p3);
		p3.setEdad(45);
		p3.setNombre("Gandalf");
		p3.setPeso(120);
		
		@SuppressWarnings("unchecked")
		List<Persona> lp = context.getBean("listaPersonas", List.class);
		lp.add(p3);		
		
		p3 = context.getBean("persona3",Persona.class);
		System.out.println(p3);
		
		p3 = context.getBean("persona4",Persona.class);
		System.out.println(p3);
	}
	
	public static void cambiarNombre(String nombre) {
		Persona p1 = (Persona)context.getBean("persona1");
		p1.setNombre(nombre);
	}

}
