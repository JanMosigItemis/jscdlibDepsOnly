// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$701 {

    static final FunctionDescriptor GetConsoleAliasesA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetConsoleAliasesA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetConsoleAliasesA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$701.GetConsoleAliasesA$FUNC, false
    );
    static final FunctionDescriptor GetConsoleAliasesW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetConsoleAliasesW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetConsoleAliasesW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$701.GetConsoleAliasesW$FUNC, false
    );
    static final FunctionDescriptor GetConsoleAliasExesA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetConsoleAliasExesA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetConsoleAliasExesA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$701.GetConsoleAliasExesA$FUNC, false
    );
    static final FunctionDescriptor GetConsoleAliasExesW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetConsoleAliasExesW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetConsoleAliasExesW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$701.GetConsoleAliasExesW$FUNC, false
    );
    static final FunctionDescriptor ExpungeConsoleCommandHistoryA$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle ExpungeConsoleCommandHistoryA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ExpungeConsoleCommandHistoryA",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$701.ExpungeConsoleCommandHistoryA$FUNC, false
    );
    static final FunctionDescriptor ExpungeConsoleCommandHistoryW$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle ExpungeConsoleCommandHistoryW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ExpungeConsoleCommandHistoryW",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$701.ExpungeConsoleCommandHistoryW$FUNC, false
    );
}

