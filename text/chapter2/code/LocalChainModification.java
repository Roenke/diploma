int[] time = new int[]{0};

source.stream()
    ...
    .peek(x -> store("before call n", x, time))
    .call(/* ... */)
    .peek(x -> time[0]++)
    .peek(x -> store("after call n", x, time))
    ...
    .terminationCall();