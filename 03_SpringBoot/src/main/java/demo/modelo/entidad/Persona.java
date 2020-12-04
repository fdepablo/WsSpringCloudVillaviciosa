package demo.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//Para que Spring lea estas anotaciones, es muy muy
//muy muy muy muy muy importante que las clases
//anotadas esten dentro de la jerarquia del paquete
//donde se encuenta la clase Application.java
//Ej: en esta app, la clase Application.java se encuentra
//en el paquete "demo", por lo tanto todos nuestros beans
//deben de estar en un paquete que empiece por "demo"
@Component
@Scope("prototype")
public class Persona {
	private String nombre;
	private int edad;
		
	public Persona() {
		super();
		this.edad = 18;
	}
	
	
	@Autowired
	private Direccion direccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
	
}
