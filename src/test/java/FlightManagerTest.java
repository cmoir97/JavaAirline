import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    FlightManager flightManager;

    @Before
    public void before(){
        flight = new Flight(PlaneType.LOCKHEEDL12A, 3, "edinburgh",
                "JFK", "1300");
        passenger1 = new Passenger("Cameron", 2, flight, 0);
        passenger2 = new Passenger("Cameron", 2, flight, 0);
        passenger3 = new Passenger("Cameron", 2, flight, 0);
        flightManager = new FlightManager(flight, passenger1);
    }

    @Test
    public void getBaggageWeightPerPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(100, flightManager.baggageWeightPerPassenger());
    }

    @Test
    public void getBookedBaggageWeight(){
        flight.addPassenger(passenger1);
        assertEquals(10, flightManager.bookedBaggageWeight());
    }

    @Test
    public void getRemainingBaggageWeight(){
        flight.addPassenger(passenger1);
        assertEquals(90, flightManager.remainingBaggageWeight());
    }

    @Test
    public void canBookPassengerOnFlight(){
        flightManager.bookPassengerOnFlight(passenger1, flight, 3);
        assertEquals(1, flight.passengerCount());
        assertEquals(3, passenger1.getSeatNumber());
        assertEquals(flight, passenger1.getFlight());
    }

    @Test
    public void canOnlyAssignUniqueSeatNumbers(){
        flightManager.bookPassengerOnFlight(passenger1, flight, 3);
        flightManager.bookPassengerOnFlight(passenger2, flight, 4);
        flightManager.bookPassengerOnFlight(passenger3, flight, 3);
        assertEquals(flight.getAllocatedSeatNumbers(), flight.getAllocatedSeatNumbers());
    }
}
