import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Cameron", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Cameron", passenger1.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger1.getNumberOfBags());
    }
}
