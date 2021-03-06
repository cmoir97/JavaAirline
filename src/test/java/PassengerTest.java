import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Flight flight;

    @Before
    public void before(){

        passenger1 = new Passenger("Cameron", 2, null, 0);
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

    @Test
    public void canGetSeatNumber(){
        assertEquals(0, passenger1.getSeatNumber());
    }

    @Test
    public void canChangeSeatNumber(){
        passenger1.assignSeatNumber(3);
        assertEquals(3, passenger1.getSeatNumber());
    }
}
