IntStream.of(1)
    .filter(x ->  {
        return x % 2 == 1; /* Breakpoint at this line */
    })
    .toArray();