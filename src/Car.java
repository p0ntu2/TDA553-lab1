package src;
import java.awt.*;

public abstract class Car implements Movable {
    final private int nrDoors; // Number of doors on the car
    final private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    final private String modelName; // The car model name
    private double x;
    private double y;
    private boolean turnLeft, turnRight;

    public Car(int doors, double power, double speed, Color caColor, String name, double x, double y, boolean left,
            boolean right) {
        this.nrDoors = doors;
        this.enginePower = power;
        this.currentSpeed = speed;
        this.color = caColor;
        this.modelName = name;
        this.x = x;
        this.y = y;
        this.turnLeft = left;
        this.turnRight = right;
    }

    public int getNrDoors() {
        return this.nrDoors;
    }

    public double getEnginePower() {
        return this.enginePower;
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    private void setCurrentSpeed(double ammount) {
        this.currentSpeed = ammount;
    }

    public String getName(){
        return this.modelName;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color clr) {
        this.color = clr;
    }

    public void startEngine() {
        this.currentSpeed = 0.1;
    }

    public void stopEngine() {
        this.currentSpeed = 0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double ammount) {
        this.x += ammount;
    }

    public void setY(double ammount) {
        this.y += ammount;
    }

    public void turnLeft() {
        this.turnRight = false;
        this.turnLeft = true;
    }
    
    public boolean  getTurnLeft() {
        return this.turnLeft;
    }

    public void turnRight() {
        this.turnLeft = false;
        this.turnRight = true;
    }
    
    public boolean getTurnRight() {
        return this.turnRight;
    }
    
    public boolean getTurnRight() {
        return this.turnRight;
    }

    public void move() {
        if (this.turnLeft == true) {
            setX(-getCurrentSpeed());
            setY(getCurrentSpeed());

        } else if (this.turnRight == true) {
            setX(getCurrentSpeed());
            setY(getCurrentSpeed());
        } else {
            setY(getCurrentSpeed());
        }
    }

    public void gas(double amount) {
        try {
            if (amount <= 0 || amount >= 1) {
                throw new Exception();
            } else {
                incrementSpeed(amount);
            }

        } catch (Exception e) {
            System.out.println("impossible amount");
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        try {
            if (amount <= 0 || amount >= 1) {
                throw new Exception();
            } else {
                decrementSpeed(amount);

            }
        } catch (Exception e) {
            System.out.println("impossible amount");

        }
    }
    private void incrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() >= getEnginePower()) {
                throw new Exception();
            } else {
                setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
            }

        } catch (Exception e) {
            System.out.println("the car is already at max speed");
            setCurrentSpeed(getEnginePower());
        }

    }

    private void decrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() <= 0) {
                throw new Exception();
            } else {
                setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
            }

        } catch (Exception e) {
            System.out.println("the car is already still");
            setCurrentSpeed(0);
        }

    }

    abstract double speedFactor();

    // TODO fix this method according to lab pm

}