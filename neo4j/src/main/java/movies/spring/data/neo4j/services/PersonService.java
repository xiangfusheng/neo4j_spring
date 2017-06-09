package movies.spring.data.neo4j.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import movies.spring.data.neo4j.domain.Person;
import movies.spring.data.neo4j.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired 
	private PersonRepository personRepository;
	public List<Person> findAll(){
		List<Person> res = new ArrayList<>();
		Iterable<Person> allIterable = personRepository.findAll();
		Iterator<Person> it = allIterable.iterator();
		while(it.hasNext()){
			res.add(it.next());
		}
		return res;
	}

	
}
