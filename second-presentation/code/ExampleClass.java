public class Person {
  public final int id, age;
  public final String name;
  public final List<Person> friends;
  public Person(int id, String name, int age, 
                List<Person> friends) {
    this.id = id; this.name = name;
    this.age = age; this.friends = friends;
  }

  @Override
  public String toString() {
    return String.format("%d - %s [%d]", id, name, age);
  }
}