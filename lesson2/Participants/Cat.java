package lesson2.Participants;

import lesson2.Interface.Jump;
import lesson2.Interface.Run;
import lesson2.Obstacles.Treadmill;
import lesson2.Obstacles.Wall;

public class Cat implements Run, Jump {
    private final String name;
    private final int heightJump;
    private int runDistance;

    public Cat(String name, int heightJump, int runDistance) {
        this.name = name;
        this.heightJump = heightJump;
        this.runDistance = runDistance;
    }

    public Cat(String name) {
        this.name = name;
        this.heightJump = 0;
        this.runDistance = 0;
    }

    @Override
    public boolean jump(Wall wall) {
        if (heightJump >= wall.getHeight()) {
            System.out.println(getName() + " climbed over the wall");
            return true;
        } else {
            System.out.println(getName() + " dropped out");
            return false;
        }
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (runDistance >= treadmill.getDistance()) {
            runDistance -= treadmill.getDistance();
            System.out.println(getName() + " ran");
            return true;
        } else {
            System.out.println(getName() + " dropped out");
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
