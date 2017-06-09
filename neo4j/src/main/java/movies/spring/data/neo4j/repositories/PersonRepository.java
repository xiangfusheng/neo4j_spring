package movies.spring.data.neo4j.repositories;

import java.util.Collection;

import movies.spring.data.neo4j.domain.Person;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author pdtyreus
 * @author Mark Angrish
 */
@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
	@Query("MATCH (p:Person) RETURN p")
	Collection<Person> queryAllPersons();
//	@Query("MATCH (p:Person) WHERE ID(p) = {id} RETURN p")
//	Person queryPersonById(Long id);
	@Query("MATCH (pa:Person)<-[r:IS_FRIEND]-(p:Person) return p,r")
	Collection graph(@Param("name")String name);
}
