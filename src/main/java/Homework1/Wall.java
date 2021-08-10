package Homework1;

public class Wall implements Obstacle {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }
}
