// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1021 {

    static final MemoryLayout IID_IEnumFORMATETC$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumFORMATETC$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IEnumFORMATETC", constants$1021.IID_IEnumFORMATETC$LAYOUT);
    static final FunctionDescriptor IEnumFORMATETC_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumFORMATETC_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumFORMATETC_RemoteNext_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1021.IEnumFORMATETC_RemoteNext_Proxy$FUNC, false
    );
    static final FunctionDescriptor IEnumFORMATETC_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumFORMATETC_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumFORMATETC_RemoteNext_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1021.IEnumFORMATETC_RemoteNext_Stub$FUNC, false
    );
    static final FunctionDescriptor IEnumFORMATETC_Next_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumFORMATETC_Next_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumFORMATETC_Next_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1021.IEnumFORMATETC_Next_Proxy$FUNC, false
    );
    static final FunctionDescriptor IEnumFORMATETC_Next_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumFORMATETC_Next_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumFORMATETC_Next_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1021.IEnumFORMATETC_Next_Stub$FUNC, false
    );
    static final MemoryLayout IID_IEnumSTATDATA$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumSTATDATA$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IEnumSTATDATA", constants$1021.IID_IEnumSTATDATA$LAYOUT);
}

