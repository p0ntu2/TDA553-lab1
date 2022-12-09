package src.model;

public class Workshop extends CarLoader {
    private double x;
    private double y;
    private String name;

    public Workshop(double maxLoad, double currentLoad, double x, double y, String name) {
        super(maxLoad, currentLoad, x, y);
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String getName() {
        return this.name;
    }

}
