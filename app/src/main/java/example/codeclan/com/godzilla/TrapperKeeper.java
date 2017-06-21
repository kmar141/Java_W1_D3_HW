package example.codeclan.com.godzilla;

/**
 * Created by Kieran on 21/06/2017.
 */

public class TrapperKeeper extends Kaiju implements Attack{

    public TrapperKeeper(String name, int healthValue){
        super(name, healthValue);
    }

    @Override
    public int getDestructiveForce() {
        return 1337;
    }

    @Override
    public String roar() {
        return "Hoomans!";
    }
}
