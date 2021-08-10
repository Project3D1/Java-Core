package Homework1;

public class Treadmill implements Obstacle {
    private double distance;

    public Treadmill(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return this.distance;
    }
}
