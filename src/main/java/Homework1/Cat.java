package Homework1;

public class Cat implements Runaway {
    private final double maxHeight = 1;
    private final double maxDistance = 700;

    public String getName() {
        return "Кот";
    }

    @Override
    public boolean TryMove(Wall wall) {
        var success = wall.getHeight() <= this.maxHeight;
        System.out.printf("Кот. Попытка перепрыгнуть %s - %s%n", wall.getHeight(), success ? "успешно" : "не успешно");
        return success;
    }

    @Override
    public boolean TryMove(Treadmill treadmill) {
        var success = treadmill.getDistance() <= this.maxDistance;
        System.out.printf("Кот. Попытка пробежать %s - %s%n", treadmill.getDistance(), success ? "успешно" : "не успешно");
        return success;
    }
}
