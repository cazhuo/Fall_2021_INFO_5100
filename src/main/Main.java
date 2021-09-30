package main;

import assignment1.Assignment1;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // Q3:
        int[] arr = new int[] {2, 3, 4, 2, 2, 3, 5, 7};
        int output = 4;

        int[] inputArray = arr;
        int q3Output = Assignment1.firstNonRepeating(inputArray);
        System.out.println("Q3 expected: " + output);
        System.out.println(q3Output);

    }
}
