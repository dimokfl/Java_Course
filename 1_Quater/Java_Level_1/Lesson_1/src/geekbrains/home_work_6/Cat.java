package geekbrains.home_work_6;

public class Cat extends Animal {

    private static int countCat = 0;

    public Cat(String name, String color, int age){
        super(name, color, age);
        countCat++;
    }

    @Override
    public void run(int run){
        if(run < 200) {
            System.out.println(name + " пробежал " + run + " метров.");
        } else System.out.println(name + " как и все коты может пробежать 200 метров, а он пробежал на " + (run - 200) + " метров больше и сдох((((" );
    }

    public void swim(int swim){
        System.out.println("Кот не умеет плавать!");
    }

    public static void getCountCat(){
        System.out.println("Создано " + countCat + " кот(а/ов).");
    }
}
