// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PTIMERAPCROUTINE {

    void apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2);
    static MemoryAddress allocate(PTIMERAPCROUTINE fi) {
        return RuntimeHelper.upcallStub(PTIMERAPCROUTINE.class, fi, constants$370.PTIMERAPCROUTINE$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)V");
    }
    static MemoryAddress allocate(PTIMERAPCROUTINE fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PTIMERAPCROUTINE.class, fi, constants$370.PTIMERAPCROUTINE$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)V", scope);
    }
    static PTIMERAPCROUTINE ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2) -> {
            try {
                constants$371.PTIMERAPCROUTINE$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

