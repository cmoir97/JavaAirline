import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Flight flight;

    @Before
    public void before(){

        passenger1 = new Passenger("Cameron", 2, null);
        flight = new Flight(PlaneType.LOCKHEEDL12A, 3, "edinburgh",
                "JFK", "1300");
    }

    @Test
    public void canGetName(){
        assertEquals("Cameron", passenger1.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger1.getNumberOfBags());
    }

    @Test
    public void canAssignFlight(){
        flight.addPassenger(passenger1);
        passenger1.assignFlight(flight);
        assertEquals(flight, passenger1.getFlight());
    }
}
