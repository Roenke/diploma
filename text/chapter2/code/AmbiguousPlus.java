=>  long total = IntStream.iterate(1, i -> i + 1).limit(100).sum() +
        IntStream.iterate(1, i -> i + 1).map(i -> i * i).limit(100).sum();