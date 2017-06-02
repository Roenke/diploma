public static Collection<Object> example(Collection<Object> collection) {
=>  int skipBefore = 1;
	int limitValue = 10;

	final List<Object> transformed = collection.stream()
	    .map(x -> doSomeStuff(x))
        .skip(skipBefore)
        .limit(limitValue)
	    .collect(Collectors.toList());

	collection.addAll(transformed);
	return collection;
}