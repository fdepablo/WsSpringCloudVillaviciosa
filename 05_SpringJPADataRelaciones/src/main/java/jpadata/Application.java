package jpadata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jpadata.modelo.entidad.Equipo;
import jpadata.modelo.entidad.Jugador;
import jpadata.modelo.persistencia.DaoEquipo;
import jpadata.modelo.persistencia.DaoJugador;

@SpringBootApplication
public class Application {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Jugador j1 = context.getBean("jugador", Jugador.class);
		j1.setNombre("Cristiano Ronaldo");
		j1.setDorsal(10);
		
		Jugador j2 = context.getBean("jugador", Jugador.class);
		j2.setNombre("Lionel Messi");
		j2.setDorsal(7);
		
		Equipo e1 = context.getBean("equipo", Equipo.class);
		e1.setNombre("Maravillas");
		e1.setCiudad("Springfield");
		
		List<Jugador> listaJugadores = new ArrayList<Jugador>();
		listaJugadores.add(j1);
		listaJugadores.add(j2);
		
		e1.setListaJugadores(listaJugadores);	
		//para que jpa sepa de que equipo es un jugador
		//tenemos que cruzar las referncias
		j1.setEquipo(e1);
		j2.setEquipo(e1);
		
		DaoEquipo daoEquipo = context.getBean("daoEquipo", DaoEquipo.class);
		daoEquipo.save(e1);
		
		DaoJugador daoJugador = context.getBean("daoJugador", DaoJugador.class);
		Jugador j3 = daoJugador.findById(1).get();
		System.out.println(j3);
	}

}
