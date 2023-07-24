package Homework06;

class Bird extends Animal {
    @Override
    void play() {
        fly();
    }

    void fly() {
        System.out.println("The bird is flying");
    }
    void sing() {
        System.out.println("The bird is singing");
    }
    void sing(int numberOfBirds) {
        System.out.println( numberOfBirds + " birds are singing together");
    }
}
