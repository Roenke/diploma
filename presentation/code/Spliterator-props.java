public class StreamPropertiesExample {
  public static void printCollection(Collection<?> collection) {
    collection.stream().peek(System.out::print).count();
  }
  
  public static void main(String[] args) {
    List<Integer> ints = Arrays.asList(1, 2, 3);
    printCollection(ints);
  }
}
