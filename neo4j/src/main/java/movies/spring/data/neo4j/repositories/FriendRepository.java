package movies.spring.data.neo4j.repositories;

import java.util.Collection;

import movies.spring.data.neo4j.domain.Friend;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author pdtyreus
 * @author Mark Angrish
 */
@Repository
public interface FriendRepository extends PagingAndSortingRepository<Friend, Long> {
	@Query("MATCH (:Person)<-[r:IS_FRIEND]-(:Person) return r")
	Collection<Friend> graph();
}
