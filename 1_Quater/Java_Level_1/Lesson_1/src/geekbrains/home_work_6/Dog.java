package geekbrains.home_work_6;

public class Dog extends Animal{

    private static int countDog = 0;

    public Dog(String name, String color, int age){
        super(name, color, age);
        countDog++;
    }

    @Override
    public void run(int run){
        if(run < 500) {
            System.out.println(name + " пробежал " + run + " метров.");
        } else System.out.println(name + " как и все собаки может пробежать 500 метров, а он пробежал на " + (run - 500) + " метров больше и сдох((((" );
    }

    public void swim(int swim){
        if(swim < 10) {
            System.out.println(name + " проплыл " + swim + " метров.");
        } else System.out.println(name + " как и все собаки может проплыть 10 метров, а он проплыл на " + (swim - 10) + " метров больше и утонул((((" );
    }

    public static void getCountDog(){
        System.out.println("Создано " + countDog + " собак(и).");
    }
}
