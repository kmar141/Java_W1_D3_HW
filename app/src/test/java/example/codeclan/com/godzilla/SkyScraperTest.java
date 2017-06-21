package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class SkyScraperTest {
    SkyScraper skyscraper;


    @Before
    public void before(){
        skyscraper = new SkyScraper("Tower", 911);
    }

    @Test
    public void canDie() {
        assertEquals(skyscraper.die(), "Jet fuel can't melt steel beams");
    }

    }




