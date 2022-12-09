package src;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        for (Car car : cars) {
            car.move();
            int x = (int) Math.round(car.getX());
            int y = (int) Math.round(car.getY());
            frame.drawPanel.moveit(x, y);
            // repaint() calls the paintComponent method of the panel
            frame.drawPanel.repaint();
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Car car : cars) {
            car.tryGas(gas);
        }
    }
}
