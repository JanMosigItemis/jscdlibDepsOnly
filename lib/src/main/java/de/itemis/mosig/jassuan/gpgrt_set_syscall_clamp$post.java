// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface gpgrt_set_syscall_clamp$post {

    void apply();
    static MemoryAddress allocate(gpgrt_set_syscall_clamp$post fi) {
        return RuntimeHelper.upcallStub(gpgrt_set_syscall_clamp$post.class, fi, constants$1376.gpgrt_set_syscall_clamp$post$FUNC, "()V");
    }
    static MemoryAddress allocate(gpgrt_set_syscall_clamp$post fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(gpgrt_set_syscall_clamp$post.class, fi, constants$1376.gpgrt_set_syscall_clamp$post$FUNC, "()V", scope);
    }
    static gpgrt_set_syscall_clamp$post ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$1376.gpgrt_set_syscall_clamp$post$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

