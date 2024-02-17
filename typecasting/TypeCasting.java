package typecasting;

public class TypeCasting {
    
    public static void main(String[] args) {
        // widening casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("int: " + myInt);
        System.out.println("double: " + myDouble);
        
        // narrowing casting
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println("double: " + myDouble2);
        System.out.println("int: " + myInt2);
    }
}
