// Во время исполнения произойдет исключение
public long repeatCount(Stream<?> stream) {
  final long distint = stream.distinct().count();
  final long total = stream.count();

  return total - distint;
}