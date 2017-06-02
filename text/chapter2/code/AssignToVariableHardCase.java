Stream<Integer> even = collection.stream();
even = filterEven ? even.filter(x -> x % 2 == 0) : even.filter(x -> x % 2 == 1);
final long size = even.count();