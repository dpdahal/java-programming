package operators;

public class Operators {
    public static void main(String[] args) {
        // arithmetic operators
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        
        // assignment operators
        int c = 10;
        int d = 20;
        c += 4;
        d -= 4;
        System.out.println("c += 4: " + c);
        System.out.println("d -= 4: " + d);
        
        // comparison operators
        int e = 10;
        int f = 20;
        System.out.println("e == f: " + (e == f));
        System.out.println("e != f: " + (e != f));
        System.out.println("e > f: " + (e > f));
        System.out.println("e < f: " + (e < f));
        System.out.println("e >= f: " + (e >= f));
        System.out.println("e <= f: " + (e <= f));
        
        // logical operators
        boolean g = true;
        boolean h = false;
        System.out.println("g && h: " + (g && h));
        System.out.println("g || h: " + (g || h));
        System.out.println("!g: " + (!g));
        System.out.println("!h: " + (!h));
        
        // bitwise operators
        int i = 10;
        int j = 20;
        System.out.println("i & j: " + (i & j));
        System.out.println("i | j: " + (i | j));
        System.out.println("i ^ j: " + (i ^ j));
        System.out.println("~i: " + (~i));
        System.out.println("i << 2: " + (i << 2));
        System.out.println("i >> 2: " + (i >> 2));
        System.out.println("j >>> 2: " + (j >>> 2));

        // ternary operator
        int k = 10;
        int l = 20;
        int result = (k > l) ? k : l;
        System.out.println("result: " + result);

        // instanceof operator
        String str = "Hello World";
        System.out.println("str instanceof String: " + (str instanceof String));

        // new operator
        Operators obj = new Operators();
        System.out.println("obj instanceof Operators: " + (obj instanceof Operators));

    }
    
}
