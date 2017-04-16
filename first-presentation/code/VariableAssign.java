// Такой код допускается
public static long getSumOfCubes(int n) {
  Stream<Integer> ints = Stream.iterate(1, i -> i + 1);
  IntStream primitiveInts = ints.mapToInt(Integer::valueOf);
  IntStream even = primitiveInts.filter(x -> x % 2 == 0);
  LongStream evenCubes = even.mapToLong(x -> x * x * x);

  final long sumOfEvenCubes = evenCubes.limit(n).sum();
  return sumOfEvenCubes;
}