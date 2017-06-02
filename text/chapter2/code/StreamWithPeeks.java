persons.stream()
  .peek(x -> /* action */)
  .filter(person -> person.age < 18)
  .peek(x -> /* action */)
  .sorted(Comparator.comparing(x -> x.age))
  .peek(x -> /* action */)
  .map(person -> person.name)
  .peek(x -> /* action */)
  .collect(Collectors.toList());
