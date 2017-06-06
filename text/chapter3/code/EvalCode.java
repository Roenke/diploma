final Object trace = new Object[callCount + 1];

final VarType callVariableK1 = ...;
final VarType callVariableK2 = ...;

Object streamResult = souce.stream()./* calls */.
        .callBeforeK1(/* arg */)
        .callBeforeK2(/* arg */)
    .callNumberK()
        .callAfterK1(/* arg */)
        .callAfterK2(/* arg */)
    ./* calls */.terminal();

trace[0] = prepare0(callVariable01);
/ *... */
trace[K] = prepareK(callVariableK1, callVariableK2)
/* ... */
trace[callCount - 1] = prepareM(callVariableM1, callVariableM2, callVariableM3)
trace[callCount] = streamResult;