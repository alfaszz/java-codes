import java.util.Scanner;

class Triangle {
    public static void main(String args[]) {

        // Scanner class object to read input values
        Scanner sc = new Scanner(System.in);

        // declare variables
        int a, b, c;
        double p, area;

        // read sides of trangle from user
        System.out.print("Enter 3 sides : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //check is sides can form a triangle
        if ((a < b + c) && (b < a + c) && (c < a + b)) {

            // equilateral triangle if all sides are equal
            if ((a == b) && (b == c))
                System.out.println("Equilateral triangle");

            // isosceles triangle if any two sides are equal    
            else if ((a == b) || (b == c) || (c == a))
                System.out.println("Isosceles triangle");

            // scalene triangle if no sides are equal    
            else
                System.out.println("Scalene triangle");

            // find area
            p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            // display area
            System.out.println("Area of triangle is = " + area);
        }
        else {
            System.out.println("Cannot form a triangle");
        }
    }
}
