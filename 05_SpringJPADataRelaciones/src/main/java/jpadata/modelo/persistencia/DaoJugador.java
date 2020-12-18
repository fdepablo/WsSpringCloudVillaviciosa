package jpadata.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpadata.modelo.entidad.Jugador;

@Repository
public interface DaoJugador extends JpaRepository<Jugador, Integer>{

}
