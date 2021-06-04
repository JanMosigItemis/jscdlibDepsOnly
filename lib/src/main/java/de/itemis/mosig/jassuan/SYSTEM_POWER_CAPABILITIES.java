// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class SYSTEM_POWER_CAPABILITIES {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_CHAR.withName("PowerButtonPresent"),
        C_CHAR.withName("SleepButtonPresent"),
        C_CHAR.withName("LidPresent"),
        C_CHAR.withName("SystemS1"),
        C_CHAR.withName("SystemS2"),
        C_CHAR.withName("SystemS3"),
        C_CHAR.withName("SystemS4"),
        C_CHAR.withName("SystemS5"),
        C_CHAR.withName("HiberFilePresent"),
        C_CHAR.withName("FullWake"),
        C_CHAR.withName("VideoDimPresent"),
        C_CHAR.withName("ApmPresent"),
        C_CHAR.withName("UpsPresent"),
        C_CHAR.withName("ThermalControl"),
        C_CHAR.withName("ProcessorThrottle"),
        C_CHAR.withName("ProcessorMinThrottle"),
        C_CHAR.withName("ProcessorMaxThrottle"),
        C_CHAR.withName("FastSystemS4"),
        MemoryLayout.sequenceLayout(3, C_CHAR).withName("spare2"),
        C_CHAR.withName("DiskSpinDown"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("spare3"),
        C_CHAR.withName("SystemBatteriesPresent"),
        C_CHAR.withName("BatteriesAreShortTerm"),
        MemoryLayout.sequenceLayout(3, MemoryLayout.structLayout(
            C_LONG.withName("Granularity"),
            C_LONG.withName("Capacity")
        )).withName("BatteryScale"),
        C_INT.withName("AcOnLineWake"),
        C_INT.withName("SoftLidWake"),
        C_INT.withName("RtcWake"),
        C_INT.withName("MinDeviceWakeState"),
        C_INT.withName("DefaultLowLatencyWake")
    );
    public static MemoryLayout $LAYOUT() {
        return SYSTEM_POWER_CAPABILITIES.$struct$LAYOUT;
    }
    static final VarHandle PowerButtonPresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("PowerButtonPresent"));
    public static VarHandle PowerButtonPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH;
    }
    public static byte PowerButtonPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH.get(seg);
    }
    public static void PowerButtonPresent$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH.set(seg, x);
    }
    public static byte PowerButtonPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PowerButtonPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SleepButtonPresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("SleepButtonPresent"));
    public static VarHandle SleepButtonPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH;
    }
    public static byte SleepButtonPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH.get(seg);
    }
    public static void SleepButtonPresent$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH.set(seg, x);
    }
    public static byte SleepButtonPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SleepButtonPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LidPresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("LidPresent"));
    public static VarHandle LidPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.LidPresent$VH;
    }
    public static byte LidPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.LidPresent$VH.get(seg);
    }
    public static void LidPresent$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.LidPresent$VH.set(seg, x);
    }
    public static byte LidPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.LidPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LidPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.LidPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS1$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("SystemS1"));
    public static VarHandle SystemS1$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS1$VH;
    }
    public static byte SystemS1$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS1$VH.get(seg);
    }
    public static void SystemS1$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS1$VH.set(seg, x);
    }
    public static byte SystemS1$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS1$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS2$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("SystemS2"));
    public static VarHandle SystemS2$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS2$VH;
    }
    public static byte SystemS2$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS2$VH.get(seg);
    }
    public static void SystemS2$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS2$VH.set(seg, x);
    }
    public static byte SystemS2$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS2$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS3$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("SystemS3"));
    public static VarHandle SystemS3$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS3$VH;
    }
    public static byte SystemS3$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS3$VH.get(seg);
    }
    public static void SystemS3$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS3$VH.set(seg, x);
    }
    public static byte SystemS3$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS3$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS4$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("SystemS4"));
    public static VarHandle SystemS4$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS4$VH;
    }
    public static byte SystemS4$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS4$VH.get(seg);
    }
    public static void SystemS4$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS4$VH.set(seg, x);
    }
    public static byte SystemS4$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS4$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS5$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("SystemS5"));
    public static VarHandle SystemS5$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS5$VH;
    }
    public static byte SystemS5$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS5$VH.get(seg);
    }
    public static void SystemS5$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS5$VH.set(seg, x);
    }
    public static byte SystemS5$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS5$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HiberFilePresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("HiberFilePresent"));
    public static VarHandle HiberFilePresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH;
    }
    public static byte HiberFilePresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH.get(seg);
    }
    public static void HiberFilePresent$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH.set(seg, x);
    }
    public static byte HiberFilePresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HiberFilePresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FullWake$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("FullWake"));
    public static VarHandle FullWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.FullWake$VH;
    }
    public static byte FullWake$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.FullWake$VH.get(seg);
    }
    public static void FullWake$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.FullWake$VH.set(seg, x);
    }
    public static byte FullWake$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.FullWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FullWake$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.FullWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VideoDimPresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("VideoDimPresent"));
    public static VarHandle VideoDimPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH;
    }
    public static byte VideoDimPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH.get(seg);
    }
    public static void VideoDimPresent$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH.set(seg, x);
    }
    public static byte VideoDimPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VideoDimPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ApmPresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ApmPresent"));
    public static VarHandle ApmPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.ApmPresent$VH;
    }
    public static byte ApmPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ApmPresent$VH.get(seg);
    }
    public static void ApmPresent$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ApmPresent$VH.set(seg, x);
    }
    public static byte ApmPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ApmPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ApmPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ApmPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UpsPresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("UpsPresent"));
    public static VarHandle UpsPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.UpsPresent$VH;
    }
    public static byte UpsPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.UpsPresent$VH.get(seg);
    }
    public static void UpsPresent$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.UpsPresent$VH.set(seg, x);
    }
    public static byte UpsPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.UpsPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UpsPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.UpsPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ThermalControl$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ThermalControl"));
    public static VarHandle ThermalControl$VH() {
        return SYSTEM_POWER_CAPABILITIES.ThermalControl$VH;
    }
    public static byte ThermalControl$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ThermalControl$VH.get(seg);
    }
    public static void ThermalControl$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ThermalControl$VH.set(seg, x);
    }
    public static byte ThermalControl$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ThermalControl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ThermalControl$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ThermalControl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcessorThrottle$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ProcessorThrottle"));
    public static VarHandle ProcessorThrottle$VH() {
        return SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH;
    }
    public static byte ProcessorThrottle$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH.get(seg);
    }
    public static void ProcessorThrottle$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH.set(seg, x);
    }
    public static byte ProcessorThrottle$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessorThrottle$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcessorMinThrottle$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ProcessorMinThrottle"));
    public static VarHandle ProcessorMinThrottle$VH() {
        return SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH;
    }
    public static byte ProcessorMinThrottle$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH.get(seg);
    }
    public static void ProcessorMinThrottle$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH.set(seg, x);
    }
    public static byte ProcessorMinThrottle$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessorMinThrottle$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcessorMaxThrottle$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ProcessorMaxThrottle"));
    public static VarHandle ProcessorMaxThrottle$VH() {
        return SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH;
    }
    public static byte ProcessorMaxThrottle$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH.get(seg);
    }
    public static void ProcessorMaxThrottle$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH.set(seg, x);
    }
    public static byte ProcessorMaxThrottle$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessorMaxThrottle$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FastSystemS4$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("FastSystemS4"));
    public static VarHandle FastSystemS4$VH() {
        return SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH;
    }
    public static byte FastSystemS4$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH.get(seg);
    }
    public static void FastSystemS4$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH.set(seg, x);
    }
    public static byte FastSystemS4$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FastSystemS4$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment spare2$slice(MemorySegment seg) {
        return seg.asSlice(18, 3);
    }
    static final VarHandle DiskSpinDown$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("DiskSpinDown"));
    public static VarHandle DiskSpinDown$VH() {
        return SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH;
    }
    public static byte DiskSpinDown$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH.get(seg);
    }
    public static void DiskSpinDown$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH.set(seg, x);
    }
    public static byte DiskSpinDown$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DiskSpinDown$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment spare3$slice(MemorySegment seg) {
        return seg.asSlice(22, 8);
    }
    static final VarHandle SystemBatteriesPresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("SystemBatteriesPresent"));
    public static VarHandle SystemBatteriesPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH;
    }
    public static byte SystemBatteriesPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH.get(seg);
    }
    public static void SystemBatteriesPresent$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH.set(seg, x);
    }
    public static byte SystemBatteriesPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemBatteriesPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BatteriesAreShortTerm$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("BatteriesAreShortTerm"));
    public static VarHandle BatteriesAreShortTerm$VH() {
        return SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH;
    }
    public static byte BatteriesAreShortTerm$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH.get(seg);
    }
    public static void BatteriesAreShortTerm$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH.set(seg, x);
    }
    public static byte BatteriesAreShortTerm$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BatteriesAreShortTerm$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment BatteryScale$slice(MemorySegment seg) {
        return seg.asSlice(32, 24);
    }
    static final VarHandle AcOnLineWake$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("AcOnLineWake"));
    public static VarHandle AcOnLineWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH;
    }
    public static int AcOnLineWake$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH.get(seg);
    }
    public static void AcOnLineWake$set( MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH.set(seg, x);
    }
    public static int AcOnLineWake$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AcOnLineWake$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SoftLidWake$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SoftLidWake"));
    public static VarHandle SoftLidWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH;
    }
    public static int SoftLidWake$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH.get(seg);
    }
    public static void SoftLidWake$set( MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH.set(seg, x);
    }
    public static int SoftLidWake$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftLidWake$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RtcWake$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("RtcWake"));
    public static VarHandle RtcWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.RtcWake$VH;
    }
    public static int RtcWake$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.RtcWake$VH.get(seg);
    }
    public static void RtcWake$set( MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.RtcWake$VH.set(seg, x);
    }
    public static int RtcWake$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.RtcWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RtcWake$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.RtcWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinDeviceWakeState$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("MinDeviceWakeState"));
    public static VarHandle MinDeviceWakeState$VH() {
        return SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH;
    }
    public static int MinDeviceWakeState$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH.get(seg);
    }
    public static void MinDeviceWakeState$set( MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH.set(seg, x);
    }
    public static int MinDeviceWakeState$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinDeviceWakeState$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultLowLatencyWake$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DefaultLowLatencyWake"));
    public static VarHandle DefaultLowLatencyWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH;
    }
    public static int DefaultLowLatencyWake$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH.get(seg);
    }
    public static void DefaultLowLatencyWake$set( MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH.set(seg, x);
    }
    public static int DefaultLowLatencyWake$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultLowLatencyWake$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH.set(seg.asSlice(index*sizeof()), x);
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

