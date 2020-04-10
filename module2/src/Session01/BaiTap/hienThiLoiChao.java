package Session01.BaiTap;

import java.util.Scanner;

public class hienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner =new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
