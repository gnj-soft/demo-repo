package njinwoua.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import njinwoua.spring.model.Person;

public interface PersonDao extends JpaRepository<Person, Long> {

	Person getPersonByLastName(String name);
	
}
