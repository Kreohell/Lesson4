package ru.geekbrains.lesson5;

public class Cat extends Animal {

    Cat(String name, int maxLengthWalks, int maxLengthSwim, float maxHeightJump){
        super(name, maxLengthWalks, maxLengthSwim, maxHeightJump);
    }

    @Override
    boolean swim(int lengthSwim){
        return false;
    }

}

