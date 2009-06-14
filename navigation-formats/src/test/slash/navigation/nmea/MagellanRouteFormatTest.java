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

package slash.navigation.nmea;

import slash.navigation.BaseNavigationFormat;
import slash.navigation.NavigationTestCase;
import slash.navigation.util.CompactCalendar;

import java.io.*;
import java.text.DateFormat;
import java.util.List;

public class MagellanRouteFormatTest extends NavigationTestCase {
    MagellanRouteFormat format = new MagellanRouteFormat();

    public void testIsValidLine() {
        assertTrue(format.isValidLine("$PMGNFMT,%RTE,NUM_MSG,ID,FLAG,NUM,NAME,WPT_NAME1,ICON1,WPT_NAME2,ICON2,CHKSUM ?%WPL,LAT,HEMI,LON,HEMI,ALT,UNIT,NAME,MSG,ICON,CHKSUM,%META,ASCII"));
        assertTrue(format.isValidLine("$PMGNWPL,4808.98261,N,01135.84141,E,0,M,Ifflandstrasse,,a*65"));
        assertTrue(format.isValidLine("$PMGNRTE,3,2,c,1,Muenchen_Route,Engl-Garten-2,a,Ifflandstrasse,a*1B"));
        assertTrue(format.isValidLine("$PMGNCMD,END*3D"));

        assertFalse(format.isValidLine("# Comment"));
    }

    public void testIsPosition() {
        assertTrue(format.isPosition("$PMGNWPL,4808.98261,N,01135.84141,E,0,M,Ifflandstrasse,,a*65"));

        assertFalse(format.isPosition("$PMGNRTE,3,2,c,1,Muenchen_Route,Engl-Garten-2,a,Ifflandstrasse,a*1B"));

        assertFalse(format.isPosition("$GPGGA,134012,4837.4374,N,903.4036,E,1,,,-48.0,M,,M,,*61"));
        assertFalse(format.isPosition("$GPWPL,4837.4374,N,903.4036,E,*4C"));
        assertFalse(format.isPosition("$GPRMC,134012,A,4837.4374,N,903.4036,E,,,260707,,A*5A"));
        assertFalse(format.isPosition("$GPZDA,134012,26,07,07,,*49"));

        assertFalse(format.isPosition("$GPGGA,162611,3554.2367,N,10619.4966,W,1,03,06.7,02300.3,M,-022.4,M,,*7F"));

        assertFalse(format.isPosition("$GPGGA,130441.89,5239.3154,N,00907.7011,E,1,08,1.25,16.76,M,46.79,M,,*6D"));
        assertFalse(format.isPosition("$GPGGA,130441,5239,N,00907.7011,E,1,08,1.25,16.76,M,46.79,M,,*6F"));
        assertFalse(format.isPosition("$GPGGA,140404.000,4837.5339,N,00903.4040,E,1,08,00.0,484.0,M,00.0,M,,*67"));
        assertFalse(format.isPosition("$GPGGA,140404.000,4837.5339,N,00903.4040,E,1,08,00.0,484.0,M,0,M,,*49"));
        assertFalse(format.isPosition("$GPGGA,140404.000,4837.5339,N,00903.4040,E,1,08,00.0,0,M,0,M,,*5F"));
        assertFalse(format.isPosition("$GPGGA,140404.000,4837.5339,N,00903.4040,E,1,08,0,0,M,0,M,,*71"));
        assertFalse(format.isPosition("$GPGGA,,4837.5339,N,00903.4040,E,1,08,0,0,M,0,M,,*6A"));
        assertFalse(format.isPosition("$GPGGA,175947.000,4812.0597,N,01136.4663,E,1,07,1.4,495.3,M,,,,*09"));
        assertFalse(format.isPosition("$GPRMC,140403.000,A,4837.5194,N,00903.4022,E,15.00,0.00,260707,,*3E"));
        assertFalse(format.isPosition("$GPRMC,180114,A,4808.9490,N,00928.9610,E,000.0,000.0,160607,,,A*76"));
        assertFalse(format.isPosition("$GPRMC,180114,A,4808.9490,N,00928.9610,E,000.0,000.0,160607,,,A*76"));
        assertFalse(format.isPosition("$GPRMC,180114,A,4808.9490,N,00928.9610,E,000.0,000.0,,,,A*70"));
        assertFalse(format.isPosition("$GPRMC,180114,A,4808.9490,N,00928.9610,E,000.0,,,,,A*5E"));
        assertFalse(format.isPosition("$GPRMC,180114,A,4808.9490,N,00928.9610,E,,,,,,A*70"));
        assertFalse(format.isPosition("$GPRMC,,A,4808.9490,N,00928.9610,E,,,,,,A*7D"));
        assertFalse(format.isPosition("$GPRMC,175947.000,A,4812.0597,N,01136.4663,E,0.0,163.8,010907,,,A*62"));
        assertFalse(format.isPosition("$GPZDA,032910,07,08,2004,00,00*48"));
        assertFalse(format.isPosition("$GPWPL,5334.169,N,01001.920,E,STATN1*22"));
    }

    public void testParsePMGNWPL() {
        NmeaPosition position = format.parsePosition("$PMGNWPL,4808.98261,N,01135.84141,E,54.5,M,Ifflandstrasse,,a*65");
        assertEquals(4808.98261, position.getLatitudeAsDdmm());
        assertEquals(1135.84141, position.getLongitudeAsDdmm());
        assertEquals("N", position.getNorthOrSouth());
        assertEquals("E", position.getWestOrEast());
        assertEquals(11.5973568, position.getLongitude());
        assertEquals(48.1497101, position.getLatitude());
        assertEquals(54.5, position.getElevation());
        assertNull(position.getTime());
        assertEquals("Ifflandstrasse", position.getComment());
    }
}