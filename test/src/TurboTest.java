package src;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.awt.*;

public class TurboTest {
    
    @Test
    public void turboShouldBeOn() {
        TurboCar testTurbo = new TurboCar();
        testTurbo.setTurboOn();
        assertTrue(testTurbo.getTurboOn());
    }

    @Test
    public void turboShouldBeOff() {
        TurboCar testTurbo = new TurboCar();
        assertFalse(testTurbo.getTurboOn());
    }

    @Test
    public void turboShouldBeOnAndValueShouldBe1_3() {
        TurboCar testTurbo = new TurboCar();
        testTurbo.setTurboOn();
        assertEquals(1.3, testTurbo.getTurboValue());
    }
}
