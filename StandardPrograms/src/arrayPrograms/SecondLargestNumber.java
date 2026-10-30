package arrayPrograms;

import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array...");
        int size = sc.nextInt();

        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter which highest number you want...");
        int n = sc.nextInt();

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a.length; j++) {

                if (a[j] > a[i]) {
                    count++;
                }
            }

            if (count == (n - 1)) {
                System.out.println("Result : " + a[i]);
                break;
            }
        }

        sc.close();
    }
}

