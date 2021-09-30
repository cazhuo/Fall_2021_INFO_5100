package main;

import assignment1.Assignment1;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // Q3:
        System.out.println("=============================");
        int[] q3Input1 = new int[] {2, 3, 4, 2, 2, 3, 5, 7};
        int q3Expected1 = 4;
        System.out.println("Q3 expected: " + q3Expected1);
        System.out.println(Assignment1.firstNonRepeating(q3Input1));

        int[] q3Input2 = new int[] {77, 9, 4, 2, 4, 77, 9};
        int q3Expected2 = 2;
        System.out.println("Q3 expected: " + q3Expected2);
        System.out.println(Assignment1.firstNonRepeating(q3Input2));

        // Q5:
        System.out.println("=============================");
        String q5Input1 = "1A3d4s5t";
        boolean q5Expected1 = true;
        System.out.println("Q5 expected: " + q5Expected1);
        System.out.println(Assignment1.isPattern(q5Input1));

        String q5Input2 = "A2bb2d4";
        boolean q5Expected2 = false;
        System.out.println("Q5 expected: " + q5Expected2);
        System.out.println(Assignment1.isPattern(q5Input2));

        String q5Input3 = "";
        boolean q5Expected3 = false;
        System.out.println("Q5 expected: " + q5Expected3);
        System.out.println(Assignment1.isPattern(q5Input3));




    }
}
