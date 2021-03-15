package com.potochniak.codewars;

/*
    Description:
* Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.
*
* Create an application that will display
* the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).

Make sure to round off the result to two decimal points.
* If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.

Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres
* */

import java.util.Scanner;

public class MilesPerGallonToKilometersPerLiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of miles per imperial gallon: ");
        double milesPerGallon = scanner.nextDouble();

        double kilometersPerLitres = milesPerGallon / 2.8248094;

        double resultWithTwoNumberAfterDot = (double) Math.round(kilometersPerLitres * 100) / 100;

        int resultNatureNumber = (int) kilometersPerLitres;

        if(resultWithTwoNumberAfterDot % 1 == 0){
            System.out.println(resultNatureNumber);
        } else{
            System.out.println(resultWithTwoNumberAfterDot);
        }






    }
}
