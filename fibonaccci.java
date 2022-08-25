import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        
        // Scanner class object to read input values
        Scanner scan = new Scanner(System.in);

        // declare variables
        int n, a = 0, b = 1, c = 0;

        // read limit from user
        System.out.print("Enter the limit : ");
        n = scan.nextInt();

        // print fibonacci series
        System.out.print("Fibonacci Series Upto " + n + ": ");
        while (c <= n) {
            System.out.print(c + ",");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
