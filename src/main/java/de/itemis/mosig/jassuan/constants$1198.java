// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1198 {

    static final FunctionDescriptor IEnumSTATPROPSTG_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumSTATPROPSTG_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumSTATPROPSTG_RemoteNext_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1198.IEnumSTATPROPSTG_RemoteNext_Stub$FUNC, false
    );
    static final FunctionDescriptor IEnumSTATPROPSTG_Next_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumSTATPROPSTG_Next_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumSTATPROPSTG_Next_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1198.IEnumSTATPROPSTG_Next_Proxy$FUNC, false
    );
    static final FunctionDescriptor IEnumSTATPROPSTG_Next_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumSTATPROPSTG_Next_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumSTATPROPSTG_Next_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1198.IEnumSTATPROPSTG_Next_Stub$FUNC, false
    );
    static final MemoryLayout IID_IEnumSTATPROPSETSTG$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumSTATPROPSETSTG$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IEnumSTATPROPSETSTG", constants$1198.IID_IEnumSTATPROPSETSTG$LAYOUT);
    static final FunctionDescriptor IEnumSTATPROPSETSTG_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumSTATPROPSETSTG_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumSTATPROPSETSTG_RemoteNext_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1198.IEnumSTATPROPSETSTG_RemoteNext_Proxy$FUNC, false
    );
    static final FunctionDescriptor IEnumSTATPROPSETSTG_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumSTATPROPSETSTG_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumSTATPROPSETSTG_RemoteNext_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1198.IEnumSTATPROPSETSTG_RemoteNext_Stub$FUNC, false
    );
}

