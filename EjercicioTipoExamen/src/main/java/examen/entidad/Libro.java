package examen.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Libro {
	private String isbn;
	private String editorial;
	
	//El autowire intenta primero inyectar por tipo, es decir,
	//busca un objeto de este tipo para inyectar
	//PERO!!! En caso de que haya varios objetos hara una inyeccion
	//por nombre, es decir, buscara un objeto cuyo id sea el 
	//nombre del atributo, en este caso "autor"
	@Autowired
	@Qualifier("autor1")
	private Autor autor;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + "]";
	}
	
	
}
