package geekbrains.home_work_1.obstacle;

import geekbrains.home_work_1.impl.CourseImp;

public class Wall implements CourseImp {

    private int heightWall;

    public Wall(int heightWall){
        this.heightWall = heightWall;
    }

    public int getHeightWall() {
        return heightWall;
    }
}
