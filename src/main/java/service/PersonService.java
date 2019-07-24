package service;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

  private final List<Person> persons;

  public PersonService() {
    persons = new ArrayList<>();
  }

  public void addPerson(Person person) {
    persons.add(person);
  }

  public List<String> getNames() {
  }

  public List<Person> getOrderedPersons() {
  }

  public void addListOfPerson(List<Person> peopleToAdd) {
  }

  public List<Person> createPersonFromString(String names) {
  }

  public void setToGroupe(String name, String groupe){
  }
}
