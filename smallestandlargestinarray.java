import java.util.Scanner;

public class ArrayElements {
    public static void main(String args[]) {

        // Scanner class object to read input values
        Scanner sc = new Scanner(System.in);

        // declare variables
        int i, j, temp, n = 10;
        int arr[] = new int[10];

        // read array elements from user
        System.out.print("Enter 10 elements : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sort array elements
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < 10; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // print smallest, largest and second largest element
        System.out.println("Smallest element = " + arr[0]);
        System.out.println("Largest element = " + arr[n - 1]);
        System.out.println("Second Largest element = " + arr[n - 2]);
    }
}
