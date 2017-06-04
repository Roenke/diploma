source.stream()./* ops */
    .filter(x -> !predicate.test(x))
    .peek(x -> store(x))
    .allMatch(x -> false);