// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface gpgrt_get_syscall_clamp$r_post {

    void apply();
    static MemoryAddress allocate(gpgrt_get_syscall_clamp$r_post fi) {
        return RuntimeHelper.upcallStub(gpgrt_get_syscall_clamp$r_post.class, fi, constants$1377.gpgrt_get_syscall_clamp$r_post$FUNC, "()V");
    }
    static MemoryAddress allocate(gpgrt_get_syscall_clamp$r_post fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(gpgrt_get_syscall_clamp$r_post.class, fi, constants$1377.gpgrt_get_syscall_clamp$r_post$FUNC, "()V", scope);
    }
    static gpgrt_get_syscall_clamp$r_post ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$1377.gpgrt_get_syscall_clamp$r_post$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

