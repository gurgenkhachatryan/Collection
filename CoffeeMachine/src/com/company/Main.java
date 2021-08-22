package com.company;

import com.company.model.Drink;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println(coffeeMachine.makeProduct("Coffee"));
    }
}
