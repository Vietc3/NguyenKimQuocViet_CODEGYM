package Session04.BaiTap.ClassCirCleAndClassCylinder;

import java.util.Scanner;

class Cylinder extends Circle {
    private double height;

    public Cylinder(String Color, double radius, double height) {
        super(Color, radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }
    public double getVolume() {
        return getHeight() * super.getArea();
    }
    @Override
    public String toString() {
        return "Im Cylinder, My Color is " + super.getColor() + " and My Radius is: " + super.getRadius() + " and My Volume: " + getVolume();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn");
        double radius = scanner.nextDouble();
        System.out.println("Nhập màu sắc hình tròn");
        Scanner scanner1 = new Scanner(System.in);
        String color = scanner1.nextLine();
        Circle circleBaby = new Circle(color, radius);
        System.out.println(circleBaby.toString());
        System.out.println("Nhập bán kính hình trụ:");
        double radiusCylinder = scanner.nextDouble();
        System.out.println("Nhập màu sắc hình trụ:");
        String colorCylinder = scanner1.nextLine();
        System.out.println("Nhập chiều cao hình trụ:");
        double heightCylinder = scanner.nextDouble();
        Cylinder cylinderbaby = new Cylinder(colorCylinder, radiusCylinder, heightCylinder);
        System.out.println(cylinderbaby.toString());

    }

}

