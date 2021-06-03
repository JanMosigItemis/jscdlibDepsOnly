// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class ISynchronizeMutexVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("Wait"),
        C_POINTER.withName("Signal"),
        C_POINTER.withName("Reset"),
        C_POINTER.withName("ReleaseMutex")
    ).withName("ISynchronizeMutexVtbl");
    public static MemoryLayout $LAYOUT() {
        return ISynchronizeMutexVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ISynchronizeMutexVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ISynchronizeMutexVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ISynchronizeMutexVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)ISynchronizeMutexVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return ISynchronizeMutexVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        ISynchronizeMutexVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        ISynchronizeMutexVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ISynchronizeMutexVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ISynchronizeMutexVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ISynchronizeMutexVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ISynchronizeMutexVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return ISynchronizeMutexVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        ISynchronizeMutexVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        ISynchronizeMutexVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ISynchronizeMutexVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, ISynchronizeMutexVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, ISynchronizeMutexVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ISynchronizeMutexVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return ISynchronizeMutexVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        ISynchronizeMutexVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        ISynchronizeMutexVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor Wait$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle Wait$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        ISynchronizeMutexVtbl.Wait$FUNC, false
    );
    public interface Wait {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2);
        static MemoryAddress allocate(Wait fi) {
            return RuntimeHelper.upcallStub(Wait.class, fi, ISynchronizeMutexVtbl.Wait$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)I");
        }
        static MemoryAddress allocate(Wait fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Wait.class, fi, ISynchronizeMutexVtbl.Wait$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)I", scope);
        }
        static Wait ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2) -> {
                try {
                    return (int)ISynchronizeMutexVtbl.Wait$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Wait$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Wait")));
    public static VarHandle Wait$VH() {
        return ISynchronizeMutexVtbl.Wait$VH;
    }
    public static MemoryAddress Wait$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.Wait$VH.get(seg);
    }
    public static void Wait$set( MemorySegment seg, MemoryAddress x) {
        ISynchronizeMutexVtbl.Wait$VH.set(seg, x);
    }
    public static MemoryAddress Wait$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.Wait$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Wait$set(MemorySegment seg, long index, MemoryAddress x) {
        ISynchronizeMutexVtbl.Wait$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Wait Wait (MemorySegment segment) {
        return Wait.ofAddress(Wait$get(segment));
    }
    static final FunctionDescriptor Signal$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Signal$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ISynchronizeMutexVtbl.Signal$FUNC, false
    );
    public interface Signal {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Signal fi) {
            return RuntimeHelper.upcallStub(Signal.class, fi, ISynchronizeMutexVtbl.Signal$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Signal fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Signal.class, fi, ISynchronizeMutexVtbl.Signal$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Signal ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ISynchronizeMutexVtbl.Signal$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Signal$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Signal")));
    public static VarHandle Signal$VH() {
        return ISynchronizeMutexVtbl.Signal$VH;
    }
    public static MemoryAddress Signal$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.Signal$VH.get(seg);
    }
    public static void Signal$set( MemorySegment seg, MemoryAddress x) {
        ISynchronizeMutexVtbl.Signal$VH.set(seg, x);
    }
    public static MemoryAddress Signal$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.Signal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signal$set(MemorySegment seg, long index, MemoryAddress x) {
        ISynchronizeMutexVtbl.Signal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Signal Signal (MemorySegment segment) {
        return Signal.ofAddress(Signal$get(segment));
    }
    static final FunctionDescriptor Reset$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Reset$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ISynchronizeMutexVtbl.Reset$FUNC, false
    );
    public interface Reset {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Reset fi) {
            return RuntimeHelper.upcallStub(Reset.class, fi, ISynchronizeMutexVtbl.Reset$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Reset fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Reset.class, fi, ISynchronizeMutexVtbl.Reset$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Reset ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ISynchronizeMutexVtbl.Reset$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Reset$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Reset")));
    public static VarHandle Reset$VH() {
        return ISynchronizeMutexVtbl.Reset$VH;
    }
    public static MemoryAddress Reset$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.Reset$VH.get(seg);
    }
    public static void Reset$set( MemorySegment seg, MemoryAddress x) {
        ISynchronizeMutexVtbl.Reset$VH.set(seg, x);
    }
    public static MemoryAddress Reset$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.Reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemoryAddress x) {
        ISynchronizeMutexVtbl.Reset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Reset Reset (MemorySegment segment) {
        return Reset.ofAddress(Reset$get(segment));
    }
    static final FunctionDescriptor ReleaseMutex$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle ReleaseMutex$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ISynchronizeMutexVtbl.ReleaseMutex$FUNC, false
    );
    public interface ReleaseMutex {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(ReleaseMutex fi) {
            return RuntimeHelper.upcallStub(ReleaseMutex.class, fi, ISynchronizeMutexVtbl.ReleaseMutex$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(ReleaseMutex fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ReleaseMutex.class, fi, ISynchronizeMutexVtbl.ReleaseMutex$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static ReleaseMutex ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ISynchronizeMutexVtbl.ReleaseMutex$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReleaseMutex$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ReleaseMutex")));
    public static VarHandle ReleaseMutex$VH() {
        return ISynchronizeMutexVtbl.ReleaseMutex$VH;
    }
    public static MemoryAddress ReleaseMutex$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.ReleaseMutex$VH.get(seg);
    }
    public static void ReleaseMutex$set( MemorySegment seg, MemoryAddress x) {
        ISynchronizeMutexVtbl.ReleaseMutex$VH.set(seg, x);
    }
    public static MemoryAddress ReleaseMutex$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ISynchronizeMutexVtbl.ReleaseMutex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReleaseMutex$set(MemorySegment seg, long index, MemoryAddress x) {
        ISynchronizeMutexVtbl.ReleaseMutex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReleaseMutex ReleaseMutex (MemorySegment segment) {
        return ReleaseMutex.ofAddress(ReleaseMutex$get(segment));
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

