package com.Household;

abstract class House {
   double netWorth;
   double salary;
   double taxRate;
   Pet pet;

   public House(double netWorth, double salary, double taxRate, Pet pet){
       this.netWorth = netWorth;
       this.salary = salary;
       this.taxRate = taxRate;
       this.pet = pet;
   }


   public void earnMoney(){
       double taxes = payTaxes(this.salary);
       double profit = this.salary - taxes;
       this.netWorth += profit;
       System.out.println("You earned: $" + profit + "\n You have a net worth of: " + this.netWorth);
   }

   static class Mansion extends House{
        public Mansion(double netWorth, double salary, double taxRate, Pet pet){
            super(netWorth, salary, taxRate, pet);
        }
        @Override
        double payTaxes(double salary){
            double taxes = salary * ((100-taxRate/2)/100.0);
            System.out.println("You now pay 50% less in taxes");
            return taxes;
        }


    }
    static class Cottage extends House{
       public Cottage(double netWorth, double salary, int taxRate, Pet pet){
           super(netWorth, salary, taxRate, pet);
       }
    }

    @Override
    double payTaxes(double salary){
       double taxes = salary * ((100-taxRate)/100.0);
        System.out.println("You need to pay your taxes just like everybody else");
        return taxes;

    }
}

