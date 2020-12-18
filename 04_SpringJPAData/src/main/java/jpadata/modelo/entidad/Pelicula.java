package jpadata.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Estamos diciendo que se tiene que crear una
//tabla pelicul, con unos campos que son los atributos
//y que los objetos seran las filas
//Esto seria JPA
//Para más informacion consulte
//https://github.com/fdepablo/WorkspaceJava/tree/master/32_JPA
@Entity
//Podemos seguir usando todas las anotaciones que queramos
@Component
@Scope("prototype")
public class Pelicula {
	//con esta anotacion decimos que el id sera pk
	@Id
	//le decimos que el valor sea autogenerado
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String director;
	private int anio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", anio=" + anio + "]";
	}
	
	
}
