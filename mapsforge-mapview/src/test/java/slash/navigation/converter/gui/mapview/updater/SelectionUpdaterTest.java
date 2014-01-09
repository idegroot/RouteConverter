/*
    This file is part of RouteConverter.

    RouteConverter is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    RouteConverter is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with RouteConverter; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Copyright (C) 2007 Christian Pesch. All Rights Reserved.
*/

package slash.navigation.converter.gui.mapview.updater;

import org.junit.Test;
import slash.navigation.common.NavigationPosition;
import slash.navigation.common.SimpleNavigationPosition;
import slash.navigation.converter.gui.models.PositionsModel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SelectionUpdaterTest {
    private NavigationPosition a = new SimpleNavigationPosition(1.0, 0.0);
    private NavigationPosition b = new SimpleNavigationPosition(2.0, 0.0);

    @Test
    public void testNavigationPositionEqualsAndHashCode() {
        assertEquals(a.hashCode(), a.hashCode());
        assertNotEquals(a.hashCode(), b.hashCode());
        assertEquals(a, a);
        assertNotEquals(a, b);
        Set<NavigationPosition> set = new HashSet<NavigationPosition>();
        set.add(a);
        assertTrue(set.contains(a));
        assertFalse(set.contains(b));
    }

    @Test
    public void testInitiallyEmpty() {
        PositionsModel positionsModel = mock(PositionsModel.class);
        SelectionOperation selectionOperation = mock(SelectionOperation.class);

        SelectionUpdater selectionUpdater = new SelectionUpdater(positionsModel, selectionOperation);

        assertTrue(selectionUpdater.getCurrentSelection().isEmpty());
        verify(selectionOperation, never()).add(new ArrayList<NavigationPosition>());
        verify(selectionOperation, never()).remove(new ArrayList<NavigationPosition>());
    }

    @Test
    public void testAdded() {
        PositionsModel positionsModel = mock(PositionsModel.class);
        when(positionsModel.getPosition(1)).thenReturn(a);
        SelectionOperation selectionOperation = mock(SelectionOperation.class);

        SelectionUpdater selectionUpdater = new SelectionUpdater(positionsModel, selectionOperation);
        selectionUpdater.setSelectedPositions(new int[]{1}, false);

        assertEquals(asList(a), selectionUpdater.getCurrentSelection());
        verify(selectionOperation, times(1)).add(asList(a));
        verify(selectionOperation, never()).remove(new ArrayList<NavigationPosition>());
    }

    @Test
    public void testRemoved() {
        PositionsModel positionsModel = mock(PositionsModel.class);
        when(positionsModel.getPosition(1)).thenReturn(a);
        when(positionsModel.getPosition(2)).thenReturn(b);
        SelectionOperation selectionOperation = mock(SelectionOperation.class);

        SelectionUpdater selectionUpdater = new SelectionUpdater(positionsModel, selectionOperation);
        selectionUpdater.setSelectedPositions(new int[]{1, 2}, false);

        assertEquals(asList(a, b), selectionUpdater.getCurrentSelection());
        verify(selectionOperation, times(1)).add(asList(a, b));
        verify(selectionOperation, never()).remove(new ArrayList<NavigationPosition>());

        selectionUpdater.setSelectedPositions(new int[]{1}, false);

        assertEquals(asList(a), selectionUpdater.getCurrentSelection());
        verify(selectionOperation, never()).add(new ArrayList<NavigationPosition>());
        verify(selectionOperation, times(1)).remove(asList(b));
    }

    @Test
    public void testRemovedReplaceSelection() {
        PositionsModel positionsModel = mock(PositionsModel.class);
        when(positionsModel.getPosition(1)).thenReturn(a);
        when(positionsModel.getPosition(2)).thenReturn(b);
        SelectionOperation selectionOperation = mock(SelectionOperation.class);

        SelectionUpdater selectionUpdater = new SelectionUpdater(positionsModel, selectionOperation);
        selectionUpdater.setSelectedPositions(new int[]{1, 2}, false);

        assertEquals(asList(a, b), selectionUpdater.getCurrentSelection());
        verify(selectionOperation, times(1)).add(asList(a, b));
        verify(selectionOperation, never()).remove(new ArrayList<NavigationPosition>());

        selectionUpdater.setSelectedPositions(new int[]{1, 2}, true);

        assertEquals(asList(a, b), selectionUpdater.getCurrentSelection());
        verify(selectionOperation, times(2)).add(asList(a, b));
        verify(selectionOperation, times(1)).remove(asList(a, b));
    }
}
