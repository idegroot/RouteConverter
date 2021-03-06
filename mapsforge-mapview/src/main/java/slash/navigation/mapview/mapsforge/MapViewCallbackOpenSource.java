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

package slash.navigation.mapview.mapsforge;

import slash.navigation.elevation.ElevationService;
import slash.navigation.gui.models.BooleanModel;
import slash.navigation.maps.mapsforge.MapsforgeMapManager;
import slash.navigation.mapview.MapViewCallback;

/**
 * Interface for callbacks from the {@link MapsforgeMapView} to the RouteConverterOpenSource services.
 *
 * @author Christian Pesch
 */

public interface MapViewCallbackOpenSource extends MapViewCallback {
    MapsforgeMapManager getMapsforgeMapManager();

    BooleanModel getShowShadedHills();
    ElevationService getElevationService();

    void showDownloadNotification();
    void showProcessNotification();

    void handleRoutingException(Throwable t);
    void showMapException(String mapName, Exception e);
}
