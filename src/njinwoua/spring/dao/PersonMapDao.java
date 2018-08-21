package njinwoua.spring.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import njinwoua.spring.model.Person;

@Service
public class PersonMapDao {

	private Map<Long, Person> personsById;

	@PostConstruct
	public void init() {
		personsById = new HashMap<>();
		
		addPerson(new Person(Long.valueOf(1), "Ghislain", "Njinwoua"));
		addPerson(new Person(Long.valueOf(2), "Elsa", "Bermudez"));
		addPerson(new Person(Long.valueOf(3), "Alexandre", "Greco"));
	}
	
	public List<Person> getPersons() {
		return new ArrayList<>(personsById.values());
	}
	
	public Person getPersonById(Long id) {
		return personsById.get(id);
	}

	public void deletePersonById(Long id) {
		personsById.remove(id);
	}

	public void addPerson(Person person) {
		personsById.put(person.getId(), person);
	}

	public void updatePerson(Long id, Person person) {
		person.setId(id);
		
		personsById.put(id, person);
	}
	
}
