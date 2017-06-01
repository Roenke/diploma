// во время исполнения произойдёт java.util.ConcurrentModificationException
List<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3));
final long res = ints.stream().peek(i -> ints.add(i)).count();
System.out.println(res);