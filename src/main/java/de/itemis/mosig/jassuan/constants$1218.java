// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1218 {

    static final FunctionDescriptor VarI8FromCy$FUNC = FunctionDescriptor.of(C_LONG,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("Lo"),
                C_LONG.withName("Hi")
            ).withName("$anon$0"),
            C_LONG_LONG.withName("int64")
        ).withName("tagCY"),
        C_POINTER
    );
    static final MethodHandle VarI8FromCy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarI8FromCy",
        "(Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1218.VarI8FromCy$FUNC, false
    );
    static final FunctionDescriptor VarI8FromDate$FUNC = FunctionDescriptor.of(C_LONG,
        C_DOUBLE,
        C_POINTER
    );
    static final MethodHandle VarI8FromDate$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarI8FromDate",
        "(DLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1218.VarI8FromDate$FUNC, false
    );
    static final FunctionDescriptor VarI8FromStr$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarI8FromStr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarI8FromStr",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1218.VarI8FromStr$FUNC, false
    );
    static final FunctionDescriptor VarI8FromDisp$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarI8FromDisp$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarI8FromDisp",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1218.VarI8FromDisp$FUNC, false
    );
    static final FunctionDescriptor VarI8FromBool$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarI8FromBool$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarI8FromBool",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1218.VarI8FromBool$FUNC, false
    );
    static final FunctionDescriptor VarI8FromI1$FUNC = FunctionDescriptor.of(C_LONG,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle VarI8FromI1$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarI8FromI1",
        "(BLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1218.VarI8FromI1$FUNC, false
    );
}

