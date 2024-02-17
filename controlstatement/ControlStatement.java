package controlstatement;

public class ControlStatement {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        // if-else statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // for loop
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        // for-each loop
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }
        // break statement
        for (int l = 0; l < 5; l++) {
            if (l == 3) {
                break;
            }
            System.out.println(l);
        }
        // continue statement
        for (int m = 0; m < 5; m++) {
            if (m == 3) {
                continue;
            }
            System.out.println(m);
        }
        // return statement
        System.out.println(sum(10, 20));
    }
    
}
