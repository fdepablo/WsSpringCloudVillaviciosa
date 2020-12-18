package jpadata;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jpadata.modelo.entidad.Pelicula;
import jpadata.modelo.repositorio.DaoPelicula;

@SpringBootApplication
public class Application {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		//Pelicula p = new Pelicula();
		Pelicula p = context.getBean("pelicula", Pelicula.class);
		p.setTitulo("La guerra de las galaxias");
		p.setDirector("George lucas");
		p.setAnio(1998);
		
		DaoPelicula dao = context.getBean("daoPelicula", DaoPelicula.class);
		dao.save(p);
		
		//p.setTitulo("LA GUERRA DE LAS GALAXIAS");
		//p.setId(1);
		//dao.save(p);
		
		Pelicula p2 = dao.findById(1).get();
		System.out.println(p2);
		
		p2 = dao.findByTitulo("LA GUERRA DE LAS GALAXIas");
		System.out.println("encontrado" + p2);
		
		List<Pelicula> listaPeliculas = dao.findAll();
		System.out.println(listaPeliculas);
		
	}

}
