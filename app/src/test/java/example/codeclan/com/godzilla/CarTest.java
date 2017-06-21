package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kieran on 21/06/2017.
 */

public class CarTest {
    Car car;

    @Before
    public void before(){
        car = new Car("Sanic", 1234);
    }

    @Test
    public void canDie() {
        assertEquals(car.die(), "Vrrmmm!");
    }

}
