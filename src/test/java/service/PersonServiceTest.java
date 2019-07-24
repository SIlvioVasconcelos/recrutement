package service;

import model.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PersonServiceTest {

  @Test
  public void should_return_list_of_names(){
    PersonService personService = new PersonService();
    personService.addPerson(new Person("Silvio"));
    personService.addPerson(new Person("Pierre"));
    personService.addPerson(new Person("Amelie"));
    Assert.assertEquals(Arrays.asList("Silvio","Pierre","Amelie"),personService.getNames());
  }

  @Test
  public void should_return_ordered_person_by_name() {
    PersonService personService = new PersonService();
    personService.addPerson(new Person("Silvio"));
    personService.addPerson(new Person("Pierre"));
    personService.addPerson(new Person("Amelie"));
    final List<Person> persons = personService.getOrderedPersons();
    Assert.assertEquals(persons.get(0).getName(), "Amelie");
    Assert.assertEquals(persons.get(1).getName(), "Pierre");
    Assert.assertEquals(persons.get(2).getName(), "Silvio");
  }

  @Test
  public void should_add_non_existing_person_from_list() {
    PersonService personService = new PersonService();
    personService.addPerson(new Person("Silvio"));
    personService.addPerson(new Person("Pierre"));
    personService.addPerson(new Person("Amelie"));
    final List<Person> peopleToAdd = Arrays.asList(new Person("Remi"), new Person("Anas"),
        new Person("Marvin"), new Person("Amelie"));
    personService.addListOfPerson(peopleToAdd);
    Assert.assertEquals(personService.getOrderedPersons().size(), 6);
  }

  @Test
  public void should_create_person_from_list_string(){
    PersonService personService = new PersonService();
    String names = "Silvio_Pierre_Amelie";
    final List<Person> personFromString = personService.createPersonFromString(names);
    Assert.assertEquals(personFromString.size(),3);
  }
}
