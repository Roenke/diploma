int time = 0;

source.stream()
    ...
    .peek(x -> store("before call n", x, time))
    .call(/* ... */)
    .peek(x -> time++)
    .peek(x -> store("after call n", x, time))
    ...
    .terminationCall();