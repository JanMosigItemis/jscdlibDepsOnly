// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1225 {

    static final FunctionDescriptor VarDateFromI2$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarDateFromI2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromI2",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1225.VarDateFromI2$FUNC, false
    );
    static final FunctionDescriptor VarDateFromI4$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarDateFromI4$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromI4",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1225.VarDateFromI4$FUNC, false
    );
    static final FunctionDescriptor VarDateFromI8$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle VarDateFromI8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromI8",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1225.VarDateFromI8$FUNC, false
    );
    static final FunctionDescriptor VarDateFromR4$FUNC = FunctionDescriptor.of(C_LONG,
        C_FLOAT,
        C_POINTER
    );
    static final MethodHandle VarDateFromR4$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromR4",
        "(FLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1225.VarDateFromR4$FUNC, false
    );
    static final FunctionDescriptor VarDateFromR8$FUNC = FunctionDescriptor.of(C_LONG,
        C_DOUBLE,
        C_POINTER
    );
    static final MethodHandle VarDateFromR8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromR8",
        "(DLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1225.VarDateFromR8$FUNC, false
    );
    static final FunctionDescriptor VarDateFromCy$FUNC = FunctionDescriptor.of(C_LONG,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("Lo"),
                C_LONG.withName("Hi")
            ).withName("$anon$0"),
            C_LONG_LONG.withName("int64")
        ).withName("tagCY"),
        C_POINTER
    );
    static final MethodHandle VarDateFromCy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromCy",
        "(Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1225.VarDateFromCy$FUNC, false
    );
}

