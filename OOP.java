public class Main {
    public static void main(String[] args) {
        Unit Vasya = new Unit("jgv", 100, 100);
        System.out.println("Hello world!");
    }
}
class Unit {
    private String name;
    private int age;
    private int health;

    Unit(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }
}
class Bomzh {
    public static String name;
    public static int age;
    public static int health;

    Bomzh(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }
    System.out.println("name: + {0}", Bomzh.name);
}
