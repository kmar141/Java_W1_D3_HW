package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kieran on 21/06/2017.
 */

public class TrapperKeeperTest {


    TrapperKeeper trapperkeeper;

    @Before
    public void before() {
        trapperkeeper = new TrapperKeeper("Cartman", 666);
    }

    @Test
    public void canRoar() {
        assertEquals(trapperkeeper.roar(), "Hoomans!");
    }


    @Test
    public void canGetDestructiveForce() {
        assertEquals(trapperkeeper.getDestructiveForce(), 1337);
    }



}