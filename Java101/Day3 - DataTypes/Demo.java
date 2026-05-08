public class Demo {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        //Data Types
        // byte(8), short(16), int(32), long(64), float, double, char, boolean
        
        byte b = 127; // -128 to 127
        short s = 32767; // -32768 to 32767
        int i = 2147483647; // -2147483648 to 2147483647
        long l = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
        float f = 3.14f; // 32-bit floating point  (Single precision)
        double d = 3.141592653589793; // 64-bit floating point (Double precision)
        char c = 'A'; // single character

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);


        byte num1 = 0b101;
        short num2 = 0x1A;
        short num = 0123; // 123 in octal  
        int num3 = 0_123; // 123 in octal

        int num4 = 12_34_56;
        System.out.println("num1: " + num1); 
        float f2 = 0.7f;
        // System.out.println("float f2: " + f2); 
        System.out.printf("%.20f",f2); // 0.69999998807907100000 (changing from decimal to binary and back to decimal causes precision loss)

        // Decimal are stored in 32 bits (float) or 64 bits (double)
        // Float - 1 sign bit, 8 bits for exponent, 23 bits for mantissa
        // Double - 1 sign bit, 11 bits for exponent, 52 bits for mantissa

        // They give precision error, So we habe BigDecimal class in Java to handle decimal numbers with high precision (like for financial calculations).

    }
}
