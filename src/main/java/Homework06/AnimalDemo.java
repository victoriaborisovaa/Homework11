package Homework06;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal cat = new Cat();
        Animal dog = new Dog();

        bird.play();
        cat.play();
        dog.play();

        bird.makeSomeNoise();
        cat.makeSomeNoise();
        dog.makeSomeNoise();

        Bird specific = (Bird) bird;
        specific.fly();
        specific.sing();
        specific.sing(3);
    }
}

