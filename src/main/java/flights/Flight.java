package flights;

import people.crew.CabinCrewMember;
import people.crew.Pilot;
import people.passenger.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destinationAirport, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.crew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public ArrayList<Pilot> getPilots(){
        return pilots;
    }



    public void addCrew (CabinCrewMember cabinCrewMember){
        this.crew.add(cabinCrewMember);
    }

    public ArrayList<CabinCrewMember> getCrew(){
        return crew;
    }



    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }


    public Plane getPlane() {
        return plane;
    }


    public String getFlightNumber(){
        return  flightNumber;
    }

    public String getDestinationAirport(){
        return destinationAirport;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }






    public int getAvailableSeats(){
        if (getPassengers().size() < plane.getPlaneType().getCapacity()) {

           return plane.getPlaneType().getCapacity() - getPassengers().size();

        } else {
            return 0;
        }

    }
}
