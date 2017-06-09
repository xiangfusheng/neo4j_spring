package movies.spring.data.neo4j.controller;

import java.util.Map;

import movies.spring.data.neo4j.repositories.MovieRepository;
import movies.spring.data.neo4j.repositories.PersonRepository;
import movies.spring.data.neo4j.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Mark Angrish
 */
@Controller
public class MovieController {

	final MovieService movieService;
	@Autowired
	private MovieRepository instance;

	@Autowired
	private PersonRepository personRepository;
	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	@RequestMapping("/content")
	public String addNode(Model model){
		model.addAttribute("name", "肖小鸡");
		return "content";
	}
	@RequestMapping("/graph")
	public Map<String, Object> graph(@RequestParam(value = "limit",required = false) Integer limit) {
//		Movie matrix = new Movie("The Matrix", 1999);
//
//		instance.save(matrix);
//
//		Person keanu = new Person("Keanu Reeves");
//
//		personRepository.save(keanu);
//
//		Role neo = new Role(matrix, keanu);
//		neo.addRoleName("Neo");
//
//		matrix.addRole(neo);
//
//		instance.save(matrix);
		System.out.println(instance.graph(5));
		return movieService.graph(limit == null ? 100 : limit);
	}
}
