package codes.gorillu;

public class Main {

    public static void main(String[] args) {


        // <--------------------------CHALLENGE------------------------------> //

        byte byteValue = 124;
        short shortValue = 2200;
        int intValue = 240;
        long longValue = 50000L + (10L * (byteValue + shortValue + intValue));
        System.out.println(longValue);

    }
}
