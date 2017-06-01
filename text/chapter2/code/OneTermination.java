// Во время исполнения произойдет исключение IllegalStateException
public long repeatCount(Stream<?> stream) {
  final long total = stream.count();
  final long distinct = stream.distinct().count();

  return total - distinct;
}