package com.Household;

public abstract class House {
    public abstract int income;
    public abstract int taxes;
    public abstract boolean hasPets;



    //constructor
    public House(int income, int taxes, boolean hasPets) {
        this.income = income;
        this.taxes = taxes;
        this.hasPets = hasPets;
    }
}