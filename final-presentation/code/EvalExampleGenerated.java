public static class Generated {
    Object eval(Object... context) {
      // declare time, before, after
      final int result = IntStream.of(1, 2)
            .peek(x -> time[0]++)
            .peek(x -> before.put(time[0], x))
          .filter(x -> x % 2 == 0)
            .peek(x -> time[0]++)
            .peek(x -> after.put(time[0], x))
          .sum();
      // return new { new { result } , before, after };
    }
  }