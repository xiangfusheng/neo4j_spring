package movies.spring.data.neo4j.domain;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * @author Mark Angrish
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
public class Person {

	@GraphId
	private Long id;

	private String name;

	private int born;

	@Relationship(type = "ACTED_IN")
	private List<Movie> movies = new ArrayList<>();
	
//	@Relationship(type = "IS_FRIEND")
//	private List<Person> friends = new ArrayList<>();
	
	@Relationship(type = "IS_FRIEND", direction = Relationship.INCOMING)
	private List<Friend> friendShip = new ArrayList<>();
	
	public Person() {
	}

	public Person(String name) {

		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBorn() {
		return born;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBorn(int born) {
		this.born = born;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

//	public List<Person> getFriends() {
//		return friends;
//	}
//
//	public void setFriends(List<Person> friends) {
//		this.friends = friends;
//	}

	public List<Friend> getFriendShip() {
		return friendShip;
	}

	public void setFriendShip(List<Friend> friendShip) {
		this.friendShip = friendShip;
	}
	public void addFriendShip(Friend f){
		this.friendShip.add(f);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", born=" + born
				+ ", movies=" + movies + ", friendShip=" + friendShip + "]";
	}
	
}
