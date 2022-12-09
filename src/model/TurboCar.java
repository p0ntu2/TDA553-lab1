package src.model;

public class TurboCar {
    private boolean turboOn;
    private double turbo;

    public TurboCar() {
        this.turboOn = false;
        this.turbo = 1.0;
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    public boolean getTurboOn() {
        return this.turboOn;
    }

    public double getTurboValue() {
        this.turbo = 1;
        if (turboOn)
            this.turbo = 1.3;
        return this.turbo;
    }
}
