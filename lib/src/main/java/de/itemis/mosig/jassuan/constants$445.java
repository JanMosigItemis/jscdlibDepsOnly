// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$445 {

    static final FunctionDescriptor GetFileBandwidthReservation$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetFileBandwidthReservation$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileBandwidthReservation",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$445.GetFileBandwidthReservation$FUNC, false
    );
    static final FunctionDescriptor SetFileApisToOEM$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle SetFileApisToOEM$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetFileApisToOEM",
        "()V",
        constants$445.SetFileApisToOEM$FUNC, false
    );
    static final FunctionDescriptor SetFileApisToANSI$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle SetFileApisToANSI$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetFileApisToANSI",
        "()V",
        constants$445.SetFileApisToANSI$FUNC, false
    );
    static final FunctionDescriptor AreFileApisANSI$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle AreFileApisANSI$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "AreFileApisANSI",
        "()I",
        constants$445.AreFileApisANSI$FUNC, false
    );
    static final FunctionDescriptor ClearEventLogA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ClearEventLogA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ClearEventLogA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$445.ClearEventLogA$FUNC, false
    );
    static final FunctionDescriptor ClearEventLogW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ClearEventLogW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ClearEventLogW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$445.ClearEventLogW$FUNC, false
    );
}

