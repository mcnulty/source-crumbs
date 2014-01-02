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

package net.sourcecrumbs.refimpl.elf.spec;

import static net.sourcecrumbs.refimpl.elf.spec.constants.DataTypeSizes.*;

import org.codehaus.preon.annotation.Bound;
import org.codehaus.preon.annotation.BoundNumber;

import net.sourcecrumbs.refimpl.elf.spec.constants.FileType;
import net.sourcecrumbs.refimpl.elf.spec.constants.MachineType;

/**
 * Header for an ELF file
 *
 * @author mcnulty
 */
public class ElfHeader {

    @Bound
    private ElfIdent ident;

    @BoundNumber(size = ElfHalf)
    private FileType fileType;

    @BoundNumber(size = ElfHalf)
    private MachineType machineType;

    @BoundNumber(size = ElfWord)
    private int version;

    @Bound
    private Address entry;

    @Bound
    private Offset programHeaderOffset;

    @Bound
    private Offset sectionHeaderOffset;

    @BoundNumber(size = ElfWord)
    private int flags;

    @BoundNumber(size = ElfHalf)
    private int headerSize;

    @BoundNumber(size = ElfHalf)
    private int programHeaderSize;

    @BoundNumber(size = ElfHalf)
    private int numProgramHeaders;

    @BoundNumber(size = ElfHalf)
    private int sectionHeaderSize;

    @BoundNumber(size = ElfHalf)
    private int numSectionHeaders;

    @BoundNumber(size = ElfHalf)
    private int sectionNameStrIndex;

    public ElfIdent getIdent() {
        return ident;
    }

    public FileType getFileType() {
        return fileType;
    }

    public MachineType getMachineType() {
        return machineType;
    }

    public int getVersion() {
        return version;
    }

    public Address getEntry() {
        return entry;
    }

    public Offset getProgramHeaderOffset() {
        return programHeaderOffset;
    }

    public Offset getSectionHeaderOffset() {
        return sectionHeaderOffset;
    }

    public int getFlags() {
        return flags;
    }

    public int getHeaderSize() {
        return headerSize;
    }

    public int getProgramHeaderSize() {
        return programHeaderSize;
    }

    public int getNumProgramHeaders() {
        return numProgramHeaders;
    }

    public int getSectionHeaderSize() {
        return sectionHeaderSize;
    }

    public int getNumSectionHeaders() {
        return numSectionHeaders;
    }

    public int getSectionNameStrIndex() {
        return sectionNameStrIndex;
    }
}