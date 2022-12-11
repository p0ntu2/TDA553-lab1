package src.modell;
import java.awt.*;

public class CarFactory {

    public static Car createVolvo(){
        return new Volvo240(4, 100, 0, Color.black, "Volvo240", 0, 0, false, false);
    }
    public static Car createSaab(){
        return new Saab95(2, 125, 0, Color.red, "Saab95", 0, 100, false, false);
    }
    public static Car createScania(){
        return new Scania(2, 375, 0, Color.green, "Scania", 0, 200, false, false, 0, 70);
    }
    public static Car createtransport(){
        return new Transport(2, 375, 0, Color.green, "Transport", 0, 300, false, false, 0, 0);
    }
    
}
