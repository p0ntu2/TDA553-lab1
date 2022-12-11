package src.view;

import javax.swing.*;

import java.awt.*;

/**
 * This class represents the full view of the MVC pattern of your car simulator.
 * It initializes with being center on the screen and attaching it's controller in it's state.
 * It communicates with the Controller by calling methods of it when an action fires of in
 * each of it's components.
 * TODO: Write more actionListeners and wire the rest of the buttons
 **/

public class CarView extends JFrame{
    private static int x;
    private static int y;
    DrawPanel drawPanel;

    // The controller member



    // JPanel controlPanel = new JPanel();

    // JPanel gasPanel = new JPanel();
    // JSpinner gasSpinner = new JSpinner();
    // int gasAmount = 0;
    // JLabel gasLabel = new JLabel("Amount of gas");

    // JButton gasButton = new JButton("Gas");
    // JButton brakeButton = new JButton("Brake");
    // JButton turboOnButton = new JButton("Saab Turbo on");
    // JButton turboOffButton = new JButton("Saab Turbo off");
    // JButton liftBedButton = new JButton("Scania Lift Bed");
    // JButton lowerBedButton = new JButton("Lower Lift Bed");

    // JButton startButton = new JButton("Start all cars");
    // JButton stopButton = new JButton("Stop all cars");

    // Constructor
    public CarView(String framename,int x, int y ){ //CarController cc
        //this.carC = new CarController();
        this.x = x;
        this.y = y;
        this.drawPanel = new DrawPanel(this.x, this.y-240);
        initComponents(framename);
        }
        private void initComponents(String title){
        this.setTitle(title);
        this.setPreferredSize(new Dimension(x,y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        this.add(drawPanel);

    // Sets everything in place and fits everything
    // TODO: Take a good look and make sure you understand how these methods and components work
   
        // Make the frame pack all it's components by respecting the sizes if possible.
        this.pack();

        // Get the computer screen resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Center the frame
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // Make the frame visible
        this.setVisible(true);
        // Make sure the frame exits when "x" is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void moveVolvo(int x, int y) {
        drawPanel.moveVolvo(x, y);
    }

    public void moveSaab(int x, int y) {
        drawPanel.moveSaab(x, y);
    }

    public void moveScania(int x, int y) {
        drawPanel.moveScania(x, y);
    }
}