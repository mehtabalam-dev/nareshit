package arrayPracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        int[] unique = new int[size];
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            boolean duplicate = false;
//
//            for (int j = 0; j < index; j++) {
//                if (arr[i] == unique[j]) {
//                    duplicate = true;
//                    break;
//                }
//            }
//
//            if (!duplicate) {
//                unique[index] = arr[i];
//                index++;
//            }
//        }
//
//        int[] result = Arrays.copyOf(unique, index);
//
//        System.out.println("Array after removing duplicates: "
//                + Arrays.toString(result));
        
        
    }
}