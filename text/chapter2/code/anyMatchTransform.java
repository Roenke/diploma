source.stream()./* ops */
    .filter(predicate)
    .peek(x -> store(x))
    .anyMatch(x -> true);
