package src;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import org.junit.Test;

public class CarTransporterTest {
    
    @Test
    public void shouldReturn1() {
        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 0, 0, false, false, 2, 0, 0);
        assertEquals(1, carTransporterTest.getCurrentPlatformAngle());

    }

    @Test
    public void shouldReturnNegative1() {
        CarTransporter carTransporterTest = new CarTransporter(2, 375, 0, Color.green, "CarTransporter", 0, 0, false, false, 0, 0, 0);
        assertEquals(0, carTransporterTest.getCurrentPlatformAngle());
       // assertEquals((-1.0), carTransporterTest.getCurrentPlatformAngle(), -1.0);
    }
}
