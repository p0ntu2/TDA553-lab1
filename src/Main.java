package src;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car saab = new Saab95(2, 120, 0, Color.black, "Saab95", 0, 0, false, false);
        System.out.println(saab.getEnginePower());
    }
}