package com.potochniak.codewars;

public class SquareOrNotSquare {
    public static void main(String[] args) {
        int array[] = {10, 8, 6, 4};

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 != 0) {
                array[i] *= array[i];
            } else {
                array[i] = (int) Math.sqrt(array[i]);
            }
            System.out.print(array[i] + " ");
        }

    }
}
