// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IViewObjectVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("Draw"),
        C_POINTER.withName("GetColorSet"),
        C_POINTER.withName("Freeze"),
        C_POINTER.withName("Unfreeze"),
        C_POINTER.withName("SetAdvise"),
        C_POINTER.withName("GetAdvise")
    ).withName("IViewObjectVtbl");
    public static MemoryLayout $LAYOUT() {
        return IViewObjectVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IViewObjectVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IViewObjectVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IViewObjectVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IViewObjectVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IViewObjectVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IViewObjectVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IViewObjectVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IViewObjectVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IViewObjectVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IViewObjectVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IViewObjectVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IViewObjectVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IViewObjectVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IViewObjectVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IViewObjectVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor Draw$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle Draw$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        IViewObjectVtbl.Draw$FUNC, false
    );
    public interface Draw {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6, jdk.incubator.foreign.MemoryAddress x7, jdk.incubator.foreign.MemoryAddress x8, jdk.incubator.foreign.MemoryAddress x9, long x10);
        static MemoryAddress allocate(Draw fi) {
            return RuntimeHelper.upcallStub(Draw.class, fi, IViewObjectVtbl.Draw$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I");
        }
        static MemoryAddress allocate(Draw fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Draw.class, fi, IViewObjectVtbl.Draw$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I", scope);
        }
        static Draw ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6, jdk.incubator.foreign.MemoryAddress x7, jdk.incubator.foreign.MemoryAddress x8, jdk.incubator.foreign.MemoryAddress x9, long x10) -> {
                try {
                    return (int)IViewObjectVtbl.Draw$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Draw$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Draw")));
    public static VarHandle Draw$VH() {
        return IViewObjectVtbl.Draw$VH;
    }
    public static MemoryAddress Draw$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.Draw$VH.get(seg);
    }
    public static void Draw$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.Draw$VH.set(seg, x);
    }
    public static MemoryAddress Draw$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.Draw$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Draw$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.Draw$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Draw Draw (MemorySegment segment) {
        return Draw.ofAddress(Draw$get(segment));
    }
    static final FunctionDescriptor GetColorSet$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetColorSet$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IViewObjectVtbl.GetColorSet$FUNC, false
    );
    public interface GetColorSet {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6);
        static MemoryAddress allocate(GetColorSet fi) {
            return RuntimeHelper.upcallStub(GetColorSet.class, fi, IViewObjectVtbl.GetColorSet$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetColorSet fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetColorSet.class, fi, IViewObjectVtbl.GetColorSet$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetColorSet ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6) -> {
                try {
                    return (int)IViewObjectVtbl.GetColorSet$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetColorSet$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetColorSet")));
    public static VarHandle GetColorSet$VH() {
        return IViewObjectVtbl.GetColorSet$VH;
    }
    public static MemoryAddress GetColorSet$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.GetColorSet$VH.get(seg);
    }
    public static void GetColorSet$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.GetColorSet$VH.set(seg, x);
    }
    public static MemoryAddress GetColorSet$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.GetColorSet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetColorSet$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.GetColorSet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetColorSet GetColorSet (MemorySegment segment) {
        return GetColorSet.ofAddress(GetColorSet$get(segment));
    }
    static final FunctionDescriptor Freeze$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Freeze$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IViewObjectVtbl.Freeze$FUNC, false
    );
    public interface Freeze {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(Freeze fi) {
            return RuntimeHelper.upcallStub(Freeze.class, fi, IViewObjectVtbl.Freeze$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Freeze fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Freeze.class, fi, IViewObjectVtbl.Freeze$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Freeze ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IViewObjectVtbl.Freeze$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Freeze$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Freeze")));
    public static VarHandle Freeze$VH() {
        return IViewObjectVtbl.Freeze$VH;
    }
    public static MemoryAddress Freeze$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.Freeze$VH.get(seg);
    }
    public static void Freeze$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.Freeze$VH.set(seg, x);
    }
    public static MemoryAddress Freeze$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.Freeze$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Freeze$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.Freeze$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Freeze Freeze (MemorySegment segment) {
        return Freeze.ofAddress(Freeze$get(segment));
    }
    static final FunctionDescriptor Unfreeze$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle Unfreeze$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IViewObjectVtbl.Unfreeze$FUNC, false
    );
    public interface Unfreeze {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(Unfreeze fi) {
            return RuntimeHelper.upcallStub(Unfreeze.class, fi, IViewObjectVtbl.Unfreeze$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(Unfreeze fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Unfreeze.class, fi, IViewObjectVtbl.Unfreeze$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static Unfreeze ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IViewObjectVtbl.Unfreeze$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Unfreeze$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Unfreeze")));
    public static VarHandle Unfreeze$VH() {
        return IViewObjectVtbl.Unfreeze$VH;
    }
    public static MemoryAddress Unfreeze$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.Unfreeze$VH.get(seg);
    }
    public static void Unfreeze$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.Unfreeze$VH.set(seg, x);
    }
    public static MemoryAddress Unfreeze$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.Unfreeze$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unfreeze$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.Unfreeze$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unfreeze Unfreeze (MemorySegment segment) {
        return Unfreeze.ofAddress(Unfreeze$get(segment));
    }
    static final FunctionDescriptor SetAdvise$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle SetAdvise$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        IViewObjectVtbl.SetAdvise$FUNC, false
    );
    public interface SetAdvise {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(SetAdvise fi) {
            return RuntimeHelper.upcallStub(SetAdvise.class, fi, IViewObjectVtbl.SetAdvise$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetAdvise fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetAdvise.class, fi, IViewObjectVtbl.SetAdvise$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetAdvise ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IViewObjectVtbl.SetAdvise$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetAdvise$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetAdvise")));
    public static VarHandle SetAdvise$VH() {
        return IViewObjectVtbl.SetAdvise$VH;
    }
    public static MemoryAddress SetAdvise$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.SetAdvise$VH.get(seg);
    }
    public static void SetAdvise$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.SetAdvise$VH.set(seg, x);
    }
    public static MemoryAddress SetAdvise$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.SetAdvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetAdvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.SetAdvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetAdvise SetAdvise (MemorySegment segment) {
        return SetAdvise.ofAddress(SetAdvise$get(segment));
    }
    static final FunctionDescriptor GetAdvise$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetAdvise$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IViewObjectVtbl.GetAdvise$FUNC, false
    );
    public interface GetAdvise {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(GetAdvise fi) {
            return RuntimeHelper.upcallStub(GetAdvise.class, fi, IViewObjectVtbl.GetAdvise$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetAdvise fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetAdvise.class, fi, IViewObjectVtbl.GetAdvise$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetAdvise ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IViewObjectVtbl.GetAdvise$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetAdvise$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetAdvise")));
    public static VarHandle GetAdvise$VH() {
        return IViewObjectVtbl.GetAdvise$VH;
    }
    public static MemoryAddress GetAdvise$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.GetAdvise$VH.get(seg);
    }
    public static void GetAdvise$set( MemorySegment seg, MemoryAddress x) {
        IViewObjectVtbl.GetAdvise$VH.set(seg, x);
    }
    public static MemoryAddress GetAdvise$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IViewObjectVtbl.GetAdvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetAdvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObjectVtbl.GetAdvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetAdvise GetAdvise (MemorySegment segment) {
        return GetAdvise.ofAddress(GetAdvise$get(segment));
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

