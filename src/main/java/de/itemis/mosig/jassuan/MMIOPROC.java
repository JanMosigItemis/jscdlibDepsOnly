// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface MMIOPROC {

    long apply(jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, long x3);
    static MemoryAddress allocate(MMIOPROC fi) {
        return RuntimeHelper.upcallStub(MMIOPROC.class, fi, constants$768.MMIOPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J");
    }
    static MemoryAddress allocate(MMIOPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(MMIOPROC.class, fi, constants$768.MMIOPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J", scope);
    }
    static MMIOPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, long x3) -> {
            try {
                return (long)constants$768.MMIOPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

