// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1130 {

    static final FunctionDescriptor IXMLDOMParseError_get_errorCode_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMParseError_get_errorCode_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMParseError_get_errorCode_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1130.IXMLDOMParseError_get_errorCode_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMParseError_get_url_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMParseError_get_url_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMParseError_get_url_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1130.IXMLDOMParseError_get_url_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMParseError_get_url_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMParseError_get_url_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMParseError_get_url_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1130.IXMLDOMParseError_get_url_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMParseError_get_reason_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMParseError_get_reason_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMParseError_get_reason_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1130.IXMLDOMParseError_get_reason_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMParseError_get_reason_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMParseError_get_reason_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMParseError_get_reason_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1130.IXMLDOMParseError_get_reason_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMParseError_get_srcText_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMParseError_get_srcText_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMParseError_get_srcText_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1130.IXMLDOMParseError_get_srcText_Proxy$FUNC, false
    );
}

