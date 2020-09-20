package ru.geekbrains.lesson5;

public class Dog extends Animal {

    Dog(String name, int maxLengthWalks, int maxLengthSwim, float maxHeightJump){
        super(name, maxLengthWalks, maxLengthSwim, maxHeightJump);
    }

    @Override
    boolean swim(int lengthSwim){
        return lengthSwim <= maxLengthSwim;
    }

}

