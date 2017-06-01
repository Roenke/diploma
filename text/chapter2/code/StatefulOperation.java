List<Integer> ints = Arrays.asList(1, 2, 0, 3, 0/*, ...*/);
int[] zeroCount = new int[1];
final long total = ints.stream().peek(x -> {
  if (x == 0) {
    zeroCount[0]++;
  }
}).count();
System.out.println(zeroCount[0] + " zeros. Total count = " + total);