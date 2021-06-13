package de.itemis.mosig.jassuan.jscdlib.internal;

import jdk.incubator.foreign.MemoryAddress;

public class IntPointerSegment extends PointerSegment<Integer> {

    public IntPointerSegment() {
        super();
    }

    public IntPointerSegment(MemoryAddress addr) {
        super(addr);
    }

    @Override
    public Integer dereference() {
        try (var intSeg = new IntSegment(getContainedAddress())) {
            return intSeg.getValue();
        }
    }
}