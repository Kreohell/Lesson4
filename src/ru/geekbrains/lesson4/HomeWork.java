package ru.geekbrains.lesson4;

public class HomeWork {
    public static void main(String[] args) {
        Employee e = new Employee("John Borisovich Goose", 80000, 30);

        System.out.printf("Employee: %s, age: %d\n",
                e.getName(), e.getAge());

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Rod Stewart", 100000, 75);
        employees[1] = new Employee("Jimmy Page", 150000, 76);
        employees[2] = new Employee("Robert Plant", 130000, 72);
        employees[3] = new Employee("Big Lebovski", 100, 47);
        employees[4] = new Employee("Young Dude", 50000, 29);

        e.oldDudes(employees);


    }
}
