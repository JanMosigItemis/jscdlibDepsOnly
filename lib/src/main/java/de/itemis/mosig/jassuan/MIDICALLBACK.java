// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface MIDICALLBACK {

    void apply(jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, long x3, long x4);
    static MemoryAddress allocate(MIDICALLBACK fi) {
        return RuntimeHelper.upcallStub(MIDICALLBACK.class, fi, constants$753.MIDICALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJJJ)V");
    }
    static MemoryAddress allocate(MIDICALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(MIDICALLBACK.class, fi, constants$753.MIDICALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJJJ)V", scope);
    }
    static MIDICALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, long x3, long x4) -> {
            try {
                constants$753.MIDICALLBACK$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

