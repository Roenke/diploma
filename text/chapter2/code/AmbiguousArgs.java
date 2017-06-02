    int[] values1 = ...;
    int[] values2 = ...;

=>  Math.max(Arrays.stream(values1).sum(), Arrays.stream(values2).sum());