List<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3));
Collection<Integer> tmp = ints.stream()
    .filter(x -> x % 2 == 1)
    .collect(Collectors.toList());
ints.addAll(tmp);
System.out.println(ints);