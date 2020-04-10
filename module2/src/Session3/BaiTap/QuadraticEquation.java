package Session3.BaiTap;


import java.util.Scanner;

public class QuadraticEquation {
    private double soA, soB, soC;

    public QuadraticEquation(double a, double b, double c) {
        this.soA = a;
        this.soB = b;
        this.soC = c;
    }

    public double getSoA() {
        return this.soA;
    }

    public double getSoB() {
        return this.soB;
    }

    public double getSoC() {
        return this.soC;
    }

    public double getDiscriminant() {
        return this.soB * this.soB - 4 * this.soA * this.soC;
    }

    public double getRoot1() {
        return (-this.soB + Math.pow( getDiscriminant(),0.5)) / (2 * this.soA);
    }

    public double getRoot2() {
        return (this.soB + Math.pow( getDiscriminant(),0.5)) / (2 * this.soA);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the numer b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the numer c:");
        double c = scanner.nextDouble();
        QuadraticEquation ptBacHai = new QuadraticEquation(a, b, c);
        double delta = ptBacHai.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm là: " + ptBacHai.getRoot1() + " và " + ptBacHai.getRoot2());

        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm là: " + ptBacHai.getRoot1());
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
