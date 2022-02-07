import org.junit.Before;
import org.junit.Test;
import people.passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before (){
        passenger = new Passenger(2, "James");

    }

    @Test
    public void hasName(){
        assertEquals("James", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
