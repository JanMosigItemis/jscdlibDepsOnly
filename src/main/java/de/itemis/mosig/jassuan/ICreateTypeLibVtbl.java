// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class ICreateTypeLibVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("CreateTypeInfo"),
        C_POINTER.withName("SetName"),
        C_POINTER.withName("SetVersion"),
        C_POINTER.withName("SetGuid"),
        C_POINTER.withName("SetDocString"),
        C_POINTER.withName("SetHelpFileName"),
        C_POINTER.withName("SetHelpContext"),
        C_POINTER.withName("SetLcid"),
        C_POINTER.withName("SetLibFlags"),
        C_POINTER.withName("SaveAllChanges")
    ).withName("ICreateTypeLibVtbl");
    public static MemoryLayout $LAYOUT() {
        return ICreateTypeLibVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ICreateTypeLibVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ICreateTypeLibVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)ICreateTypeLibVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return ICreateTypeLibVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ICreateTypeLibVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ICreateTypeLibVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ICreateTypeLibVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return ICreateTypeLibVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, ICreateTypeLibVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, ICreateTypeLibVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ICreateTypeLibVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return ICreateTypeLibVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor CreateTypeInfo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle CreateTypeInfo$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.CreateTypeInfo$FUNC, false
    );
    public interface CreateTypeInfo {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(CreateTypeInfo fi) {
            return RuntimeHelper.upcallStub(CreateTypeInfo.class, fi, ICreateTypeLibVtbl.CreateTypeInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(CreateTypeInfo fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(CreateTypeInfo.class, fi, ICreateTypeLibVtbl.CreateTypeInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static CreateTypeInfo ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)ICreateTypeLibVtbl.CreateTypeInfo$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateTypeInfo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("CreateTypeInfo")));
    public static VarHandle CreateTypeInfo$VH() {
        return ICreateTypeLibVtbl.CreateTypeInfo$VH;
    }
    public static MemoryAddress CreateTypeInfo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.CreateTypeInfo$VH.get(seg);
    }
    public static void CreateTypeInfo$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.CreateTypeInfo$VH.set(seg, x);
    }
    public static MemoryAddress CreateTypeInfo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.CreateTypeInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateTypeInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.CreateTypeInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateTypeInfo CreateTypeInfo (MemorySegment segment) {
        return CreateTypeInfo.ofAddress(CreateTypeInfo$get(segment));
    }
    static final FunctionDescriptor SetName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetName$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.SetName$FUNC, false
    );
    public interface SetName {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(SetName fi) {
            return RuntimeHelper.upcallStub(SetName.class, fi, ICreateTypeLibVtbl.SetName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetName fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetName.class, fi, ICreateTypeLibVtbl.SetName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetName ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetName$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetName")));
    public static VarHandle SetName$VH() {
        return ICreateTypeLibVtbl.SetName$VH;
    }
    public static MemoryAddress SetName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetName$VH.get(seg);
    }
    public static void SetName$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetName$VH.set(seg, x);
    }
    public static MemoryAddress SetName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetName$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetName SetName (MemorySegment segment) {
        return SetName.ofAddress(SetName$get(segment));
    }
    static final FunctionDescriptor SetVersion$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle SetVersion$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;SS)I",
        ICreateTypeLibVtbl.SetVersion$FUNC, false
    );
    public interface SetVersion {

        int apply(jdk.incubator.foreign.MemoryAddress x0, short x1, short x2);
        static MemoryAddress allocate(SetVersion fi) {
            return RuntimeHelper.upcallStub(SetVersion.class, fi, ICreateTypeLibVtbl.SetVersion$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;SS)I");
        }
        static MemoryAddress allocate(SetVersion fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetVersion.class, fi, ICreateTypeLibVtbl.SetVersion$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;SS)I", scope);
        }
        static SetVersion ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, short x1, short x2) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetVersion$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetVersion$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetVersion")));
    public static VarHandle SetVersion$VH() {
        return ICreateTypeLibVtbl.SetVersion$VH;
    }
    public static MemoryAddress SetVersion$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetVersion$VH.get(seg);
    }
    public static void SetVersion$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetVersion$VH.set(seg, x);
    }
    public static MemoryAddress SetVersion$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetVersion$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetVersion SetVersion (MemorySegment segment) {
        return SetVersion.ofAddress(SetVersion$get(segment));
    }
    static final FunctionDescriptor SetGuid$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetGuid$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.SetGuid$FUNC, false
    );
    public interface SetGuid {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(SetGuid fi) {
            return RuntimeHelper.upcallStub(SetGuid.class, fi, ICreateTypeLibVtbl.SetGuid$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetGuid fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetGuid.class, fi, ICreateTypeLibVtbl.SetGuid$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetGuid ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetGuid$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetGuid$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetGuid")));
    public static VarHandle SetGuid$VH() {
        return ICreateTypeLibVtbl.SetGuid$VH;
    }
    public static MemoryAddress SetGuid$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetGuid$VH.get(seg);
    }
    public static void SetGuid$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetGuid$VH.set(seg, x);
    }
    public static MemoryAddress SetGuid$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetGuid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetGuid$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetGuid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetGuid SetGuid (MemorySegment segment) {
        return SetGuid.ofAddress(SetGuid$get(segment));
    }
    static final FunctionDescriptor SetDocString$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetDocString$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.SetDocString$FUNC, false
    );
    public interface SetDocString {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(SetDocString fi) {
            return RuntimeHelper.upcallStub(SetDocString.class, fi, ICreateTypeLibVtbl.SetDocString$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetDocString fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetDocString.class, fi, ICreateTypeLibVtbl.SetDocString$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetDocString ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetDocString$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetDocString$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetDocString")));
    public static VarHandle SetDocString$VH() {
        return ICreateTypeLibVtbl.SetDocString$VH;
    }
    public static MemoryAddress SetDocString$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetDocString$VH.get(seg);
    }
    public static void SetDocString$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetDocString$VH.set(seg, x);
    }
    public static MemoryAddress SetDocString$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetDocString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetDocString$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetDocString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetDocString SetDocString (MemorySegment segment) {
        return SetDocString.ofAddress(SetDocString$get(segment));
    }
    static final FunctionDescriptor SetHelpFileName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetHelpFileName$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.SetHelpFileName$FUNC, false
    );
    public interface SetHelpFileName {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(SetHelpFileName fi) {
            return RuntimeHelper.upcallStub(SetHelpFileName.class, fi, ICreateTypeLibVtbl.SetHelpFileName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetHelpFileName fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetHelpFileName.class, fi, ICreateTypeLibVtbl.SetHelpFileName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetHelpFileName ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetHelpFileName$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetHelpFileName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetHelpFileName")));
    public static VarHandle SetHelpFileName$VH() {
        return ICreateTypeLibVtbl.SetHelpFileName$VH;
    }
    public static MemoryAddress SetHelpFileName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetHelpFileName$VH.get(seg);
    }
    public static void SetHelpFileName$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetHelpFileName$VH.set(seg, x);
    }
    public static MemoryAddress SetHelpFileName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetHelpFileName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetHelpFileName$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetHelpFileName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetHelpFileName SetHelpFileName (MemorySegment segment) {
        return SetHelpFileName.ofAddress(SetHelpFileName$get(segment));
    }
    static final FunctionDescriptor SetHelpContext$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SetHelpContext$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        ICreateTypeLibVtbl.SetHelpContext$FUNC, false
    );
    public interface SetHelpContext {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(SetHelpContext fi) {
            return RuntimeHelper.upcallStub(SetHelpContext.class, fi, ICreateTypeLibVtbl.SetHelpContext$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(SetHelpContext fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetHelpContext.class, fi, ICreateTypeLibVtbl.SetHelpContext$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static SetHelpContext ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetHelpContext$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetHelpContext$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetHelpContext")));
    public static VarHandle SetHelpContext$VH() {
        return ICreateTypeLibVtbl.SetHelpContext$VH;
    }
    public static MemoryAddress SetHelpContext$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetHelpContext$VH.get(seg);
    }
    public static void SetHelpContext$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetHelpContext$VH.set(seg, x);
    }
    public static MemoryAddress SetHelpContext$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetHelpContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetHelpContext$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetHelpContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetHelpContext SetHelpContext (MemorySegment segment) {
        return SetHelpContext.ofAddress(SetHelpContext$get(segment));
    }
    static final FunctionDescriptor SetLcid$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SetLcid$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        ICreateTypeLibVtbl.SetLcid$FUNC, false
    );
    public interface SetLcid {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(SetLcid fi) {
            return RuntimeHelper.upcallStub(SetLcid.class, fi, ICreateTypeLibVtbl.SetLcid$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(SetLcid fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetLcid.class, fi, ICreateTypeLibVtbl.SetLcid$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static SetLcid ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetLcid$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetLcid$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetLcid")));
    public static VarHandle SetLcid$VH() {
        return ICreateTypeLibVtbl.SetLcid$VH;
    }
    public static MemoryAddress SetLcid$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetLcid$VH.get(seg);
    }
    public static void SetLcid$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetLcid$VH.set(seg, x);
    }
    public static MemoryAddress SetLcid$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetLcid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetLcid$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetLcid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetLcid SetLcid (MemorySegment segment) {
        return SetLcid.ofAddress(SetLcid$get(segment));
    }
    static final FunctionDescriptor SetLibFlags$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetLibFlags$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        ICreateTypeLibVtbl.SetLibFlags$FUNC, false
    );
    public interface SetLibFlags {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(SetLibFlags fi) {
            return RuntimeHelper.upcallStub(SetLibFlags.class, fi, ICreateTypeLibVtbl.SetLibFlags$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(SetLibFlags fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetLibFlags.class, fi, ICreateTypeLibVtbl.SetLibFlags$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static SetLibFlags ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SetLibFlags$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetLibFlags$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetLibFlags")));
    public static VarHandle SetLibFlags$VH() {
        return ICreateTypeLibVtbl.SetLibFlags$VH;
    }
    public static MemoryAddress SetLibFlags$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetLibFlags$VH.get(seg);
    }
    public static void SetLibFlags$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SetLibFlags$VH.set(seg, x);
    }
    public static MemoryAddress SetLibFlags$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SetLibFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetLibFlags$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SetLibFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetLibFlags SetLibFlags (MemorySegment segment) {
        return SetLibFlags.ofAddress(SetLibFlags$get(segment));
    }
    static final FunctionDescriptor SaveAllChanges$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle SaveAllChanges$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ICreateTypeLibVtbl.SaveAllChanges$FUNC, false
    );
    public interface SaveAllChanges {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(SaveAllChanges fi) {
            return RuntimeHelper.upcallStub(SaveAllChanges.class, fi, ICreateTypeLibVtbl.SaveAllChanges$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SaveAllChanges fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SaveAllChanges.class, fi, ICreateTypeLibVtbl.SaveAllChanges$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SaveAllChanges ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ICreateTypeLibVtbl.SaveAllChanges$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SaveAllChanges$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SaveAllChanges")));
    public static VarHandle SaveAllChanges$VH() {
        return ICreateTypeLibVtbl.SaveAllChanges$VH;
    }
    public static MemoryAddress SaveAllChanges$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SaveAllChanges$VH.get(seg);
    }
    public static void SaveAllChanges$set( MemorySegment seg, MemoryAddress x) {
        ICreateTypeLibVtbl.SaveAllChanges$VH.set(seg, x);
    }
    public static MemoryAddress SaveAllChanges$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ICreateTypeLibVtbl.SaveAllChanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SaveAllChanges$set(MemorySegment seg, long index, MemoryAddress x) {
        ICreateTypeLibVtbl.SaveAllChanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SaveAllChanges SaveAllChanges (MemorySegment segment) {
        return SaveAllChanges.ofAddress(SaveAllChanges$get(segment));
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

