package src.model;

import java.awt.*;

public class CarFactory {

    public static Volvo240 createVolvoCar() {
        return new Volvo240(4, 100, 0, Color.black, "Volvo240", 0, 0, false, false);
    }

    public static Saab95 createSaabCar() {
        return new Saab95(2, 125, 0, Color.red, "Saab95", 0, 0, false, false);
    }

    public static Scania createScaniaCar() {
        return new Scania(2, 375, 0, Color.yellow, "Scania", 0, 0, false, false, 0, 70);
    }

    public static Transport createTransporterCar() {
        return new Transport(2, 375, 0, Color.blue, "CarTransporter", 0, 0, false, false, 4, 0);
    }
}

