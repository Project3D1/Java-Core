package Homework1;

public class Robot implements Runaway {
    private final double maxHeight = 5;
    private final double maxDistance = 1000;

    public String getName() {
        return "Робот";
    }

    @Override
    public boolean TryMove(Wall wall) {
        var success = wall.getHeight() <= this.maxHeight;
        System.out.printf("Робот. Попытка перепрыгнуть %s - %s%n", wall.getHeight(), success ? "успешно" : "не успешно");
        return success;
    }

    @Override
    public boolean TryMove(Treadmill treadmill) {
        var success = treadmill.getDistance() <= this.maxDistance;
        System.out.printf("Робот. Попытка пробежать %s - %s%n", treadmill.getDistance(), success ? "успешно" : "не успешно");
        return success;
    }
}
