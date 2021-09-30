package main;

import assignment1.Assignment1;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // Q3:
        int[] input1 = new int[] {2, 3, 4, 2, 2, 3, 5, 7};
        int expected1 = 4;

        int[] input2 = new int[] {7, 8, 4, 2, 4, 7, 8};
        int expected2 = 2;

        int Output1 = Assignment1.firstNonRepeating(input1);
        System.out.println("Q3 expected: " + expected1);
        System.out.println(Output1);

        int Output2 = Assignment1.firstNonRepeating(input2);
        System.out.println("Q3 expected: " + expected2);
        System.out.println(Output2);

    }
}
