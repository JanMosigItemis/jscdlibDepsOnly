// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface gpgrt_log_set_pid_suffix_cb$cb {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(gpgrt_log_set_pid_suffix_cb$cb fi) {
        return RuntimeHelper.upcallStub(gpgrt_log_set_pid_suffix_cb$cb.class, fi, constants$1405.gpgrt_log_set_pid_suffix_cb$cb$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(gpgrt_log_set_pid_suffix_cb$cb fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(gpgrt_log_set_pid_suffix_cb$cb.class, fi, constants$1405.gpgrt_log_set_pid_suffix_cb$cb$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static gpgrt_log_set_pid_suffix_cb$cb ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$1405.gpgrt_log_set_pid_suffix_cb$cb$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

