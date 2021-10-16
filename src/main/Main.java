package main;

import assignment2.Rectangle;
import assignment2.Shape;
import assignment2.Square;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        Q1) - 4) Use the Shape tester class to test your classes.
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
