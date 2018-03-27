package movies.spring.data.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xiangfusheng
>>>>>>> 1aedd9a03533d53bd032bffdbec66149d98c94f6
 */
@SpringBootApplication
@EntityScan("movies.spring.data.neo4j.domain")
//@ComponentScan({"movies.spring.data.boot.MvcConfiguration", "movies.spring.data.neo4j.controller.MovieController"})
//@ComponentScan("movies.spring.data.neo4j.controller.MovieController")
public class SampleMovieApplication{

	public static void main(String[] args) {
		SpringApplication.run(SampleMovieApplication.class, args);
	}
}
