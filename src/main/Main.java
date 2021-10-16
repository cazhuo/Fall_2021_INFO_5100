package main;

import assignment2.*;
import jdk.nashorn.internal.ir.Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <Assignment2> void main(String[] args) {
        /*
        Q1. Use the Shape tester class to test your classes.
         */
        Shape shape1 = new Shape("Shape1", "pink");
        System.out.println("shape1");
        System.out.println(shape1.printShape());

        Shape shape2 = new Shape("Shape2", "orange", 20, 30);
        System.out.println("shape2");
        System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter());
        System.out.println(shape2.printShape());

        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle("Rectangle", "Purple",4, 7);
        System.out.println("rectangle2");
        System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printShape());

        Square square1 = new Square(3);
        System.out.println("square1");
        System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());

        Square square2 = new Square("Square" , "black", 7);
        System.out.println("square2");
        System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter());
        System.out.println(square2.printShape());


        System.out.println("===================================");
        /*
        Q2. Create a Sum class with methods to get desired output. Use the below function to test the output.
         */
        Sum sum = new Sum();
        System.out.println(sum.add(2, 3)); //output : 5
        System.out.println(sum.add(4, 9, 12));//output : 25
        System.out.println(sum.add(4, 5.0));//output : 9.0
        System.out.println(sum.add(15.5, 5));//output : 20.5
        System.out.println(sum.add(1.0, 6.4));//output : 7.4


        System.out.println("===================================");
        /*
        Leetcode questions test cases.
         */
        // 1)
        int[][] q1Input1 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] q1Expected1 = {{1,4,7}, {2,5,8}, {3,6,9}};
        int[][] q1Input2 = new int[][] {{1,2,3}, {4,5,6}};
        int[][] q1Expected2 = {{1,4}, {2,5}, {3,6}};

        System.out.println("Q1 expected: " + Arrays.deepToString(q1Expected1));
        System.out.println("* Q1 output: " + Arrays.deepToString(A2_lc_Q1.transpose(q1Input1)));
        System.out.println("Q1 expected: " + Arrays.deepToString(q1Expected2));
        System.out.println("* Q1 output: " + Arrays.deepToString(A2_lc_Q1.transpose(q1Input2)));
        System.out.println("------------");
        // 2)
        String[] q2Input1_1 = new String[] {"practice", "makes", "perfect", "coding", "makes"};
        String q2Input1_2 = "coding";
        String q2Input1_3 = "practice";
        String[] q2Input2_1 = q2Input1_1;
        String q2Input2_2 = "makes";
        String q2Input2_3 = "coding";

        System.out.println("Q2 expected: " + 3);
        System.out.println("* Q2 output: " + A2_lc_Q2.shortestDistance(q2Input1_1, q2Input1_2, q2Input1_3));
        System.out.println("Q2 expected: " + 1);
        System.out.println("* Q2 output: " + A2_lc_Q2.shortestDistance(q2Input2_1, q2Input2_2, q2Input2_3));
        System.out.println("------------");
        // 3)
        int[] q3Input1 = new int[] {0,1,0,3,12};
        int[] q3Expected1 = {1,3,12,0,0};
        int[] q3Input2 = new int[] {0};
        int[] q3Expected2 = {0};

        System.out.println("Q3 expected: " + Arrays.toString(q3Expected1));
        A2_lc_Q3.moveZeroes(q3Input1);
        System.out.println("* Q3 output: " + Arrays.toString(q3Input1));
        System.out.println("Q3 expected: " + Arrays.toString(q3Expected2));
        A2_lc_Q3.moveZeroes(q3Input2);
        System.out.println("* Q3 output: " + Arrays.toString(q3Input2));
        System.out.println("------------");
        // 4)
        int[][] q4Input1 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] q4Expected1 = {{7,4,1}, {8,5,2}, {9,6,3}};
        int[][] q4Input2 = new int[][] {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        int[][] q4Expected2 = {{15,13,2,5}, {14,3,4,1}, {12,6,8,9}, {16,7,10,11}};
        int[][] q4Input3 = new int[][] {{1}};
        int[][] q4Expected3 = {{1}};

        System.out.println("Q4 expected: " + Arrays.deepToString(q4Expected1));
        A2_lc_Q4.rotate(q4Input1);
        System.out.println("* Q4 output: " + Arrays.deepToString(q4Input1));
        System.out.println("Q4 expected: " + Arrays.deepToString(q4Expected2));
        A2_lc_Q4.rotate(q4Input2);
        System.out.println("* Q4 output: " + Arrays.deepToString(q4Input2));
        System.out.println("Q4 expected: " + Arrays.deepToString(q4Expected3));
        A2_lc_Q4.rotate(q4Input3);
        System.out.println("* Q4 output: " + Arrays.deepToString(q4Input3));
        System.out.println("------------");
        // 5)
        int[][] q5Input1 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        List<Integer> q5Expected1 = Arrays.asList(1,2,3,6,9,8,7,4,5);
        int[][] q5Input2 = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        List<Integer> q5Expected2 = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);

        System.out.println("Q5 expected: " + q5Expected1);
        System.out.println("* Q5 output: " + A2_lc_Q5.spiralOrder(q5Input1));
        System.out.println("Q5 expected: " + q5Expected2);
        System.out.println("* Q5 output: " + A2_lc_Q5.spiralOrder(q5Input2));
        System.out.println("------------");
        //6
        String q6Input1_1 = "egg";
        String q6Input1_2 = "add";
        String q6Input2_1 = "foo";
        String q6Input2_2 = "bar";

        System.out.println("Q6 expected: " + true);
        System.out.println("* Q6 output: " + A2_lc_Q6.isIsomorphic(q6Input1_1, q6Input1_2));
        System.out.println("Q6 expected: " + false);
        System.out.println("* Q6 output: " + A2_lc_Q6.isIsomorphic(q6Input2_1, q6Input2_2));
        System.out.println("------------");
        //7
        String q7Input1_1 = "11";
        String q7Input1_2 = "123";
        String q7Input2_1 = "456";
        String q7Input2_2 = "77";
        String q7Input3_1 = "0";
        String q7Input3_2 = "0";

        System.out.println("Q7 expected: " + "134");
        System.out.println("* Q7 output: " + A2_lc_Q7.addStrings(q7Input1_1, q7Input1_2));
        System.out.println("Q7 expected: " + "533");
        System.out.println("* Q7 output: " + A2_lc_Q7.addStrings(q7Input2_1, q7Input2_2));
        System.out.println("Q7 expected: " + "0");
        System.out.println("* Q7 output: " + A2_lc_Q7.addStrings(q7Input3_1, q7Input3_2));
        System.out.println("------------");
        //8
        String q8Input1 = "A man, a plan, a canal: Panama";
        String q8Input2 = "race a car";

        System.out.println("Q8 expected: " + true);
        System.out.println("* Q8 output: " + A2_lc_Q8.isPalindrome(q8Input1));
        System.out.println("Q8 expected: " + false);
        System.out.println("* Q8 output: " + A2_lc_Q8.isPalindrome(q8Input2));
        System.out.println("------------");
        //9
        String q9Input1 = "the sky is blue";
        String q9Input2 = " Bob Loves Alice ";

        System.out.println("Q9 expected: " + "blue is sky the");
        System.out.println("* Q9 output: " + A2_lc_Q9.reverseWords(q9Input1));
        System.out.println("Q9 expected: " + "Alice Loves Bob");
        System.out.println("* Q9 output: " + A2_lc_Q9.reverseWords(q9Input2));
        System.out.println("------------");
        //10
        char[] q10Input1 = "aabbccc".toCharArray();
        char[] q10Input2 = "a".toCharArray();
        char[] q10Input3 = "abbbbbbbbbbbb".toCharArray();

        System.out.println("Q10 expected: " + 6);
        System.out.println("* Q10 output: " + A2_lc_Q10.compress(q10Input1));
        System.out.println("Q10 expected: " + 1);
        System.out.println("* Q10 output: " + A2_lc_Q10.compress(q10Input2));
        System.out.println("Q10 expected: " + 4);
        System.out.println("* Q10 output: " + A2_lc_Q10.compress(q10Input3));





