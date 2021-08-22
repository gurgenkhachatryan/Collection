package com.company;

import com.company.model.Chocolate;
import com.company.model.Coffee;
import com.company.model.Drink;
import com.company.model.Tea;

public class CoffeeMachine {
    public  DrinkType drinkType;
    private Cup cup;



    public  DrinkType command1(String str)
    {
        switch (str.charAt(0))
        {
            case 'T':
            {
                drinkType=DrinkType.TEA;
                break;
            }
            case 'S':
            {
                drinkType=DrinkType.CHOCOLATE;
                break;
            }
            case 'C':
            {
                drinkType=DrinkType.COFFEE;
                break;
            }
            default:
            {
                System.out.println("enter valid String");
            }

        }
        return drinkType;
    }

    public Cup makeProduct(String command){
        DrinkType drinkType = command1(command);
        cup = new Cup(drinkType);
        cup.makeDrink();
        return cup;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "cup=" + cup +
                '}';
    }
}
