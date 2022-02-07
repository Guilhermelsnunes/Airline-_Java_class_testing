import flights.Plane;
import flights.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){

        plane = new Plane(PlaneType.BOEING747);
        }


    @Test
    public void hasCapacity(){
        assertEquals(50, plane.getPlaneType().getCapacity());
        }

    @Test
    public void hasTotal_weight(){
        assertEquals(100000, plane.getPlaneType().getTotal_weight());
        }




}
