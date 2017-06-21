package example.codeclan.com.godzilla;

/**
 * Created by Kieran on 21/06/2017.
 */

public class Car extends HumanConstructs implements Destroyable {

    public Car(String type, int healthValue) {
        super(type, healthValue);
    }

    @Override
    public String die() {
        return "Vrrmmm!";
    }

    @Override
    public String attack(Kaiju kaiju) {
        return "Gotta go fast!";

    }
}
