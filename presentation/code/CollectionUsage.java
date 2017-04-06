// Решение, использующее интерфейс коллекций
public List<String> collectionAPI(List<Person> persons) {
  persons = new ArrayList<>(persons);
  persons.removeIf(person -> person.age >= 18);
  persons.sort((p1, p2) -> Integer.compare(p1.age, p2.age));

  final ArrayList<String> names = new ArrayList<>();
  for (final Person person : persons) {
    names.add(person.name);
  }

  return names;
}