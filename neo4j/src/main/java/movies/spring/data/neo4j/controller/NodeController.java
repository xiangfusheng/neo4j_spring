package movies.spring.data.neo4j.controller;

import movies.spring.data.neo4j.domain.Friend;
import movies.spring.data.neo4j.domain.Person;
import movies.spring.data.neo4j.repositories.FriendRepository;
import movies.spring.data.neo4j.repositories.PersonRepository;
import movies.spring.data.neo4j.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NodeController {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PersonService personService;
	@Autowired
	private FriendRepository friendRepository;
	@RequestMapping(value = "addNode", method = RequestMethod.GET)
	public String addNode(){
		return "addNode";
	}
	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit(){
		return "edit";
	}
	@RequestMapping(value = "addRelation", method = RequestMethod.GET)
	public String addRelation(Model model){
		model.addAttribute("list", personRepository.findAll());
		return "addRelation";
	}
	@RequestMapping(value = "addRelation", method = RequestMethod.POST)
	public String addRelationS(Long aID, Long bID){
		Person a = personRepository.findOne(aID);
		Person b = personRepository.findOne(bID);
		Friend f = new Friend(a, b);
		a.addFriendShip(f);
		personRepository.save(a);
		return "redirect:addRelation";
	}
	@RequestMapping(value = "findAllPersonsNode", method = RequestMethod.GET)
	public String findAllNodes(Model model){
		model.addAttribute("list", personRepository.findAll());
		return "personNodesList";
	}
	@RequestMapping(value = "addPersonNode", method = RequestMethod.POST)
	public String addPersonNode(@ModelAttribute("person")Person person, String name){
		System.out.println("name = " + name);
		System.out.println("movies.spring.data.neo4j.controller.NodeController.addPersonNode(Person) = " + person);
		personRepository.save(person);
		return "addNode";
	}
	@RequestMapping(value = "checkRelations", method = RequestMethod.GET)
	public String checkRelations(Model model){
		//System.out.println(friendRepository.findAll());
		model.addAttribute("list", friendRepository.graph());
		return "checkRelations";
	}
}
