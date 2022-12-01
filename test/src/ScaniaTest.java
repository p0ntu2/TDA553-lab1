package src;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class ScaniaTest {
    
    @Test
    public void angleShouldNotBeLessThan0() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0);
        testScania.anglePlatorm(-5);
        assertEquals(0, testScania.getCurrentPlatformAngle());
    }

    @Test
    public void angleSHouldNotBeMoreThanMaxAngle() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 70);
        testScania.anglePlatorm(5);
        assertEquals(testScania.getMaxAngle(), testScania.getCurrentPlatformAngle());
    }

    @Test
    public void newAngleShouldBe5() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0);
        testScania.anglePlatorm(5);
        assertEquals(5, testScania.getCurrentPlatformAngle());
    }

    @Test
    public void cannotMovePlatformWhileMoving() {
        Scania testScania = new Scania(2, 375, 20, Color.green, "Scania", 0, 0, false, false, 70);
        testScania.anglePlatorm(-20);
        assertEquals(70, testScania.getCurrentPlatformAngle());
    }

    @Test
    public void cannotMoveVehicleWhilePlatformIsLowered() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 70);
        testScania.gas(0.1);
        assertEquals(0, testScania.getCurrentSpeed());
    }
}
