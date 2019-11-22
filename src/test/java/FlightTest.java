import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger1;
    Flight flight;

    @Before
    public void before(){
        passenger1 = new Passenger("Cameron", 2);
        flight = new Flight(PlaneType.BOEING757, 3, "edinburgh",
                "JFK", "1300");
    }

    @Test
    public void noPassengers(){
        assertEquals(0, flight.passengerCount());
    }
    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING757, flight.getPlaneType());
    }

    @Test
    public void planeHasOtherAttributes(){
        assertEquals(3, flight.getFlightNumber());
        assertEquals("edinburgh", flight.getDestination());
        assertEquals("JFK", flight.getDepartureAirport());
        assertEquals("1300", flight.getDepartureTime());
    }
}