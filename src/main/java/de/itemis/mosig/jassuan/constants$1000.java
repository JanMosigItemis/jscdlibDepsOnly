// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1000 {

    static final FunctionDescriptor CoGetPSClsid$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoGetPSClsid$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoGetPSClsid",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1000.CoGetPSClsid$FUNC, false
    );
    static final FunctionDescriptor CoRegisterPSClsid$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoRegisterPSClsid$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRegisterPSClsid",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1000.CoRegisterPSClsid$FUNC, false
    );
    static final FunctionDescriptor CoRegisterSurrogate$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle CoRegisterSurrogate$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRegisterSurrogate",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1000.CoRegisterSurrogate$FUNC, false
    );
    static final FunctionDescriptor CoMarshalHresult$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CoMarshalHresult$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoMarshalHresult",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1000.CoMarshalHresult$FUNC, false
    );
    static final FunctionDescriptor CoUnmarshalHresult$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoUnmarshalHresult$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoUnmarshalHresult",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1000.CoUnmarshalHresult$FUNC, false
    );
    static final FunctionDescriptor CoLockObjectExternal$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle CoLockObjectExternal$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoLockObjectExternal",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$1000.CoLockObjectExternal$FUNC, false
    );
}

