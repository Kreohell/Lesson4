package ru.geekbrains.lesson5;
//upload
public abstract class Animal {
    protected String name;
    protected int maxLengthWalks;
    protected int maxLengthSwim;
    protected float maxHeightJump;


    public Animal(String name, int maxLengthWalks, int maxLengthSwim, float maxHeightJump){
        this.name = name;
        this.maxLengthWalks = (int)(maxLengthWalks / 2 + Math.random() * maxLengthWalks);
        this.maxLengthSwim =  (int)(maxLengthSwim / 2 + Math.random() * maxLengthSwim);
        this.maxHeightJump = (float) (maxHeightJump / 2 + Math.random() * maxHeightJump);
    }

   boolean move(int lengthWalks) {
        return lengthWalks <= maxLengthWalks; }
   abstract boolean swim(int lengthSwim);
   boolean jump(int heightJump) {
       return heightJump <= maxHeightJump; }


}
