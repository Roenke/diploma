public List<String> cycles(List<Person> persons) {
  persons = new ArrayList<>(persons);
  final Iterator<Person> iterator = persons.iterator();
  while (iterator.hasNext()) {
    final Person person = iterator.next();
    if (person.age >= 18) 
      iterator.remove();
  }

  persons.sort((p1, p2) -> Integer.compare(p1.age, p2.age));

  final ArrayList<String> names = new ArrayList<>();
  for (final Person person : persons) {
    names.add(person.name);
  }

  return names;
}