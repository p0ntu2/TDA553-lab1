package src;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Saab95 saab = new Saab95(2, 120, 0, Color.red, "Saab95", 0, 0, false, false);
        Volvo240 vovlo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 0, 0, false, false);
        Scania scania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0);

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(vovlo); cars.add(saab); cars.add(scania);

        for(Car p : cars) {
            p.brake(0);
        }



        scania.gas(0.1);
        System.out.println(scania.getCurrentPlatformAngle());

        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 0, 0, false, false, 0, 0, 0);

    }
}
