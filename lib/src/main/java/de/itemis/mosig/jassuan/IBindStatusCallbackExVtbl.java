// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IBindStatusCallbackExVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("OnStartBinding"),
        C_POINTER.withName("GetPriority"),
        C_POINTER.withName("OnLowResource"),
        C_POINTER.withName("OnProgress"),
        C_POINTER.withName("OnStopBinding"),
        C_POINTER.withName("GetBindInfo"),
        C_POINTER.withName("OnDataAvailable"),
        C_POINTER.withName("OnObjectAvailable"),
        C_POINTER.withName("GetBindInfoEx")
    ).withName("IBindStatusCallbackExVtbl");
    public static MemoryLayout $LAYOUT() {
        return IBindStatusCallbackExVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IBindStatusCallbackExVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IBindStatusCallbackExVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IBindStatusCallbackExVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IBindStatusCallbackExVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IBindStatusCallbackExVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IBindStatusCallbackExVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IBindStatusCallbackExVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IBindStatusCallbackExVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IBindStatusCallbackExVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor OnStartBinding$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle OnStartBinding$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.OnStartBinding$FUNC, false
    );
    public interface OnStartBinding {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(OnStartBinding fi) {
            return RuntimeHelper.upcallStub(OnStartBinding.class, fi, IBindStatusCallbackExVtbl.OnStartBinding$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(OnStartBinding fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(OnStartBinding.class, fi, IBindStatusCallbackExVtbl.OnStartBinding$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static OnStartBinding ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.OnStartBinding$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnStartBinding$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("OnStartBinding")));
    public static VarHandle OnStartBinding$VH() {
        return IBindStatusCallbackExVtbl.OnStartBinding$VH;
    }
    public static MemoryAddress OnStartBinding$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnStartBinding$VH.get(seg);
    }
    public static void OnStartBinding$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnStartBinding$VH.set(seg, x);
    }
    public static MemoryAddress OnStartBinding$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnStartBinding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnStartBinding$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnStartBinding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnStartBinding OnStartBinding (MemorySegment segment) {
        return OnStartBinding.ofAddress(OnStartBinding$get(segment));
    }
    static final FunctionDescriptor GetPriority$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetPriority$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.GetPriority$FUNC, false
    );
    public interface GetPriority {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetPriority fi) {
            return RuntimeHelper.upcallStub(GetPriority.class, fi, IBindStatusCallbackExVtbl.GetPriority$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetPriority fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetPriority.class, fi, IBindStatusCallbackExVtbl.GetPriority$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetPriority ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.GetPriority$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetPriority$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetPriority")));
    public static VarHandle GetPriority$VH() {
        return IBindStatusCallbackExVtbl.GetPriority$VH;
    }
    public static MemoryAddress GetPriority$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.GetPriority$VH.get(seg);
    }
    public static void GetPriority$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.GetPriority$VH.set(seg, x);
    }
    public static MemoryAddress GetPriority$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.GetPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetPriority$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.GetPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetPriority GetPriority (MemorySegment segment) {
        return GetPriority.ofAddress(GetPriority$get(segment));
    }
    static final FunctionDescriptor OnLowResource$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle OnLowResource$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IBindStatusCallbackExVtbl.OnLowResource$FUNC, false
    );
    public interface OnLowResource {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(OnLowResource fi) {
            return RuntimeHelper.upcallStub(OnLowResource.class, fi, IBindStatusCallbackExVtbl.OnLowResource$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(OnLowResource fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(OnLowResource.class, fi, IBindStatusCallbackExVtbl.OnLowResource$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static OnLowResource ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.OnLowResource$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnLowResource$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("OnLowResource")));
    public static VarHandle OnLowResource$VH() {
        return IBindStatusCallbackExVtbl.OnLowResource$VH;
    }
    public static MemoryAddress OnLowResource$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnLowResource$VH.get(seg);
    }
    public static void OnLowResource$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnLowResource$VH.set(seg, x);
    }
    public static MemoryAddress OnLowResource$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnLowResource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnLowResource$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnLowResource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnLowResource OnLowResource (MemorySegment segment) {
        return OnLowResource.ofAddress(OnLowResource$get(segment));
    }
    static final FunctionDescriptor OnProgress$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle OnProgress$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.OnProgress$FUNC, false
    );
    public interface OnProgress {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(OnProgress fi) {
            return RuntimeHelper.upcallStub(OnProgress.class, fi, IBindStatusCallbackExVtbl.OnProgress$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(OnProgress fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(OnProgress.class, fi, IBindStatusCallbackExVtbl.OnProgress$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static OnProgress ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.OnProgress$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnProgress$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("OnProgress")));
    public static VarHandle OnProgress$VH() {
        return IBindStatusCallbackExVtbl.OnProgress$VH;
    }
    public static MemoryAddress OnProgress$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnProgress$VH.get(seg);
    }
    public static void OnProgress$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnProgress$VH.set(seg, x);
    }
    public static MemoryAddress OnProgress$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnProgress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnProgress$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnProgress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnProgress OnProgress (MemorySegment segment) {
        return OnProgress.ofAddress(OnProgress$get(segment));
    }
    static final FunctionDescriptor OnStopBinding$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle OnStopBinding$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.OnStopBinding$FUNC, false
    );
    public interface OnStopBinding {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(OnStopBinding fi) {
            return RuntimeHelper.upcallStub(OnStopBinding.class, fi, IBindStatusCallbackExVtbl.OnStopBinding$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(OnStopBinding fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(OnStopBinding.class, fi, IBindStatusCallbackExVtbl.OnStopBinding$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static OnStopBinding ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.OnStopBinding$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnStopBinding$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("OnStopBinding")));
    public static VarHandle OnStopBinding$VH() {
        return IBindStatusCallbackExVtbl.OnStopBinding$VH;
    }
    public static MemoryAddress OnStopBinding$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnStopBinding$VH.get(seg);
    }
    public static void OnStopBinding$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnStopBinding$VH.set(seg, x);
    }
    public static MemoryAddress OnStopBinding$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnStopBinding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnStopBinding$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnStopBinding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnStopBinding OnStopBinding (MemorySegment segment) {
        return OnStopBinding.ofAddress(OnStopBinding$get(segment));
    }
    static final FunctionDescriptor GetBindInfo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetBindInfo$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.GetBindInfo$FUNC, false
    );
    public interface GetBindInfo {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(GetBindInfo fi) {
            return RuntimeHelper.upcallStub(GetBindInfo.class, fi, IBindStatusCallbackExVtbl.GetBindInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetBindInfo fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetBindInfo.class, fi, IBindStatusCallbackExVtbl.GetBindInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetBindInfo ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.GetBindInfo$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindInfo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetBindInfo")));
    public static VarHandle GetBindInfo$VH() {
        return IBindStatusCallbackExVtbl.GetBindInfo$VH;
    }
    public static MemoryAddress GetBindInfo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.GetBindInfo$VH.get(seg);
    }
    public static void GetBindInfo$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.GetBindInfo$VH.set(seg, x);
    }
    public static MemoryAddress GetBindInfo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.GetBindInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.GetBindInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindInfo GetBindInfo (MemorySegment segment) {
        return GetBindInfo.ofAddress(GetBindInfo$get(segment));
    }
    static final FunctionDescriptor OnDataAvailable$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OnDataAvailable$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.OnDataAvailable$FUNC, false
    );
    public interface OnDataAvailable {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(OnDataAvailable fi) {
            return RuntimeHelper.upcallStub(OnDataAvailable.class, fi, IBindStatusCallbackExVtbl.OnDataAvailable$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(OnDataAvailable fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(OnDataAvailable.class, fi, IBindStatusCallbackExVtbl.OnDataAvailable$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static OnDataAvailable ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.OnDataAvailable$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnDataAvailable$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("OnDataAvailable")));
    public static VarHandle OnDataAvailable$VH() {
        return IBindStatusCallbackExVtbl.OnDataAvailable$VH;
    }
    public static MemoryAddress OnDataAvailable$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnDataAvailable$VH.get(seg);
    }
    public static void OnDataAvailable$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnDataAvailable$VH.set(seg, x);
    }
    public static MemoryAddress OnDataAvailable$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnDataAvailable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnDataAvailable$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnDataAvailable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnDataAvailable OnDataAvailable (MemorySegment segment) {
        return OnDataAvailable.ofAddress(OnDataAvailable$get(segment));
    }
    static final FunctionDescriptor OnObjectAvailable$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OnObjectAvailable$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.OnObjectAvailable$FUNC, false
    );
    public interface OnObjectAvailable {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(OnObjectAvailable fi) {
            return RuntimeHelper.upcallStub(OnObjectAvailable.class, fi, IBindStatusCallbackExVtbl.OnObjectAvailable$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(OnObjectAvailable fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(OnObjectAvailable.class, fi, IBindStatusCallbackExVtbl.OnObjectAvailable$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static OnObjectAvailable ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.OnObjectAvailable$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnObjectAvailable$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("OnObjectAvailable")));
    public static VarHandle OnObjectAvailable$VH() {
        return IBindStatusCallbackExVtbl.OnObjectAvailable$VH;
    }
    public static MemoryAddress OnObjectAvailable$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnObjectAvailable$VH.get(seg);
    }
    public static void OnObjectAvailable$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnObjectAvailable$VH.set(seg, x);
    }
    public static MemoryAddress OnObjectAvailable$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.OnObjectAvailable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnObjectAvailable$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.OnObjectAvailable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnObjectAvailable OnObjectAvailable (MemorySegment segment) {
        return OnObjectAvailable.ofAddress(OnObjectAvailable$get(segment));
    }
    static final FunctionDescriptor GetBindInfoEx$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetBindInfoEx$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IBindStatusCallbackExVtbl.GetBindInfoEx$FUNC, false
    );
    public interface GetBindInfoEx {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(GetBindInfoEx fi) {
            return RuntimeHelper.upcallStub(GetBindInfoEx.class, fi, IBindStatusCallbackExVtbl.GetBindInfoEx$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetBindInfoEx fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetBindInfoEx.class, fi, IBindStatusCallbackExVtbl.GetBindInfoEx$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetBindInfoEx ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IBindStatusCallbackExVtbl.GetBindInfoEx$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindInfoEx$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetBindInfoEx")));
    public static VarHandle GetBindInfoEx$VH() {
        return IBindStatusCallbackExVtbl.GetBindInfoEx$VH;
    }
    public static MemoryAddress GetBindInfoEx$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.GetBindInfoEx$VH.get(seg);
    }
    public static void GetBindInfoEx$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackExVtbl.GetBindInfoEx$VH.set(seg, x);
    }
    public static MemoryAddress GetBindInfoEx$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IBindStatusCallbackExVtbl.GetBindInfoEx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindInfoEx$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackExVtbl.GetBindInfoEx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindInfoEx GetBindInfoEx (MemorySegment segment) {
        return GetBindInfoEx.ofAddress(GetBindInfoEx$get(segment));
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

