List<String> streamAPIWithPeeks(List<Person> persons) {
  return persons.stream()
      .peek(x -> System.out.println(x))
      .filter(person -> person.age < 18)
      .peek(x -> System.out.println("after filter: " + x))
      .sorted(Comparator.comparing(x -> x.age))
      .peek(x -> System.out.println("after sort: " + x))
      .map(person -> person.name)
      .peek(x -> System.out.println("after map: " + x))
      .collect(Collectors.toList());
}