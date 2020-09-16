package ru.geekbrains.lesson4;

public class Employee {
    private String name;
    private int salary;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAge(){
        return age;
    }

    public Employee(String name, int salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;

    }
        //Выводим в консоль всех кто старше 40 лет
    public void oldDudes(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 40) System.out.println(array[i].getName());
        }
    }
        // Повышаем зарплату
    public int upSalary(int salary) {
        return getSalary() + 5000;
    }
    public void increaseSalary(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 45) upSalary(salary);
        }
    }
        // среднее арифметическое
    public void arithmetic(Employee[] array){
        for (int i = 0; i < array.length; i++) {
            i = (array[i].getAge() + array[i].getSalary()) / 2;
        }
        }

}
