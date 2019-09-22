package com.Household;

public class Dog extends PetBuilder {


    public Dog(String name) {
        super(name);
    }
    @Override
    public String feed(){
        return "Give me food!";
    }
    @Override
    public String groom(){
    return "Woof, I feel clean";
    }
    @Override
    public String play(){ return "Fetching ball yay!"; }


}

