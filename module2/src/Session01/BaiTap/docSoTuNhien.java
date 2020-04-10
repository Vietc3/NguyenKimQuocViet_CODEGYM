package Session01.BaiTap;

import java.util.Scanner;

public class docSoTuNhien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int number = scanner.nextInt();
        if (number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        } else if (number > 10 && number<100) {
            if (number % 10 == 0) {
                switch (number / 10) {
                    case 2:
                        System.out.println("Twenty");
                        break;
                    case 3:
                        System.out.println("Thirty");
                        break;
                    case 4:
                        System.out.println("Fourty");
                        break;
                    case 5:
                        System.out.println("Fifty");
                        break;
                    case 6:
                        System.out.println("Sixty");
                        break;
                    case 7:
                        System.out.println("Seventy");
                        break;
                    case 8:
                        System.out.println("Eighty");
                        break;
                    case 9:
                        System.out.println("Ninety");
                        break;

                }
            } else if (number / 10 == 1) {
                switch (number % 10) {
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }
            } else {
                String Number="";
                switch (number/10) {
                    case 2:
                        Number="Twenty";
                        break;
                    case 3:
                        Number="Thirty";
                        break;
                    case 4:
                        Number="Fourty";
                        break;
                    case 5:
                        Number="Fifty";
                        break;
                    case 6:
                        Number="Sixty";
                        break;
                    case 7:
                        Number="Seventy";
                        break;
                    case 8:
                        Number="Eight";
                        break;
                    case 9:
                        Number="Ninety";
                        break;
                }
                switch (number%10) {
                    case 1:
                        Number+=" One";
                        break;

                    case 2:
                        Number+=" Two";
                        break;
                    case 3:
                        Number+=" Three";
                        break;
                    case 4:
                        Number+=" Four";
                        break;
                    case 5:
                        Number+=" Five";
                        break;
                    case 6:
                        Number+=" Six";
                        break;
                    case 7:
                        Number+=" Seven";
                        break;
                    case 8:
                        Number+=" Eight";
                        break;
                    case 9:
                        Number+=" Nine";
                        break;
                }
                System.out.println(Number);
            }
        }
        else {
            String Number1="";
            switch (number/100) {
                case 1:
                    Number1=" One Hundred";
                    break;
                case 2:
                    Number1=" Two Hundred";
                    break;
                case 3:
                    Number1=" Three Hundred";
                    break;
                case 4:
                    Number1=" Four Hundred";
                    break;
                case 5:
                    Number1=" Five Hundred";
                    break;
                case 6:
                    Number1=" Six Hundred";
                    break;
                case 7:
                    Number1=" Seven Hundred";
                    break;
                case 8:
                    Number1=" Eight Hundred";
                    break;
                case 9:
                    Number1=" Nine Hundred";
                    break;
            }
            switch (number%10%10) {
                case 1:
                    Number1+=" Tenty";
                    break;

                case 2:
                    Number1+=" Twenty";
                    break;
                case 3:
                    Number1+=" Thirty";
                    break;
                case 4:
                    Number1+=" Fourty";
                    break;
                case 5:
                    Number1+=" Fifty";
                    break;
                case 6:
                    Number1+=" Sixty";
                    break;
                case 7:
                    Number1+=" Seventy";
                    break;
                case 8:
                    Number1+=" Eight";
                    break;
                case 9:
                    Number1+=" Ninety";
                    break;
            }
            switch (number%100%10) {
                case 1:
                    Number1+=" One";
                    break;

                case 2:
                    Number1+=" Two";
                    break;
                case 3:
                    Number1+=" Three";
                    break;
                case 4:
                    Number1+=" Four";
                    break;
                case 5:
                    Number1+=" Five";
                    break;
                case 6:
                    Number1+=" Six";
                    break;
                case 7:
                    Number1+=" Seven";
                    break;
                case 8:
                    Number1+=" Eight";
                    break;
                case 9:
                    Number1+=" Nine";
                    break;
            }
            System.out.println(Number1);
        }
    }
}

