import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Passenger passenger1;
    Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger("Cameron", 2);
        plane = new Plane(PlaneType.BOEING757, 3, "edinburgh",
                "JFK", "1300");
    }

    @Test
    public void noPassengers(){
        assertEquals(0, plane.passengerCount());
    }
    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING757, plane.getPlaneType());
    }
}
