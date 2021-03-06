/*
 * Copyright (c) 2011-2015, Dan McNulty
 * All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package net.sourcecrumbs.api.transunit;

/**
 * Represents a container for TranslationUnits
 *
 * @author mcnulty
 */
public interface TranslationUnitContainer
{
    /**
     * @return the translation units in this container
     */
    Iterable<TranslationUnit> getTranslationUnits();

    /**
     * @param pc the current PC
     *
     * @return the TranslationUnit or null if no TranslationUnit matches the specified PC
     */
    TranslationUnit getContainingTranslationUnit(long pc);
}
