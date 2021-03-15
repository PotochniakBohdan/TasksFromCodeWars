package com.potochniak.codewars;

import java.util.Scanner;
/*
    Description:
* Nathan loves cycling.
* Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
* You get given the time in hours and you need to return the number of litres Nathan will drink,
* rounded to the smallest value.
*
For example:
time = 3 ----> litres = 1
time = 6.7---> litres = 3
time = 11.8--> litres = 5
* */

public class KeepHydrated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of time in hours: ");
        double time = scanner.nextDouble();
        double litresPerHour = 0.5;
        double resultBeforeСonverting = (time * litresPerHour);
        int finalResult = (int)resultBeforeСonverting;
        System.out.println(finalResult);
    }
}
