// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1241 {

    static final FunctionDescriptor VarUI4FromCy$FUNC = FunctionDescriptor.of(C_LONG,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("Lo"),
                C_LONG.withName("Hi")
            ).withName("$anon$0"),
            C_LONG_LONG.withName("int64")
        ).withName("tagCY"),
        C_POINTER
    );
    static final MethodHandle VarUI4FromCy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI4FromCy",
        "(Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1241.VarUI4FromCy$FUNC, false
    );
    static final FunctionDescriptor VarUI4FromStr$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarUI4FromStr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI4FromStr",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1241.VarUI4FromStr$FUNC, false
    );
    static final FunctionDescriptor VarUI4FromDisp$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarUI4FromDisp$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI4FromDisp",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1241.VarUI4FromDisp$FUNC, false
    );
    static final FunctionDescriptor VarUI4FromBool$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarUI4FromBool$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI4FromBool",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1241.VarUI4FromBool$FUNC, false
    );
    static final FunctionDescriptor VarUI4FromI1$FUNC = FunctionDescriptor.of(C_LONG,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle VarUI4FromI1$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI4FromI1",
        "(BLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1241.VarUI4FromI1$FUNC, false
    );
    static final FunctionDescriptor VarUI4FromUI2$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarUI4FromUI2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI4FromUI2",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1241.VarUI4FromUI2$FUNC, false
    );
}

