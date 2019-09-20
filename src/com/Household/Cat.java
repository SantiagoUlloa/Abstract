package com.Household;

public abstract class Cat implements Pet {
    public abstract String makeSound();
    public abstract String eat();
    public abstract String name();


    // Constructor:
    public Cat(String name) {
        this.name = name;
    }

}