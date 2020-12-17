package jpadata.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpadata.modelo.entidad.Pelicula;
//Con esta anotacion estamos dando de alta el objeto que nos permitira hacer
//los accesos, es equivlante a @component
@Repository
public interface DaoPelicula extends JpaRepository<Pelicula, Integer>{
	public Pelicula findByTitulo(String titulo);
}
