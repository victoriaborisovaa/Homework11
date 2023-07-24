package Homework06;

abstract class Animal implements IAnimal {
    abstract void play();

    @Override
    public void makeSomeNoise() {
        System.out.println("Animals, make some noise!");
    }
}
