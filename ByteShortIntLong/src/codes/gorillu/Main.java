package codes.gorillu;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        // Integer Minimum Value = -2147483648
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        // Integer Maximum Value = 2147483647
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Max has turned into a negative number and has created overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue+1));

        // Min has turned into a positive number and has created underflow
        System.out.println("Busted MIN value = " + (myMinIntValue-1));

        // If changed to 2147483648 it will throw an error & can be written with an underscore (Java version and higher)
        int myMaxIntTest = 2_147_483_647;

        // Byte Minimum Value = -128
        byte myMinByteValue = Byte.MIN_VALUE;

        // Byte Maximum Value = 127
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // Short Minimum Value = -32768
        short myMinShortValue = Short.MIN_VALUE;

        // Short Maximum Value = 32767
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);


        // add an L to the long value to make sure it is given out as a long and not a integer because a integer will also fit a 100
        long myLongValue = 100; //<-- is an integer

        long bigLongLiteralValue =  2147483647234L; //<-- is an long

        // Long Minimum Value = -9223372036854775808
        long myMinLongValue = Long.MIN_VALUE;

        // Long Maximum Value = 9223372036854775807
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        // byte myNewByteValue = (myMinByteValue /2); <--- throws an error because everything within the parentheses is treated as an integer
        // the byte value needs to be casted
        byte myNewByteValue = (byte) (myMinByteValue /2);

        short myNewShortValue = (short) (myMinShortValue/2);







    }
}