//        // ASSIGNMENT 1
//        // Q1:
//        System.out.println("=============================");
//        int[] q1Input1 = new int[] {1, 2, 3, 2};
//        int q1Expected1 = 4;
//        System.out.println("Q1 expected: " + q1Expected1);
//        System.out.println(Assignment1.sumOfUnique(q1Input1));
//
//        int[] q1Input2 = new int[] {1, 1, 1, 1, 1};
//        int q1Expected2 = 0;
//        System.out.println("Q1 expected: " + q1Expected2);
//        System.out.println(Assignment1.sumOfUnique(q1Input2));
//
//        int[] q1Input3 = new int[]{1, 2, 3, 4, 5};
//        int q1Expected3 = 15;
//        System.out.println("Q1 expected: " + q1Expected3);
//        System.out.println(Assignment1.sumOfUnique(q1Input3));
//
//        // Q2:
//        System.out.println("=============================");
//        int[] q2Input1 = new int[] {-4,-1,0,3,10};
//        int[] q2Expected1 = new int[] {0,1,9,16,100};
//        System.out.println("Q2 expected: " + Arrays.toString(q2Expected1));
//        System.out.println(Arrays.toString(Assignment1.sortedSquares(q2Input1)));
//
//        int[] q2Input2 = new int[] {-7,-3,2,3,11};
//        int[] q2Expected2 = new int[] {4,9,9,49,121};
//        System.out.println("Q2 expected: " + Arrays.toString(q2Expected2));
//        System.out.println(Arrays.toString(Assignment1.sortedSquares(q2Input2)));
//
//        // Q3:
//        System.out.println("=============================");
//        int[] q3Input1 = new int[]{2, 3, 4, 2, 2, 3, 5, 7};
//        int q3Expected1 = 4;
//        System.out.println("Q3 expected: " + q3Expected1);
//        System.out.println(Assignment1.firstNonRepeating(q3Input1));
//
//        int[] q3Input2 = new int[]{77, 9, 4, 2, 4, 77, 9};
//        int q3Expected2 = 2;
//        System.out.println("Q3 expected: " + q3Expected2);
//        System.out.println(Assignment1.firstNonRepeating(q3Input2));
//
//        // Q4:
//        System.out.println("=============================");
//        String q4Input1_1 = "abc";
//        String q4Input1_2 = "cba";
//        boolean q4Expected1 = true;
//        System.out.println("Q4 expected: " + q4Expected1);
//        System.out.println(Assignment1.canConstruct(q4Input1_1, q4Input1_2));
//
//        String q4Input2_1 = "abc";
//        String q4Input2_2 = "cbaaaa";
//        boolean q4Expected2 = true;
//        System.out.println("Q4 expected: " + q4Expected2);
//        System.out.println(Assignment1.canConstruct(q4Input2_1, q4Input2_2));
//
//        String q4Input3_1 = "cbaaaa";
//        String q4Input3_2 = "abc";
//        boolean q4Expected3 = false;
//        System.out.println("Q4 expected: " + q4Expected3);
//        System.out.println(Assignment1.canConstruct(q4Input3_1, q4Input3_2));
//
//        // Q5:
//        System.out.println("=============================");
//        String q5Input1 = "1A3d4s5t";
//        boolean q5Expected1 = true;
//        System.out.println("Q5 expected: " + q5Expected1);
//        System.out.println(Assignment1.isPattern(q5Input1));
//
//        String q5Input2 = "a11b";
//        boolean q5Expected2 = false;
//        System.out.println("Q5 expected: " + q5Expected2);
//        System.out.println(Assignment1.isPattern(q5Input2));
//
//        String q5Input3 = "";
//        boolean q5Expected3 = false;
//        System.out.println("Q5 expected: " + q5Expected3);
//        System.out.println(Assignment1.isPattern(q5Input3));
//
//

    }

}
