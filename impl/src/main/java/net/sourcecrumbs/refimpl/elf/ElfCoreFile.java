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

package net.sourcecrumbs.refimpl.elf;

import net.sourcecrumbs.api.debug.symbols.Function;
import net.sourcecrumbs.api.files.CoreFile;
import net.sourcecrumbs.api.machinecode.MachineCodeMapping;
import net.sourcecrumbs.api.symbols.Symbol;
import net.sourcecrumbs.api.transunit.TranslationUnit;
import net.sourcecrumbs.api.debug.symbols.Variable;
import net.sourcecrumbs.refimpl.elf.spec.ElfFile;

/**
 * High-level abstraction of an ELF core file
 *
 * @author mcnulty
 */
public class ElfCoreFile extends CoreFile implements ELF {

    private final ElfFile elfFile;

    public ElfCoreFile(ElfFile elfFile) {
        this.elfFile = elfFile;
    }

    @Override
    public MachineCodeMapping getMachineCodeMapping() {
        return null;
    }

    @Override
    public Iterable<Symbol> getSymbols() {
        return null;
    }

    @Override
    public Symbol getSymbol(String name)
    {
        return null;
    }

    @Override
    public Iterable<TranslationUnit> getTranslationUnits() {
        return null;
    }

    @Override
    public ElfFile getElfFile() {
        return elfFile;
    }

    @Override
    public Iterable<Variable> getGlobalVariables()
    {
        return null;
    }

    @Override
    public Variable getGlobalVariable(String name)
    {
        return null;
    }

    @Override
    public Iterable<Function> getFunctions()
    {
        return null;
    }

    @Override
    public Function getFunction(String name)
    {
        return null;
    }

    @Override
    public Function getContainingFunction(long pc)
    {
        return null;
    }
}
