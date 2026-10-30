package arrayPrograms;

import java.util.Scanner;

public class DuplicateLargest {

    static void duplicateLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array...");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements...");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        duplicateLargest(arr);
    }
}