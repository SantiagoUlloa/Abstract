package com.Household;

public class Main {
    public static void main(String[] args) {
        House.Mansion Santiago = new House.Mansion(800_000, 100_000, 28, new Dog("Max"));
        House.Cottage Blanca = new House.Cottage(100_000, 50_000, 28, new Cat("Sir Paws"));
        Santiago.earnMoney();
        Santiago.pet.feed();
        Santiago.pet.groom();
        Santiago.pet.play();

        Blanca.earnMoney();
        Blanca.pet.feed();
        Blanca.pet.groom();
        Blanca.pet.play();
    }
}
