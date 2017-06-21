package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kieran on 21/06/2017.
 */

public class ManBearPigTest {

    ManBearPig manbearpig;

    @Before
    public void before() {
        manbearpig = new ManBearPig("Al Gore", 1000);
    }

    @Test
    public void canRoar() {
        assertEquals(manbearpig.roar(), "I'm super serial!");
    }


    @Test
    public void canGetDestructiveForce() {
        assertEquals(manbearpig.getDestructiveForce(), 1337);
    }
}
