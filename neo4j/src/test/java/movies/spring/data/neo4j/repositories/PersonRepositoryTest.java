package movies.spring.data.neo4j.repositories;

import static org.junit.Assert.*;

import java.util.Collection;

import movies.spring.data.neo4j.domain.Movie;
import movies.spring.data.neo4j.domain.Person;
import movies.spring.data.neo4j.domain.Role;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author pdtyreus
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
public class PersonRepositoryTest {

	@Autowired
	private Session session;

	@Autowired
	private MovieRepository instance;

	@Autowired
	private PersonRepository personRepository;

	public PersonRepositoryTest() {
	}

	
	/**
	 * Test of graph method, of class MovieRepository.
	 */
	@Test
	public void testGraph() {
		//System.out.println("结果 = " + personRepository.graph());
		
	}
}
