import java.util.Random;

public class Die6 {
    private int value;
    
    public Die6() {
        this.roll();
    }

    public void roll() {
        value = (int) (Math.random()*6) + 1;
    }

    public int getValue() {
        return value;
    }

    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
