public long repeatCount(Stream<?> stream) {
  Collection<?> collection = stream.collect(Collectors.toList());
  return collection.size() - collection.stream().distinct().count();
}