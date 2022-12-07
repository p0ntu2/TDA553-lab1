package src;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class ScaniaTest {
    
    @Test
    public void angleShouldNotBeLessThan0() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0, 70);
        testScania.anglePlatform(-5);
        assertEquals(0, testScania.getcurrentAngle());
    }

    @Test
    public void angleSHouldNotBeMoreThanMaxAngle() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 70, 70);
        testScania.anglePlatform(5);
        assertEquals(testScania.getMaxAngle(), testScania.getcurrentAngle());
    }

    @Test
    public void newAngleShouldBe65() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 70, 70);
        testScania.anglePlatform(-5);
        assertEquals(65, testScania.getcurrentAngle());
    }

    @Test
    public void cannotMovePlatformWhileMoving() {
        Scania testScania = new Scania(2, 375, 20, Color.green, "Scania", 0, 0, false, false, 0, 70);
        testScania.anglePlatform(20);
        assertEquals(0, testScania.getcurrentAngle());
    }

    @Test
    public void cannotMoveVehicleWhilePlatformIsLowered() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 70, 70);
        testScania.tryGas(0.1);
        assertEquals(0, testScania.getCurrentSpeed());
    }
}
