// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface DRAWSTATEPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, long x2, int x3, int x4);
    static MemoryAddress allocate(DRAWSTATEPROC fi) {
        return RuntimeHelper.upcallStub(DRAWSTATEPROC.class, fi, constants$548.DRAWSTATEPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJII)I");
    }
    static MemoryAddress allocate(DRAWSTATEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(DRAWSTATEPROC.class, fi, constants$548.DRAWSTATEPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJII)I", scope);
    }
    static DRAWSTATEPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, long x2, int x3, int x4) -> {
            try {
                return (int)constants$548.DRAWSTATEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

