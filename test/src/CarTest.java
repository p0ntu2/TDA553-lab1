package src;
import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import src.model.Car;
import src.model.Saab95;
import src.model.Volvo240;

public class CarTest {
    // Hämtar x-värdet i testVolvo som sattes till x=3 i konstruktorn
    @Test
    public void x_value_should_be_3() {
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        assertEquals(3, testVolvo.getX(), 3.0);
    }

    // Hämtar y-värdet i testVolvo som sattes till y=7 i konstruktorn
    @Test
    public void y_value_should_be_7() {
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        assertEquals(7, testVolvo.getY(), 7.0);
    }

    // Hämtar antal dörrar på testVolvo som sattes till 4 i konstruktorn
    @Test
    public void nrDoors_should_be_4() {
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        assertEquals(4, testVolvo.getNrDoors());
    }

    // Hämtar färgen från testVolvo som sattes till 'Black' i konstruktorn och sedan ändras färgen med metoden setColor till 'Red' - borde ge Color.red som svar
    @Test
    public void color_should_be_red() {
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.setColor(Color.red);
        assertEquals(Color.red, testVolvo.getColor());
    }

    // Hämtar färgen på testVolvo som sattes till 'Black' i konstruktorn
    @Test
    public void color_should_be_black() {
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        assertEquals(Color.black, testVolvo.getColor());
    }

    // Startar motorn med startEngine på testVolvo och currentSpeed bör sättas till 0.1
    @Test
    public void currentSpeed_should_be_0_1() {
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.startEngine();
        assertEquals(0.1, testVolvo.getCurrentSpeed(), 0.1);
    }

    // Ändrar hastigheten till 4 sedan rör sig bilen, listan borde bli [3.0, 11.0]
    @Test
    public void after_move_y_should_not_change_and_x_should_be_7() {
        Car testVolvo = new Volvo240(4, 100, 4, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.move();
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(testVolvo.getX()); 
        testList.add(testVolvo.getY());
        
        ArrayList<Double> trueList = new ArrayList<>();
        trueList.add(7.0); 
        trueList.add(7.0);

        assertEquals(trueList, testList);
    }

    @Test
    public void testSaab_currentSpeed_should_be_unaffected_after_gas(){
        Car testSaab = new Saab95(2, 125, 0, Color.red, "Saab95", 0, 0, false, false);
        testSaab.startEngine();
        testSaab.tryGas(1.1);
        assertEquals(0.1, testSaab.getCurrentSpeed(), 0.1);
    }
    @Test
    public void testSaab_CurrentSpeed_should_be_unaffected_after_brake(){
        Car testSaab = new Saab95(2, 125, 0, Color.red, "Saab95", 2, 5, false, false);
        testSaab.startEngine();
        testSaab.brake(-1);
        assertEquals(0.1, testSaab.getCurrentSpeed(), 0.1);

    }
    @Test
    public void testVolvo_currentSpeed_should_be_unaffected_after_gas(){
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.startEngine();
        testVolvo.tryGas(1.1);
        assertEquals(0.1, testVolvo.getCurrentSpeed(), 0.1);
    }
    @Test
    public void testVolvo_currentSpeed_should_be_unaffected_after_brake(){
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.startEngine();
        testVolvo.brake(-1);
        assertEquals(0.1, testVolvo.getCurrentSpeed(), 0.1);
    }
    
    @Test
    public void test_increment_speed_saab(){
        Car testSaab = new Saab95(2, 125, 125, Color.red, "Saab95", 2, 5, false, false);
        testSaab.tryGas(0.5);
        assertEquals(125, testSaab.getCurrentSpeed(), 125);
    }
    @Test
    public void test_decrement_speed_saab(){
        Car testSaab = new Saab95(2, 125, 0, Color.red, "Saab95", 2, 5, false, false);
        testSaab.brake(0.5);
        assertEquals(0, testSaab.getCurrentSpeed(), 0);
    }
    @Test
    public void test_increment_speed_volvo(){
        Car testVolvo = new Volvo240(4, 100, 100, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.tryGas(0.5);
        assertEquals(100, testVolvo.getCurrentSpeed(), 0.1);
    }
    @Test
    public void test_decrement_speed_volvo(){
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.brake(0.5);
        assertEquals(0, testVolvo.getCurrentSpeed(), 0.1);
    }

    @Test
    public void turn_left_should_be_true() {
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.turnLeft();
        assertTrue(testVolvo.getTurnLeft());
    }

    @Test
    public void turn_right_should_be_true() {
        Car testVolvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.turnRight();
        assertTrue(testVolvo.getTurnRight());
    }
}
