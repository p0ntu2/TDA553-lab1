package src;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class WorkshopTest {
    
    @Test
    public void cantLoadMoreThanMaxLoad() {
        Workshop testShop = new Workshop(2, 1, 0, 0, "testShop");
        testShop.loadCars(new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false));
        testShop.loadCars(new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false));
        assertEquals(2, testShop.getCurrentLoad());
    }
}
