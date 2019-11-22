import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Passenger passenger1;
    FlightManager flightManager;

    @Before
    public void before(){
        flight = new Flight(PlaneType.BOEING757, 3, "edinburgh",
                "JFK", "1300");
        passenger1 = new Passenger("Cameron", 2);
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
}
