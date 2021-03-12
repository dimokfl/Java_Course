package geekbrains.home_work_6;

public class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int run;
    protected int swim;
    protected static int countAnimal = 0;

    Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        countAnimal++;
    }

    public void run(int run){
        System.out.println("Животное пробежало " + run + " метров.");
    }

    public void swim(int swim){
        System.out.println("Животное проплыло " + swim + " метров.");
    }

    public static void getCountAnimal(){
        System.out.println("Создано " + countAnimal + " животных.");
    }
}
