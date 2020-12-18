package jpadata.modelo.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope("prototype")
public class Equipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String ciudad;
	
	//Mediante el mappedBy, estamos dicendo cual 
	//va a ser la foreing key de la otra tabla
	@OneToMany(mappedBy = "equipo")
	@Cascade(CascadeType.ALL)
	//Es obligatorio poner un tipo de cascada, es decir,
	//que ocurrira cuando salvemos, modifiquemos o borremos
	//un objeto equipo
	//El ALL CUIDADO! Porque estamos diciendo que se propague
	//bajo todas las circunstancias. Por ejemplo si damos de 
	//alta un equipo con jugadores, tambien los dara de alta
	//pero ojo! si borramos un equipo, tambien borrar los 
	//jugadores
	private List<Jugador> listaJugadores;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", listaJugadores=" + listaJugadores
				+ "]";
	}
	
	
}
