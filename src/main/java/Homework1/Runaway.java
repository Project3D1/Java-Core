package Homework1;

public interface Runaway {

    String getName();

    boolean TryMove(Wall wall);

    boolean TryMove(Treadmill treadmill);
}
