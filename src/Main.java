package src;

import java.util.ArrayList;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car testVolvo = new Volvo240(4, 100, 4, Color.black, "Volvo240", 3, 7, false, false);
        testVolvo.move();
        ArrayList testList = new ArrayList<>();
        testList.add(testVolvo.getX()); 
        testList.add(testVolvo.getY());
        System.out.println(testList);
    }
}

