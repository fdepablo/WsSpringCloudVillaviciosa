package jpadata.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpadata.modelo.entidad.Pelicula;
//Con esta anotacion estamos dando de alta el objeto que nos permitira hacer
//los accesos, es equivlante a @component
//Esto seria Spring JPA Data

//Pelicula seria la entidad a mapear
//Integer sería el tipo del id de la clase
@Repository
public interface DaoPelicula extends JpaRepository<Pelicula, Integer>{
	public Pelicula findByTitulo(String titulo);
}
