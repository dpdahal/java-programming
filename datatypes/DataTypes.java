package datatypes;

public class DataTypes {
    public static void main(String[] args) {
        // primitive data types
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.4028235E38f;
        double d = 1.7976931348623157E308;
        char c = 'A';
        boolean bool = true;

        // printing primitive data types
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // non-primitive data types
        String str = "Hello World";
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("String: " + str);
        System.out.println("Array: " + arr);

    }
    
}
