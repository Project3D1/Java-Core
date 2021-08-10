package Homework1;

public class Human implements Runaway {
    private final double maxHeight = 2;
    private final double maxDistance = 300;

    public String getName() {
        return "Человек";
    }

    @Override
    public boolean TryMove(Wall wall) {
        var success = wall.getHeight() <= this.maxHeight;
        System.out.printf("Человек. Попытка перепрыгнуть %s - %s%n", wall.getHeight(), success ? "успешно" : "не успешно");
        return success;
    }

    @Override
    public boolean TryMove(Treadmill treadmill) {
        var success = treadmill.getDistance() <= this.maxDistance;
        System.out.printf("Человек. Попытка пробежать %s - %s%n", treadmill.getDistance(), success ? "успешно" : "не успешно");
        return success;
    }
}
