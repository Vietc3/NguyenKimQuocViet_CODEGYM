package Session2.BaiTap;

import java.util.Scanner;

public class findMaxIn2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[5][3];
        int max = 0;
        int hang = 0;
        int cot = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ" + '[' + i + "][" + j + ']');
                int value = scanner.nextInt();
                array[i][j] = value;
                if (max < array[i][j]) {
                    max = array[i][j];
                    cot = j;
                    hang = i;
                }

            }
        }
        System.out.println("Số lơn nhất là" + max + "tại hàng " + hang + " tại cột " + cot);
    }
}
