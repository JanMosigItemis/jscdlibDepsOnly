// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1238 {

    static final FunctionDescriptor VarUI2FromR4$FUNC = FunctionDescriptor.of(C_LONG,
        C_FLOAT,
        C_POINTER
    );
    static final MethodHandle VarUI2FromR4$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI2FromR4",
        "(FLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1238.VarUI2FromR4$FUNC, false
    );
    static final FunctionDescriptor VarUI2FromR8$FUNC = FunctionDescriptor.of(C_LONG,
        C_DOUBLE,
        C_POINTER
    );
    static final MethodHandle VarUI2FromR8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI2FromR8",
        "(DLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1238.VarUI2FromR8$FUNC, false
    );
    static final FunctionDescriptor VarUI2FromDate$FUNC = FunctionDescriptor.of(C_LONG,
        C_DOUBLE,
        C_POINTER
    );
    static final MethodHandle VarUI2FromDate$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI2FromDate",
        "(DLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1238.VarUI2FromDate$FUNC, false
    );
    static final FunctionDescriptor VarUI2FromCy$FUNC = FunctionDescriptor.of(C_LONG,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("Lo"),
                C_LONG.withName("Hi")
            ).withName("$anon$0"),
            C_LONG_LONG.withName("int64")
        ).withName("tagCY"),
        C_POINTER
    );
    static final MethodHandle VarUI2FromCy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI2FromCy",
        "(Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1238.VarUI2FromCy$FUNC, false
    );
    static final FunctionDescriptor VarUI2FromStr$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarUI2FromStr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI2FromStr",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1238.VarUI2FromStr$FUNC, false
    );
    static final FunctionDescriptor VarUI2FromDisp$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarUI2FromDisp$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI2FromDisp",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1238.VarUI2FromDisp$FUNC, false
    );
}

