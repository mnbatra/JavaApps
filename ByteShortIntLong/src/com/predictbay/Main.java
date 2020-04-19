package com.predictbay;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinValue);
        System.out.println("Integer Maximum Value = " + myMaxValue);

        //Overflow Example
        System.out.println("BUSTED Maximum Value = " + ( myMaxValue + 1) );
        //Underflow Example
        System.out.println("BUSTED Minimum Value = " + ( myMinValue - 1) );

        //Readability
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //Overflow Example
        System.out.println("Busted Byte Value = " + (myMaxByteValue + 1));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);


        //We use the capital L notation for long, lowercase l can be confused with i or 1, hence L

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        /* Width of byte = 8
            Width of short = 16
            Width of Int = 32
            Width of Long = 64
        */
        long bigLongLiteralValue1 = 2_147_483_647; // Integer by default
        long bigLongLiteralValue2 = 2_147_483_647_243L; // Longer than integer, hence error without the L
        short bigShortLiteralValue = 32767; // 32768 will be rejected as it exceeds short max size


        // Type casting, INT is the default data type for expressions in JAVA, JVM hence every expression is converted into int
        byte myNewByteValue = (byte) ( myMinByteValue / 2 );
        short myNewShortValue = (short) ( myMinShortValue / 2 );
        System.out.println( "Byte/2 = " + myNewByteValue + "\nShort/2 = " + myNewShortValue );

    }
}
