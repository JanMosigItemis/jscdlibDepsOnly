// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNCALLBACK {

    jdk.incubator.foreign.MemoryAddress apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, long x6, long x7);
    static MemoryAddress allocate(PFNCALLBACK fi) {
        return RuntimeHelper.upcallStub(PFNCALLBACK.class, fi, constants$735.PFNCALLBACK$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJ)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNCALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNCALLBACK.class, fi, constants$735.PFNCALLBACK$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJ)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNCALLBACK ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, long x6, long x7) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$736.PFNCALLBACK$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

