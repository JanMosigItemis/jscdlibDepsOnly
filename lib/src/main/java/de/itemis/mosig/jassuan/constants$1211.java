// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1211 {

    static final FunctionDescriptor VarUI1FromBool$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarUI1FromBool$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI1FromBool",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1211.VarUI1FromBool$FUNC, false
    );
    static final FunctionDescriptor VarUI1FromI1$FUNC = FunctionDescriptor.of(C_LONG,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle VarUI1FromI1$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI1FromI1",
        "(BLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1211.VarUI1FromI1$FUNC, false
    );
    static final FunctionDescriptor VarUI1FromUI2$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarUI1FromUI2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI1FromUI2",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1211.VarUI1FromUI2$FUNC, false
    );
    static final FunctionDescriptor VarUI1FromUI4$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarUI1FromUI4$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI1FromUI4",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1211.VarUI1FromUI4$FUNC, false
    );
    static final FunctionDescriptor VarUI1FromUI8$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle VarUI1FromUI8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI1FromUI8",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1211.VarUI1FromUI8$FUNC, false
    );
    static final FunctionDescriptor VarUI1FromDec$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle VarUI1FromDec$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarUI1FromDec",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1211.VarUI1FromDec$FUNC, false
    );
}

