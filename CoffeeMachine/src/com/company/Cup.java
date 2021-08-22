package com.company;

import com.company.model.Chocolate;
import com.company.model.Coffee;
import com.company.model.Drink;
import com.company.model.Tea;

public class Cup {
    private Drink drink;
    private DrinkType drinkType;

    public Cup(DrinkType drinkType){
        this.drinkType = drinkType;
    }


    public Drink makeDrink(){
        switch (drinkType){
            case TEA: drink =  new Tea();
                break;
            case COFFEE: drink =  new Coffee();
                break;
            case CHOCOLATE: drink =  new Chocolate();
                break;
        }
        return drink;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "drink=" + drink.toString() +
                '}';
    }
}
