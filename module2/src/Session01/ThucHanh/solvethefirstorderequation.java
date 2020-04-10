package Session01.ThucHanh;

import java.util.Scanner;

public class solvethefirstorderequation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        double a;
        double b;
        double c;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("a: ");
            a = scanner.nextDouble();

            System.out.print("b: ");
            b = scanner.nextDouble();

            System.out.print("c: ");
            c = scanner.nextDouble();
        }
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        }
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
