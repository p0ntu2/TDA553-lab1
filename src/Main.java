package src;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 1, 1, false, false, 2, 0);
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0, 70);
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        carTransporterTest.setrampDownTrue();
        carTransporterTest.loadCars(testScania);
        carTransporterTest.loadCars(testVolvo);
        List<Car> testList = new ArrayList<Car>();
        carTransporterTest.unLoadAllCars();

        System.out.println(testList);
        System.out.println(carTransporterTest.getCurrentLoadedCars());

    }
}
