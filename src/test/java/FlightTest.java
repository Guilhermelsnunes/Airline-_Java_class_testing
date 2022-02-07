import flights.Flight;
import flights.Plane;
import flights.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.crew.CabinCrewMember;
import people.crew.Pilot;
import people.crew.Rank;
import people.passenger.Passenger;


import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger;
    Passenger passenger2;
    Plane plane;

    @Before
    public void before(){

        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "EDI001", "Glasgow", "Edinburgh", "12:00");
        pilot = new Pilot("John", Rank.CAPITAN, "ABCDEF");
        cabinCrewMember = new CabinCrewMember("James", Rank.FLIGHT_ATTENDANT);
        passenger = new Passenger (2, "Peter");
    }



    @Test
    public void hasPilot(){
        flight.addPilot(pilot);
        assertEquals(1, flight.getPilots().size());

    }

    @Test
    public void hasCrew(){
        flight.addCrew(cabinCrewMember);
        assertEquals(1, flight.getCrew().size());
    }

    @Test
    public void hasPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }



    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("EDI001", flight.getFlightNumber());
    }

    @Test
    public void hasDestinationAirport(){
        assertEquals("Glasgow", flight.getDestinationAirport());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("12:00", flight.getDepartureTime());
    }





    @Test
    public void hasAvailableSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(48, flight.getAvailableSeats());
    }

}
