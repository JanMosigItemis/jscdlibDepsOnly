// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$952 {

    static final FunctionDescriptor NdrInterfacePointerFree$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrInterfacePointerFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrInterfacePointerFree",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$952.NdrInterfacePointerFree$FUNC, false
    );
    static final FunctionDescriptor NdrConvert2$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle NdrConvert2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrConvert2",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$952.NdrConvert2$FUNC, false
    );
    static final FunctionDescriptor NdrConvert$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrConvert$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrConvert",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$952.NdrConvert$FUNC, false
    );
    static final FunctionDescriptor NdrUserMarshalSimpleTypeConvert$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_CHAR
    );
    static final MethodHandle NdrUserMarshalSimpleTypeConvert$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrUserMarshalSimpleTypeConvert",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;B)Ljdk/incubator/foreign/MemoryAddress;",
        constants$952.NdrUserMarshalSimpleTypeConvert$FUNC, false
    );
    static final FunctionDescriptor NdrClientInitializeNew$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle NdrClientInitializeNew$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrClientInitializeNew",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$952.NdrClientInitializeNew$FUNC, false
    );
    static final FunctionDescriptor NdrServerInitializeNew$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrServerInitializeNew$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrServerInitializeNew",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$952.NdrServerInitializeNew$FUNC, false
    );
}

