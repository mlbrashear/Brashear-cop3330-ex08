package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int people, pizza, slicesPizza, totalSlices;
        Scanner sc = new Scanner(System.in);

        //get user input
        System.out.println("How many people?");
        people = sc.nextInt();
        System.out.println("How many pizzas do you have?");
        pizza = sc.nextInt();
        System.out.println("How many slices per pizza?");
        slicesPizza = sc.nextInt();

        //calculate total slices
        totalSlices = pizza * slicesPizza;

        //print out findings
        System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices)");
        System.out.println("Each person gets " + (totalSlices / people) + " pieces of pizza.");
        System.out.println("There are " + (totalSlices%people) + " leftover pieces.");

        sc.close();
    }
}