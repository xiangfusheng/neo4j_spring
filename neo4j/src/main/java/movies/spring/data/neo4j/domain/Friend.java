package movies.spring.data.neo4j.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "IS_FRIEND")
public class Friend {
	@GraphId
	private Long id;
	@StartNode
	private Person friendA;
	@EndNode
	private Person friendB;
	public Friend() {
	}
	public Friend(Person friendA, Person friendB) {
		super();
		this.friendA = friendA;
		this.friendB = friendB;
	}
	public Long getId() {
		return id;
	}
	public Person getFriendA() {
		return friendA;
	}
	public Person getFriendB() {
		return friendB;
	}
	@Override
	public String toString() {
		return "Friend [id=" + id + ", friendA=" + friendA.getName() + ", friendB="
				+ friendB.getName() + "]";
	}
	
}
