package example.codeclan.com.godzilla;

/**
 * Created by Kieran on 21/06/2017.
 */

public class SkyScraper extends HumanConstructs implements Destroyable {


    public SkyScraper(String type, int healthValue) {
        super(type, healthValue);

    }

    @Override
    public String die() {
        return "Jet fuel can't melt steel beams";
    }

    @Override
    public String attack(Kaiju kaiju) {
        return "lolwut";
    }

}
