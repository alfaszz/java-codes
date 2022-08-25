//program to merge two arrrays

import java.util.Scanner;

class MergeArrays {
    public static void main(String[] args) {

        // declare variables
        int a1, b1, c1 = 0;

        // Scanner class object to read input values
        Scanner s = new Scanner(System.in);

        // read size of array from user
        System.out.print("Enter the size of first array : ");
        a1 = s.nextInt();
        int a[] = new int[a1];

        System.out.print("Enter the size of second array : ");
        b1 = s.nextInt();
        int b[] = new int[b1];

        c1 = a1 + b1;
        int[] c = new int[c1];

        // read array elements from user
        System.out.print("Enter elements of first array : ");
        for (int i = 0; i < a1; i++) {
            a[i] = s.nextInt();
        }

        System.out.print("Enter elements of second array : ");
        for (int i = 0; i < b1; i++) {
            b[i] = s.nextInt();
        }

        // merge two arrays
        for (int i = 0; i < a1; i = i + 1) {
            c[i] = a[i];
        }

        for (int i = 0; i < b1; i = i + 1) {
            c[a1 + i] = b[i];
        }

        // display three arrays
        System.out.println("First array is : ");
        for (int i = 0; i < a1; i = i + 1) {
            System.out.println(a[i]);
        }

        System.out.println("Second array is : ");
        for (int i = 0; i < b1; i = i + 1) {
            System.out.println(b[i]);
        }

        System.out.println("The merged array is : ");
        for (int i = 0; i < c1; i = i + 1) {
            System.out.println(c[i]);
        }
    }
}
