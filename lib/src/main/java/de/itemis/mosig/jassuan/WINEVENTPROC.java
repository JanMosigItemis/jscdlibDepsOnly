// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface WINEVENTPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6);
    static MemoryAddress allocate(WINEVENTPROC fi) {
        return RuntimeHelper.upcallStub(WINEVENTPROC.class, fi, constants$652.WINEVENTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IIII)V");
    }
    static MemoryAddress allocate(WINEVENTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(WINEVENTPROC.class, fi, constants$652.WINEVENTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IIII)V", scope);
    }
    static WINEVENTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6) -> {
            try {
                constants$652.WINEVENTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

