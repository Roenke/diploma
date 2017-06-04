source.stream()./* ops */
    .filter(predicate)
    .peek(x -> store(x))
    .noneMatch(x -> true);