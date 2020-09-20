package ru.geekbrains.lesson5;

public class HomeWork {
    public static void main(String[] args) {

        Cat cat = new Cat("RandomCat1",300, 0, 2);
        Dog dog = new Dog("RandomDog1",500, 10, 0.5f);
        System.out.printf("Имя: %s, Пробежит: %s, Проплывет: %s, Прыгнет: %.1f\n",
                cat.name, cat.maxLengthWalks, cat.maxLengthSwim, cat.maxHeightJump);

        if(cat.move(200)) {
            System.out.println("Котик пробежал!");
        } else {
            System.out.println("Котик не смог пробежать.");
        }
        if(cat.swim(0)){
            System.out.println("Котик проплыл!");
        } else {
            System.out.println("Котик не смог проплыть (или не захотел).");
        }

        if(cat.jump(1)) {
            System.out.println("Котик прыгнул!");
        } else {
            System.out.println("Котик не смог прыгнуть.");
        }
        System.out.printf("Имя: %s, Пробежит: %s, Проплывет: %s, Прыгнет: %.1f\n",
                dog.name, dog.maxLengthWalks, dog.maxLengthSwim, dog.maxHeightJump);
        if(dog.move(400)){
            System.out.println("Песик пробежал!");
        } else {
            System.out.println("Песик не смог пробежать.");
        }
        if(dog.swim(10)){
            System.out.println("Песик проплыл!");
        } else {
            System.out.println("Песик не смог проплыть.");
        }
        if(dog.jump(1)){
            System.out.println("Песик прыгнул!");
        } else {
            System.out.println("Песик не смог прыгнуть.");
        }

    }
}

