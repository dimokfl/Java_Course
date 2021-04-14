package geekbrains.home_work_1.obstacle;

import geekbrains.home_work_1.impl.CourseImp;

public class Runway implements CourseImp {

    private int lengthWay;

    public Runway(int lengthWay){
        this.lengthWay = lengthWay;
    }

    public int getLengthWay() {
        return lengthWay;
    }
}
