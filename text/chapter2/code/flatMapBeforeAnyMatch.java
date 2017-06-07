Stream.of(1, 2)
    .flatMap(x -> Stream.of(1,2,3))
    .peek(x -> System.out.print(x))
    .anyMatch(x -> x == 1);