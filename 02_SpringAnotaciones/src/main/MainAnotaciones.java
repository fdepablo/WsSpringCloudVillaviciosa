package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class MainAnotaciones {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Persona p = context.getBean("persona", Persona.class);
		System.out.println(p);
	}
}
