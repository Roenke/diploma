List<String> streamAPIExample(List<Person> persons) {
  return persons.stream()
      .filter(person -> person.age < 18)
      .sorted(Comparator.comparing(x -> x.age))
      .map(person -> person.name)
      .collect(Collectors.toList());
}