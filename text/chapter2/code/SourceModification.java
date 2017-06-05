// во время исполнения произойдёт java.util.ConcurrentModificationException
List<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3));
ints.stream().filter(x -> x % 2 == 1).forEach(i -> ints.add(i));
System.out.println(ints);