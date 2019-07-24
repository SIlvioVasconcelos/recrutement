package model;

public class Person {

  private final String name;


  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {
    return this.getName().equals(((Person)obj).getName());
  }

}
