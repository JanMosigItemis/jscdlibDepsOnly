// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface DESKTOPENUMPROCA {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static MemoryAddress allocate(DESKTOPENUMPROCA fi) {
        return RuntimeHelper.upcallStub(DESKTOPENUMPROCA.class, fi, constants$550.DESKTOPENUMPROCA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I");
    }
    static MemoryAddress allocate(DESKTOPENUMPROCA fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(DESKTOPENUMPROCA.class, fi, constants$550.DESKTOPENUMPROCA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I", scope);
    }
    static DESKTOPENUMPROCA ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                return (int)constants$551.DESKTOPENUMPROCA$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

