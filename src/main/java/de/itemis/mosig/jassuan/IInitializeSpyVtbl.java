// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IInitializeSpyVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("PreInitialize"),
        C_POINTER.withName("PostInitialize"),
        C_POINTER.withName("PreUninitialize"),
        C_POINTER.withName("PostUninitialize")
    ).withName("IInitializeSpyVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInitializeSpyVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IInitializeSpyVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInitializeSpyVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInitializeSpyVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IInitializeSpyVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IInitializeSpyVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IInitializeSpyVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInitializeSpyVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInitializeSpyVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IInitializeSpyVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IInitializeSpyVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IInitializeSpyVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInitializeSpyVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInitializeSpyVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IInitializeSpyVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IInitializeSpyVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor PreInitialize$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PreInitialize$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        IInitializeSpyVtbl.PreInitialize$FUNC, false
    );
    public interface PreInitialize {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2);
        static MemoryAddress allocate(PreInitialize fi) {
            return RuntimeHelper.upcallStub(PreInitialize.class, fi, IInitializeSpyVtbl.PreInitialize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)I");
        }
        static MemoryAddress allocate(PreInitialize fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(PreInitialize.class, fi, IInitializeSpyVtbl.PreInitialize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)I", scope);
        }
        static PreInitialize ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2) -> {
                try {
                    return (int)IInitializeSpyVtbl.PreInitialize$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle PreInitialize$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("PreInitialize")));
    public static VarHandle PreInitialize$VH() {
        return IInitializeSpyVtbl.PreInitialize$VH;
    }
    public static MemoryAddress PreInitialize$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.PreInitialize$VH.get(seg);
    }
    public static void PreInitialize$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.PreInitialize$VH.set(seg, x);
    }
    public static MemoryAddress PreInitialize$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.PreInitialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PreInitialize$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.PreInitialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PreInitialize PreInitialize (MemorySegment segment) {
        return PreInitialize.ofAddress(PreInitialize$get(segment));
    }
    static final FunctionDescriptor PostInitialize$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PostInitialize$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;III)I",
        IInitializeSpyVtbl.PostInitialize$FUNC, false
    );
    public interface PostInitialize {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3);
        static MemoryAddress allocate(PostInitialize fi) {
            return RuntimeHelper.upcallStub(PostInitialize.class, fi, IInitializeSpyVtbl.PostInitialize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;III)I");
        }
        static MemoryAddress allocate(PostInitialize fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(PostInitialize.class, fi, IInitializeSpyVtbl.PostInitialize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;III)I", scope);
        }
        static PostInitialize ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3) -> {
                try {
                    return (int)IInitializeSpyVtbl.PostInitialize$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle PostInitialize$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("PostInitialize")));
    public static VarHandle PostInitialize$VH() {
        return IInitializeSpyVtbl.PostInitialize$VH;
    }
    public static MemoryAddress PostInitialize$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.PostInitialize$VH.get(seg);
    }
    public static void PostInitialize$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.PostInitialize$VH.set(seg, x);
    }
    public static MemoryAddress PostInitialize$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.PostInitialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PostInitialize$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.PostInitialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PostInitialize PostInitialize (MemorySegment segment) {
        return PostInitialize.ofAddress(PostInitialize$get(segment));
    }
    static final FunctionDescriptor PreUninitialize$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PreUninitialize$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IInitializeSpyVtbl.PreUninitialize$FUNC, false
    );
    public interface PreUninitialize {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(PreUninitialize fi) {
            return RuntimeHelper.upcallStub(PreUninitialize.class, fi, IInitializeSpyVtbl.PreUninitialize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(PreUninitialize fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(PreUninitialize.class, fi, IInitializeSpyVtbl.PreUninitialize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static PreUninitialize ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IInitializeSpyVtbl.PreUninitialize$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle PreUninitialize$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("PreUninitialize")));
    public static VarHandle PreUninitialize$VH() {
        return IInitializeSpyVtbl.PreUninitialize$VH;
    }
    public static MemoryAddress PreUninitialize$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.PreUninitialize$VH.get(seg);
    }
    public static void PreUninitialize$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.PreUninitialize$VH.set(seg, x);
    }
    public static MemoryAddress PreUninitialize$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.PreUninitialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PreUninitialize$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.PreUninitialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PreUninitialize PreUninitialize (MemorySegment segment) {
        return PreUninitialize.ofAddress(PreUninitialize$get(segment));
    }
    static final FunctionDescriptor PostUninitialize$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PostUninitialize$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IInitializeSpyVtbl.PostUninitialize$FUNC, false
    );
    public interface PostUninitialize {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(PostUninitialize fi) {
            return RuntimeHelper.upcallStub(PostUninitialize.class, fi, IInitializeSpyVtbl.PostUninitialize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(PostUninitialize fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(PostUninitialize.class, fi, IInitializeSpyVtbl.PostUninitialize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static PostUninitialize ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IInitializeSpyVtbl.PostUninitialize$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle PostUninitialize$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("PostUninitialize")));
    public static VarHandle PostUninitialize$VH() {
        return IInitializeSpyVtbl.PostUninitialize$VH;
    }
    public static MemoryAddress PostUninitialize$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.PostUninitialize$VH.get(seg);
    }
    public static void PostUninitialize$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.PostUninitialize$VH.set(seg, x);
    }
    public static MemoryAddress PostUninitialize$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInitializeSpyVtbl.PostUninitialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PostUninitialize$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.PostUninitialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PostUninitialize PostUninitialize (MemorySegment segment) {
        return PostUninitialize.ofAddress(PostUninitialize$get(segment));
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

