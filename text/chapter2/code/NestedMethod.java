  private static int method(int x) {
  =>  return x * x;
  }

  private static void nestedExample() {
  **  IntStream.of(1, 2).map(JavaStreams::method).toArray();
  }