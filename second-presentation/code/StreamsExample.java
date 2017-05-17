public static void main(String[] args) {
  final int[] result = 
    Arrays.stream(new int[]{10, 87, 97, 43, 121, 20})
    .flatMap(JavaStreams::factorize)
    .distinct()
    .sorted()
    .toArray();
  // ...
}