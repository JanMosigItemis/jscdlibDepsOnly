// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface NEARPROC {

    long apply();
    static MemoryAddress allocate(NEARPROC fi) {
        return RuntimeHelper.upcallStub(NEARPROC.class, fi, constants$286.NEARPROC$FUNC, "()J");
    }
    static MemoryAddress allocate(NEARPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(NEARPROC.class, fi, constants$286.NEARPROC$FUNC, "()J", scope);
    }
    static NEARPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                return (long)constants$286.NEARPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

