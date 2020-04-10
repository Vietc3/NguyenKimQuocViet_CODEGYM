package Session2.BaiTap;

import java.util.Scanner;

public class themphantuvaomang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[arr.length + 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí cần chèn");
        int index = scanner.nextInt();
        System.out.println("Nhập số cần chèn");
        int number = scanner.nextInt();
        if (index >= arr.length - 1 || index <= 1) {
            System.out.println("Không chèn được");
        } else {
            arr2[index] = number;
            for (int i = 0; i < arr2.length; i++) {
                if (i < index) {
                    arr2[i] = arr[i];
                } else if (i > index) {
                    arr2[i] = arr[i - 1];
                }
            }
        }
        for (int item : arr2) {
            System.out.println(item);
        }
    }
}
