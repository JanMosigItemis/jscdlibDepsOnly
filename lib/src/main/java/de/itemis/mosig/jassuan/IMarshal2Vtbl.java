// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IMarshal2Vtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("GetUnmarshalClass"),
        C_POINTER.withName("GetMarshalSizeMax"),
        C_POINTER.withName("MarshalInterface"),
        C_POINTER.withName("UnmarshalInterface"),
        C_POINTER.withName("ReleaseMarshalData"),
        C_POINTER.withName("DisconnectObject")
    ).withName("IMarshal2Vtbl");
    public static MemoryLayout $LAYOUT() {
        return IMarshal2Vtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IMarshal2Vtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IMarshal2Vtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IMarshal2Vtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IMarshal2Vtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IMarshal2Vtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IMarshal2Vtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IMarshal2Vtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IMarshal2Vtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IMarshal2Vtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IMarshal2Vtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IMarshal2Vtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IMarshal2Vtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IMarshal2Vtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IMarshal2Vtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IMarshal2Vtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor GetUnmarshalClass$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetUnmarshalClass$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IMarshal2Vtbl.GetUnmarshalClass$FUNC, false
    );
    public interface GetUnmarshalClass {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
        static MemoryAddress allocate(GetUnmarshalClass fi) {
            return RuntimeHelper.upcallStub(GetUnmarshalClass.class, fi, IMarshal2Vtbl.GetUnmarshalClass$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetUnmarshalClass fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetUnmarshalClass.class, fi, IMarshal2Vtbl.GetUnmarshalClass$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetUnmarshalClass ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
                try {
                    return (int)IMarshal2Vtbl.GetUnmarshalClass$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetUnmarshalClass$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetUnmarshalClass")));
    public static VarHandle GetUnmarshalClass$VH() {
        return IMarshal2Vtbl.GetUnmarshalClass$VH;
    }
    public static MemoryAddress GetUnmarshalClass$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.GetUnmarshalClass$VH.get(seg);
    }
    public static void GetUnmarshalClass$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.GetUnmarshalClass$VH.set(seg, x);
    }
    public static MemoryAddress GetUnmarshalClass$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.GetUnmarshalClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetUnmarshalClass$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.GetUnmarshalClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetUnmarshalClass GetUnmarshalClass (MemorySegment segment) {
        return GetUnmarshalClass.ofAddress(GetUnmarshalClass$get(segment));
    }
    static final FunctionDescriptor GetMarshalSizeMax$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetMarshalSizeMax$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IMarshal2Vtbl.GetMarshalSizeMax$FUNC, false
    );
    public interface GetMarshalSizeMax {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
        static MemoryAddress allocate(GetMarshalSizeMax fi) {
            return RuntimeHelper.upcallStub(GetMarshalSizeMax.class, fi, IMarshal2Vtbl.GetMarshalSizeMax$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetMarshalSizeMax fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetMarshalSizeMax.class, fi, IMarshal2Vtbl.GetMarshalSizeMax$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetMarshalSizeMax ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
                try {
                    return (int)IMarshal2Vtbl.GetMarshalSizeMax$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetMarshalSizeMax$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetMarshalSizeMax")));
    public static VarHandle GetMarshalSizeMax$VH() {
        return IMarshal2Vtbl.GetMarshalSizeMax$VH;
    }
    public static MemoryAddress GetMarshalSizeMax$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.GetMarshalSizeMax$VH.get(seg);
    }
    public static void GetMarshalSizeMax$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.GetMarshalSizeMax$VH.set(seg, x);
    }
    public static MemoryAddress GetMarshalSizeMax$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.GetMarshalSizeMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetMarshalSizeMax$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.GetMarshalSizeMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetMarshalSizeMax GetMarshalSizeMax (MemorySegment segment) {
        return GetMarshalSizeMax.ofAddress(GetMarshalSizeMax$get(segment));
    }
    static final FunctionDescriptor MarshalInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle MarshalInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        IMarshal2Vtbl.MarshalInterface$FUNC, false
    );
    public interface MarshalInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, int x4, jdk.incubator.foreign.MemoryAddress x5, int x6);
        static MemoryAddress allocate(MarshalInterface fi) {
            return RuntimeHelper.upcallStub(MarshalInterface.class, fi, IMarshal2Vtbl.MarshalInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(MarshalInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(MarshalInterface.class, fi, IMarshal2Vtbl.MarshalInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static MarshalInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, int x4, jdk.incubator.foreign.MemoryAddress x5, int x6) -> {
                try {
                    return (int)IMarshal2Vtbl.MarshalInterface$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle MarshalInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("MarshalInterface")));
    public static VarHandle MarshalInterface$VH() {
        return IMarshal2Vtbl.MarshalInterface$VH;
    }
    public static MemoryAddress MarshalInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.MarshalInterface$VH.get(seg);
    }
    public static void MarshalInterface$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.MarshalInterface$VH.set(seg, x);
    }
    public static MemoryAddress MarshalInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.MarshalInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MarshalInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.MarshalInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MarshalInterface MarshalInterface (MemorySegment segment) {
        return MarshalInterface.ofAddress(MarshalInterface$get(segment));
    }
    static final FunctionDescriptor UnmarshalInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle UnmarshalInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IMarshal2Vtbl.UnmarshalInterface$FUNC, false
    );
    public interface UnmarshalInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(UnmarshalInterface fi) {
            return RuntimeHelper.upcallStub(UnmarshalInterface.class, fi, IMarshal2Vtbl.UnmarshalInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(UnmarshalInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(UnmarshalInterface.class, fi, IMarshal2Vtbl.UnmarshalInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static UnmarshalInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IMarshal2Vtbl.UnmarshalInterface$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnmarshalInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("UnmarshalInterface")));
    public static VarHandle UnmarshalInterface$VH() {
        return IMarshal2Vtbl.UnmarshalInterface$VH;
    }
    public static MemoryAddress UnmarshalInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.UnmarshalInterface$VH.get(seg);
    }
    public static void UnmarshalInterface$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.UnmarshalInterface$VH.set(seg, x);
    }
    public static MemoryAddress UnmarshalInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.UnmarshalInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnmarshalInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.UnmarshalInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnmarshalInterface UnmarshalInterface (MemorySegment segment) {
        return UnmarshalInterface.ofAddress(UnmarshalInterface$get(segment));
    }
    static final FunctionDescriptor ReleaseMarshalData$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ReleaseMarshalData$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IMarshal2Vtbl.ReleaseMarshalData$FUNC, false
    );
    public interface ReleaseMarshalData {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(ReleaseMarshalData fi) {
            return RuntimeHelper.upcallStub(ReleaseMarshalData.class, fi, IMarshal2Vtbl.ReleaseMarshalData$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(ReleaseMarshalData fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ReleaseMarshalData.class, fi, IMarshal2Vtbl.ReleaseMarshalData$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static ReleaseMarshalData ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IMarshal2Vtbl.ReleaseMarshalData$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReleaseMarshalData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ReleaseMarshalData")));
    public static VarHandle ReleaseMarshalData$VH() {
        return IMarshal2Vtbl.ReleaseMarshalData$VH;
    }
    public static MemoryAddress ReleaseMarshalData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.ReleaseMarshalData$VH.get(seg);
    }
    public static void ReleaseMarshalData$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.ReleaseMarshalData$VH.set(seg, x);
    }
    public static MemoryAddress ReleaseMarshalData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.ReleaseMarshalData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReleaseMarshalData$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.ReleaseMarshalData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReleaseMarshalData ReleaseMarshalData (MemorySegment segment) {
        return ReleaseMarshalData.ofAddress(ReleaseMarshalData$get(segment));
    }
    static final FunctionDescriptor DisconnectObject$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle DisconnectObject$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IMarshal2Vtbl.DisconnectObject$FUNC, false
    );
    public interface DisconnectObject {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(DisconnectObject fi) {
            return RuntimeHelper.upcallStub(DisconnectObject.class, fi, IMarshal2Vtbl.DisconnectObject$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(DisconnectObject fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(DisconnectObject.class, fi, IMarshal2Vtbl.DisconnectObject$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static DisconnectObject ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IMarshal2Vtbl.DisconnectObject$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DisconnectObject$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("DisconnectObject")));
    public static VarHandle DisconnectObject$VH() {
        return IMarshal2Vtbl.DisconnectObject$VH;
    }
    public static MemoryAddress DisconnectObject$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.DisconnectObject$VH.get(seg);
    }
    public static void DisconnectObject$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.DisconnectObject$VH.set(seg, x);
    }
    public static MemoryAddress DisconnectObject$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IMarshal2Vtbl.DisconnectObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DisconnectObject$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.DisconnectObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DisconnectObject DisconnectObject (MemorySegment segment) {
        return DisconnectObject.ofAddress(DisconnectObject$get(segment));
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

