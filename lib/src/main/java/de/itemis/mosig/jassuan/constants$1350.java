// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1350 {

    static final FunctionDescriptor htons$FUNC = FunctionDescriptor.of(C_SHORT,
        C_SHORT
    );
    static final MethodHandle htons$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "htons",
        "(S)S",
        constants$1350.htons$FUNC, false
    );
    static final FunctionDescriptor inet_addr$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle inet_addr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "inet_addr",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1350.inet_addr$FUNC, false
    );
    static final FunctionDescriptor inet_ntoa$FUNC = FunctionDescriptor.of(C_POINTER,
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    C_CHAR.withName("s_b1"),
                    C_CHAR.withName("s_b2"),
                    C_CHAR.withName("s_b3"),
                    C_CHAR.withName("s_b4")
                ).withName("S_un_b"),
                MemoryLayout.structLayout(
                    C_SHORT.withName("s_w1"),
                    C_SHORT.withName("s_w2")
                ).withName("S_un_w"),
                C_LONG.withName("S_addr")
            ).withName("S_un")
        ).withName("in_addr")
    );
    static final MethodHandle inet_ntoa$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "inet_ntoa",
        "(Ljdk/incubator/foreign/MemorySegment;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1350.inet_ntoa$FUNC, false
    );
    static final FunctionDescriptor listen$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_INT
    );
    static final MethodHandle listen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "listen",
        "(JI)I",
        constants$1350.listen$FUNC, false
    );
    static final FunctionDescriptor ntohl$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle ntohl$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ntohl",
        "(I)I",
        constants$1350.ntohl$FUNC, false
    );
    static final FunctionDescriptor ntohs$FUNC = FunctionDescriptor.of(C_SHORT,
        C_SHORT
    );
    static final MethodHandle ntohs$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ntohs",
        "(S)S",
        constants$1350.ntohs$FUNC, false
    );
}

