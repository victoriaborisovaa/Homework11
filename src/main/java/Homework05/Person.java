package Homework05;

public class Person {
    String name;
    int age;
    boolean isMan;

    Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }
     void showPersonInfo() {
         System.out.println("Name: " + name);
         System.out.println("Years old:" + age);
         System.out.println("Gender:" + isMan);
     }
}
