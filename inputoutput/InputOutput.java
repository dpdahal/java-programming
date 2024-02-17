package inputoutput;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // System.out.print("Hello java ");
        // System.out.print("Hello, World!");

        // input
        // Scanner objScanner = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = objScanner.nextLine();
        // System.out.println("Hello, " + name);
        // get input with space 
        System.out.println("Enter your name: ");
        Scanner objScanner = new Scanner(System.in);
        String name = objScanner.nextLine();
        System.out.println("Hello, " + name);
        objScanner.close();

    }
}
