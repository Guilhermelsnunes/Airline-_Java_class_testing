import org.junit.Before;
import org.junit.Test;
import people.crew.Pilot;
import people.crew.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Anna", Rank.CAPITAN, "AB1234" );
    }

    @Test
    public void hasName(){
        assertEquals("Anna", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPITAN, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber(){
        assertEquals("AB1234", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyThePlane(){
        assertEquals("Brum Brum", pilot.flyThePlane());
    }
}
