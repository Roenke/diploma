final Stream<Integer> sequenceStream = collection.stream();
final Stream<Integer> parallelStream1 = collection.parallelStream();
final Stream<Integer> parallelStream2 = sequenceStream.parallel();