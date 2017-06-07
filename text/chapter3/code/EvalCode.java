final Object trace = new Object[M + 1];

final VarType callVariable11 = ...;

// declarations for calls from 2 to k - 1

final VarType callVariableK1 = ...;
final VarType callVariableK2 = ...;

// declarations for calls from k + 1 to M - 1

final VarType callVariableM1 = ...;
final VarType callVariableM2 = ...;
final VarType callVariableM3 = ...;

Object streamResult = souce.stream().
        .callBefore11(/* args */)
    .callNumber1()
        .callArfter11(/* args */)
    /* calls from 2 to k - 1 */
        .callBeforeK1(/* args */)
        .callBeforeK2(/* args */)
    .callNumberK()
        .callAfterK1(/* args */)
        .callAfterK2(/* args */)
    /* calls from k + 1 to M - 1  */ 
        .callBeforeM1(/* args */)
    .callNumberM()
        .callArfterM1(/* args */)
        .callArfterM2(/* args */)
    .terminal();

trace[0] = prepare0(callVariable11);
/* saving of trace for calls from 2 to K - 1 */
trace[K] = prepareK(callVariableK1, callVariableK2)
/* saving of trace for calls from K + 1 to M - 1 */
trace[M - 1] = prepareM(callVariableM1, callVariableM2, callVariableM3)
trace[M] = streamResult;