package src;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car saab = new Saab95(2, 120, 0, Color.black, "Saab95", 0, 0, false, false);
        saab.setCurrentSpeed(0);
        saab.decrementSpeed(0.000001);
        System.out.println(saab.getCurrentSpeed());
    }
}
