package modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//<bean id="persona" class="modelo.entidad.Persona" scope="singleton"></bean>
//por defecto el id que coge el mismo nombre de la clase persona en lower camel case
@Scope("prototype")
//<bean id="persona" class="modelo.entidad.Persona" scope="prototype"></bean>
public class Persona{
	//No se ponen values, si quieres poner "values" los escribes directamente aqui :) :)
	//o en el constructor
	private String nombre = "Dijimon";
	private int edad;
	private double peso;
	@Autowired//inyectame automaticamente un bean de tipo direccion a esta propiedad
	//Si hubiera varios objetos de tipo direccion, podemos hacer una inyeccion "byName"
	//con la antocion siguiente, ambas anotaciones son necesarios
	@Qualifier("direccionBean")
	private Direccion direccion;
	
	@Autowired
	private Salario salario;
	
	public Persona() {
		super();
	}
	public Persona(String nombre, int edad, double peso, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.direccion = direccion;
	}
	
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public Salario getSalario() {
		return salario;
	}
	public void setSalario(Salario salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", direccion=" + direccion
				+ ", salario=" + salario + "]";
	}

	
	
}