/*
 * Copyright (c) 2011-2013, Dan McNulty
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *      * Redistributions of source code must retain the above copyright
 *        notice, this list of conditions and the following disclaimer.
 *      * Redistributions in binary form must reproduce the above copyright
 *        notice, this list of conditions and the following disclaimer in the
 *        documentation and/or other materials provided with the distribution.
 *      * Neither the name of the UDI project nor the
 *        names of its contributors may be used to endorse or promote products
 *        derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS AND CONTRIBUTORS BE
 *  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 */

package net.sourcecrumbs.refimpl.dwarf.entries;

import org.codehaus.preon.annotation.Bound;
import org.codehaus.preon.annotation.BoundNumber;

import net.sourcecrumbs.refimpl.dwarf.types.InitialLength;

/**
 * Header for a compilation unit in a DWARF file
 *
 * @author mcnulty
 */
public class CompilationUnitHeader {

    @Bound
    private InitialLength unitLength;

    @BoundNumber(size = "16")
    private short version;

    @BoundNumber(size = "unitLength.offsetLength")
    private long debugAbbrevOffset;

    @BoundNumber(size = "8")
    private byte addressSize;

    public long getUnitLength() {
        return unitLength.getLength();
    }

    public void setUnitLength(long unitLength) {
        this.unitLength.setLength(unitLength);
    }

    public short getVersion() {
        return version;
    }

    public void setVersion(short version) {
        this.version = version;
    }

    public long getDebugAbbrevOffset() {
        return debugAbbrevOffset;
    }

    public void setDebugAbbrevOffset(long debugAbbrevOffset) {
        this.debugAbbrevOffset = debugAbbrevOffset;
    }

    public byte getAddressSize() {
        return addressSize;
    }

    public void setAddressSize(byte addressSize) {
        this.addressSize = addressSize;
    }

    public boolean is32bitDWARF() {
        return unitLength.getOffsetLength() == 32;
    }

    public int getOffsetLength() {
        return  unitLength.getOffsetLength();
    }
}
