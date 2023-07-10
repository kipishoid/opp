package lesson2;

import lesson2.Obstacles.Obstacles;
import lesson2.Obstacles.Treadmill;
import lesson2.Obstacles.Wall;
import lesson2.Participants.Cat;
import lesson2.Participants.Human;
import lesson2.Participants.Robot;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] participants = {
                new Human("Max", 20, 700),
                new Robot("Wall-e", 30, 430),
                new Cat("Cat", 10, 500),
                new Human("Petr", 60, 300),
                new Robot("Super-robot", 70, 900),
                new Cat("Bro", 20, 400)
        };
        Obstacles[] obstacles = {
                new Treadmill("Treadmill-1", 120),
                new Wall("Wall-1", 10),
                new Treadmill("Treadmill-2", 130),
                new Wall("Wall-2", 20),
                new Treadmill("Treadmill-3", 140),
                new Wall("Wall-3", 30)
        };
        for (Object participant : participants) {
            for (Obstacles obstacle : obstacles) {
                System.out.print(obstacle.getName() + " - ");
                if (participant instanceof Human) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Human) participant).run((Treadmill) obstacle))
                            break;
                    } else {
                        if (!((Human) participant).jump((Wall) obstacle))
                            break;
                    }
                } else if (participant instanceof Cat) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Cat) participant).run((Treadmill) obstacle))
                            break;
                    } else {
                        if (!((Cat) participant).jump((Wall) obstacle))
                            break;
                    }
                } else if (participant instanceof Robot) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Robot) participant).run((Treadmill) obstacle))
                            break;
                    } else {
                        if (!((Robot) participant).jump((Wall) obstacle))
                            break;
                    }
                }
            }
            System.out.println("Congratulations, the test is passed \n");
        }
    }
}
