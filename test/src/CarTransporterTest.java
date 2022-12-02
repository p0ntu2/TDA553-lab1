package src;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CarTransporterTest {
    
    @Test
    public void shouldReturnTrue() {
        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 0, 0, false, false, 0, 0);
        carTransporterTest.setrampDownTrue();
        assertTrue(carTransporterTest.getRampPosition());

    }

    @Test
    public void shouldReturnNegative1() {
        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 0, 0, false, false, 0, 0);
        assertFalse(carTransporterTest.getRampPosition());
       // assertEquals((-1.0), carTransporterTest.getCurrentPlatformAngle(), -1.0);
    }

    @Test
    public void canLoadCars() {
        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 1, 1, false, false, 1, 0);
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0, 70);
        carTransporterTest.setrampDownTrue();
        carTransporterTest.loadCars(testScania);
        List<Car> testList = new ArrayList<Car>();
        testList.add(testScania);
        assertEquals(testList, carTransporterTest.getCurrentLoadedCars());
    }

    @Test
    public void canUnloadCars() {
        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 1, 1, false, false, 2, 0);
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0, 70);
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        carTransporterTest.setrampDownTrue();
        carTransporterTest.loadCars(testScania);
        carTransporterTest.loadCars(testVolvo);
        List<Car> testList = new ArrayList<Car>();
        testList.add(testScania);
        carTransporterTest.unLoadCar();
        assertEquals(testList, carTransporterTest.getCurrentLoadedCars());
    }

    @Test
    public void canUnloadAllCars() {
        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 1, 1, false, false, 2, 0);
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0, 70);
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        carTransporterTest.setrampDownTrue();
        carTransporterTest.loadCars(testScania);
        carTransporterTest.loadCars(testVolvo);
        List<Car> testList = new ArrayList<Car>();
        carTransporterTest.unLoadAllCars();
        assertEquals(testList, carTransporterTest.getCurrentLoadedCars());
    }


}
