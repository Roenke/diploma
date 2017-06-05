List<Integer> ints = Arrays.asList(1, 2, 0, 3, 0/*, ...*/);
long zeroCount = ints.stream().filter(x -> x == 0).count();
System.out.println(zeroCount + " zeros. Total count = " + total);