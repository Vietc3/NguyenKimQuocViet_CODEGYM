package Session04.BaiTap.ClassPoint2DandClassPoint3D;

import java.util.Scanner;

public class Point3D extends Point2D {
    private float Z, XYZ;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.Z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return this.Z;
    }

    public void setZ(float z) {
        this.Z = z;
    }

    public float[] getXYZ() {
        float[] arrayXYZ = new float[3];
        arrayXYZ[0] = super.getX();
        arrayXYZ[1] = super.getY();
        arrayXYZ[2] = getZ();
        return arrayXYZ;
    }
    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.Z = z;

    }
    @Override
    public String toString(){
        return "X"+super.getX()+"Y"+super.getY()+"Z"+this.Z;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập X:");
        float X=scanner.nextInt();
        System.out.println("Nhập Y:");
        float Y=scanner.nextInt();
        System.out.println("Nhập Z:");
        float Z=scanner.nextInt();
        Point2D point2Dbaby=new Point2D();
        point2Dbaby.setXY(X,Y);
        System.out.println(point2Dbaby.toString());

    }
}
