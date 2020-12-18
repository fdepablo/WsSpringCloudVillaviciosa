package jpadata.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpadata.modelo.entidad.Equipo;

@Repository
public interface DaoEquipo extends JpaRepository<Equipo, Integer>{

}
