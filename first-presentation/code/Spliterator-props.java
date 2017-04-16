public class StreamPropertiesExample {
  public static void printCollection(Collection<?> collection) {
    final long count = collection.stream()
    .peek(System.out::print).count();
    System.out.println(" (Total = " + count + ")");
  }
  
  public static void main(String[] args) {
    final List<Integer> ints = Arrays.asList(1, 2, 3);
    printCollection(ints);
  }
}
