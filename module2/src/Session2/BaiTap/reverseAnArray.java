package Session2.BaiTap;

import java.util.Scanner;
public class reverseAnArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner inputValue = new Scanner(System.in);
        do {
            System.out.println("Please input your array size: ");
            size = inputValue.nextInt();
            if (size > 10) {
                System.out.println("Long array, please input a shorter one");
            }
        } while (size > 10); // false condition to stop the do-while,
        // it means if size size > 10, then "do" will run again.
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Please input element No." + (i+1) + ":");
            array[i] = inputValue.nextInt();
            i++;
        }
        System.out.println("The input array is: ");
//        for (int j = 0; j < size; j++) {
//            System.out.print(array[j] + ", ");
//        }
        for (int x: array) {
            System.out.print(x + ", ");
        }
        int[] array2 = new int[size];
        //int k = size - 1;
        System.out.println("The array after reverse: ");
        int k = 0;
        for (int q = size - 1; q >= 0; q--) {
            array2[k++] = array[q];
        }
        System.out.println("\n");
        System.out.println("The wanted reversed-array: ");
        for (int u = 0; u < size; u++) {
            System.out.print(array2[u] + ", ");
        }
    }
}