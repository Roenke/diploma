final Stream<Integer> even = collection.stream().filter(x -> x % 2 == 0);
final long size = even.count();