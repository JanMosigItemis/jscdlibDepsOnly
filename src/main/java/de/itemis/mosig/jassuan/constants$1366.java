// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1366 {

    static final MemoryLayout in6addr_any$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("Byte"),
            MemoryLayout.sequenceLayout(8, C_SHORT).withName("Word")
        ).withName("u")
    ).withName("in6_addr");
    static final MemorySegment in6addr_any$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "in6addr_any", constants$1366.in6addr_any$LAYOUT);
    static final MemoryLayout in6addr_loopback$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("Byte"),
            MemoryLayout.sequenceLayout(8, C_SHORT).withName("Word")
        ).withName("u")
    ).withName("in6_addr");
    static final MemorySegment in6addr_loopback$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "in6addr_loopback", constants$1366.in6addr_loopback$LAYOUT);
    static final FunctionDescriptor IN6_IS_ADDR_UNSPECIFIED$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle IN6_IS_ADDR_UNSPECIFIED$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IN6_IS_ADDR_UNSPECIFIED",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1366.IN6_IS_ADDR_UNSPECIFIED$FUNC, false
    );
    static final FunctionDescriptor IN6_IS_ADDR_LOOPBACK$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle IN6_IS_ADDR_LOOPBACK$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IN6_IS_ADDR_LOOPBACK",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1366.IN6_IS_ADDR_LOOPBACK$FUNC, false
    );
    static final FunctionDescriptor IN6_IS_ADDR_MULTICAST$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle IN6_IS_ADDR_MULTICAST$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IN6_IS_ADDR_MULTICAST",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1366.IN6_IS_ADDR_MULTICAST$FUNC, false
    );
    static final FunctionDescriptor IN6_IS_ADDR_LINKLOCAL$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle IN6_IS_ADDR_LINKLOCAL$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IN6_IS_ADDR_LINKLOCAL",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1366.IN6_IS_ADDR_LINKLOCAL$FUNC, false
    );
}

