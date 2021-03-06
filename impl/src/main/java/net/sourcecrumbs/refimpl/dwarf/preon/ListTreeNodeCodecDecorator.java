/*
 * Copyright (c) 2011-2015, Dan McNulty
 * All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package net.sourcecrumbs.refimpl.dwarf.preon;

import java.lang.reflect.AnnotatedElement;

import org.codehaus.preon.Codec;
import org.codehaus.preon.CodecDecorator;
import org.codehaus.preon.ResolverContext;

/**
 * Provides a codec decorator to construct a tree stored in prefix order as a list
 *
 * @author mcnulty
 */
public class ListTreeNodeCodecDecorator implements CodecDecorator {

    @Override
    public <T> Codec<T> decorate(Codec<T> codec, AnnotatedElement metadata, Class<T> type, ResolverContext context) {
        if (ListTreeNode.class.isAssignableFrom(type)) {
            return new ListTreeNodeCodec(codec);
        }
        return codec;
    }
}
