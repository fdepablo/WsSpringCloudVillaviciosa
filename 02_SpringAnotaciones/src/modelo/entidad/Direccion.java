package modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Las anotaciones son etiqutas que empiezan por "@" y nos ayudan a
 * dar funcionalidad  a las clases en JAVA y se ejecutan en tiempo de 
 * ejecucion o de compilacion depende de la etiqueta.
 * 
 * Las etiquetas son SUPER UTILIZADAS EN JAVA SERIO Y PROFESIONAL
 * 
 * En nuestro caso las etiquetas las vamos a usar para dar de alta
 * objetos en el contexto de spring y tambien para hacer inyeccion
 * de dependencias.
 * 
 * Para dar de alta los objetos por anotaciones podemos
 * escoger 4 anotaciones, que realmente heredan 3 de la
 * misma
 * 
 * @Component
 * Con esta anotacion decimos a Spring que queremos crear un bean
 * a partir de esta clase, es la mas estandar
 * 
 * A raiz de esta, heredan otras 3, que son puramente semanticas
 * @Controller
 * @Service
 * @Repository
 */

@Component(value = "direccionBean")//Si quieres cambiar el id del bien lo haces con "value"
//esta anotacion seria equivalente a hacer lo siguiente en xml
//<bean id="direccionBean" class="modelo.entidad.Direccion" scope="singleton"/>
//por defecto el id es elnombre de la clase en LowerCamelCase
//Si le quieres cambiar el scope, puedes usar la siguiente anotacion
@Scope("prototype")
public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String ciudad;
		
	public Direccion() {
		super();
		//si quereis cambiar alguna "value" de una propiedad, podeis hacerlo así
		ciudad = "barcelona";		
	}
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", ciudad=" + ciudad + "]";
	}
	
}