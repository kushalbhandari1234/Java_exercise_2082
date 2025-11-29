package day_2;
public class DataTypesSize {
    public static void main(String[] args) {

        int number = 1234567890;

        String stringVariable = "hello";
        char charVariable = 'h';
        short shortVariable = 12345;
        long longVariable = 12345678900000L;
        byte byteVariable = (byte) 44; // 3444 is too large for byte

        // Floating point
        float temperature = 36.667f;
        double gravity = 9.80665;

        // Integers
        // int population = 8_000_000_000; // Error without L
        long worldPop = 8_000_000_000L; // correct

        // Bases
        int binary = 0b1010;  // 10
        int octal = 012;      // 10
        int hexa = 0xA;       // 10 (was "oxA" in your code, needs 0x)

        // Other types
        byte small = 127;
        char grade = 'A';
        boolean isValid = true;
        String message = "literals demo";

        // Print to check
        System.out.println("Number: " + number);
        System.out.println("String: " + stringVariable);
        System.out.println("Char: " + charVariable);
        System.out.println("Short: " + shortVariable);
        System.out.println("Long: " + longVariable);
        System.out.println("Byte: " + byteVariable);
        System.out.println("Temperature: " + temperature);
        System.out.println("Gravity: " + gravity);
        System.out.println("World Population: " + worldPop);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexa: " + hexa);
        System.out.println("Small Byte: " + small);
        System.out.println("Grade: " + grade);
        System.out.println("Boolean: " + isValid);
        System.out.println("Message: " + message);
    }
}
