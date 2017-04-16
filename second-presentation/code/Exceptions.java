public static int maxDiffNeighbors(int[] ints) {
  return IntStream
      .iterate(0, i -> i + 1)
      .map(i -> ints[i + 1] - ints[i])
      .map(Math::abs)
      .max()
      .orElse(0);
}