import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger1;
    Flight flight;

    @Before
    public void before(){
        passenger1 = new Passenger("Cameron", 2, flight, 0);
        flight = new Flight(PlaneType.LOCKHEEDL12A, 3, "edinburgh",
                "JFK", "1300");
    }

    @Test
    public void noPassengers(){
        assertEquals(0, flight.passengerCount());
    }
    @Test
    public void planeHasType(){
        assertEquals(PlaneType.LOCKHEEDL12A, flight.getPlaneType());
    }

    @Test
    public void planeHasOtherAttributes(){
        assertEquals(3, flight.getFlightNumber());
        assertEquals("edinburgh", flight.getDestination());
        assertEquals("JFK", flight.getDepartureAirport());
        assertEquals("1300", flight.getDepartureTime());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(10, flight.numberOfAvailableSeats());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canOnlyAddUniqueSeats(){
        flight.getAllocatedSeatNumbers().add(4);
        flight.OnlyAssignUniqueSeats(passenger1, 4);
        assertEquals(1, flight.AllocatedSeatNumbersLength());
    }
}