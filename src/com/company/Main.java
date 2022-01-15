package com.company;

public class Main {

    public static void main(String[] args) {
        IAnimal animal = new Dog();
        animal.doit();
        animal = new Cat();
        animal.doit();
    }
}
