package com.Household;


    public class Cat extends PetBuilder {

        public Cat(String name) {
            super(name);
        }
        @Override
        public String feed(){
            return "I love cat food";
        }
        @Override
        public String groom(){
            return "Meow, I feel clean";
        }
        @Override
        public String play(){
            return "I dont play!";

        }


    }

