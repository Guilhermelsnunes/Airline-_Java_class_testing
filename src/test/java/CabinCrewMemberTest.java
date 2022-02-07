import org.junit.Before;
import org.junit.Test;
import people.crew.CabinCrewMember;
import people.crew.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){

        cabinCrewMember = new CabinCrewMember("James", Rank.CAPITAN);
    }

    @Test
    public void hasName(){

        assertEquals("James", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPITAN, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){

        assertEquals("Fasten Seatbelts", cabinCrewMember.relayMessage());
    }
}
