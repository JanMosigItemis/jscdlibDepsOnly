// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CMSG_STREAM_OUTPUT {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3);
    static MemoryAddress allocate(PFN_CMSG_STREAM_OUTPUT fi) {
        return RuntimeHelper.upcallStub(PFN_CMSG_STREAM_OUTPUT.class, fi, constants$867.PFN_CMSG_STREAM_OUTPUT$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I");
    }
    static MemoryAddress allocate(PFN_CMSG_STREAM_OUTPUT fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CMSG_STREAM_OUTPUT.class, fi, constants$867.PFN_CMSG_STREAM_OUTPUT$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I", scope);
    }
    static PFN_CMSG_STREAM_OUTPUT ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3) -> {
            try {
                return (int)constants$867.PFN_CMSG_STREAM_OUTPUT$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

