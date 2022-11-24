package src;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class ScaniaTest {
    
    @Test
    public void angleShouldNotBeLessThanZeroNorMoreThan70() {
        Scania testScania = new Scania(2, 375, 0, Color.green, "Scania", 0, 0, false, false, 0);
        testScania.anglePlatorm(-5);
        assertEquals(0, testScania.getCurrentPlatformAngle());
    }
}
