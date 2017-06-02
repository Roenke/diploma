    long count = LongStream.of(1, 2, 3).map(x -> {
=>      return x * 2;
    }).count();