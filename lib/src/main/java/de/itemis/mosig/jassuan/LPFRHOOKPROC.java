// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface LPFRHOOKPROC {

    long apply(jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, long x3);
    static MemoryAddress allocate(LPFRHOOKPROC fi) {
        return RuntimeHelper.upcallStub(LPFRHOOKPROC.class, fi, constants$1319.LPFRHOOKPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J");
    }
    static MemoryAddress allocate(LPFRHOOKPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(LPFRHOOKPROC.class, fi, constants$1319.LPFRHOOKPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J", scope);
    }
    static LPFRHOOKPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, long x3) -> {
            try {
                return (long)constants$1319.LPFRHOOKPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

