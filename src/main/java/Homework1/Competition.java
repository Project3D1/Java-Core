package Homework1;

import java.util.ArrayList;

public class Competition {

    public static void main(String[] args) {

        var competitors = new ArrayList<Runaway>();
        competitors.add(new Human());
        competitors.add(new Cat());
        competitors.add(new Robot());


        var obstacles = new Obstacle[10];
        for (var i = 0; i < 10; i+=2) {
            obstacles[i] = new Treadmill(((i / 2) + 1) * 1000);
            obstacles[i+1] = new Wall((i / 2) + 1);
        }

        for (Obstacle obstacle: obstacles) {
            if (obstacle instanceof Wall wall) {
                TryMove(wall, competitors);
            }
            else if (obstacle instanceof Treadmill treadmill) {
                TryMove(treadmill, competitors);
            }
            System.out.println("-----------------------");
        }
    }

    private static void TryMove(Wall wall, ArrayList<Runaway> competitors) {
        for (var i = 0; i < competitors.size(); i++) {
            var competitor = competitors.get(i);
            if (!competitor.TryMove(wall)) {
                RemoveCompetitor(competitors, competitor);
                i--;
            }
        }
    }

    private static void TryMove(Treadmill treadmill, ArrayList<Runaway> competitors) {
        for (var i = 0; i < competitors.size(); i++) {
            var competitor = competitors.get(i);
            if (!competitor.TryMove(treadmill)) {
                RemoveCompetitor(competitors, competitor);
                i--;
            }
        }
    }

    private static void RemoveCompetitor(ArrayList<Runaway> competitors, Runaway competitor) {
        System.out.printf("%s уходит с дистанции%n", competitor.getName());
        competitors.remove(competitor);
    }
}

