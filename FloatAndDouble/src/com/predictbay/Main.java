package com.predictbay;

public class Main {

    public static void main(String[] args) {

        float myMinValueFloat = Float.MIN_VALUE;
        float myMaxValueFloat = Float.MAX_VALUE;
        System.out.printf("Minimum Float Value = %s\nMaximum Float Value = %s%n", myMinValueFloat, myMaxValueFloat);

        double myMinValueDouble = Float.MIN_VALUE;
        double myMaxValueDouble = Float.MAX_VALUE;
        System.out.printf("Minimum Float Value = %s\nMaximum Float Value = %s%n", myMinValueDouble, myMaxValueDouble);

        int myInt = 5/3;
        float myFloat = 5f/3f;
        float myFloat2 = (float)5.25/2; // BY default a decimal is a double, but we cast it to float explicitly
        double myDouble = 5.00/3.00;
        /*
        another way
         double myDouble = 5d/3d;
        */
        System.out.printf("Int = %s\nFloat = %s\nDouble = %s%n", myInt, myFloat,myDouble);

        }
}
