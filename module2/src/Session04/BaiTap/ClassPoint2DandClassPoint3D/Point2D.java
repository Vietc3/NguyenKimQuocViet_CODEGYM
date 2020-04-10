package Session04.BaiTap.ClassPoint2DandClassPoint3D;

public class Point2D {
    private float X,Y,XY;
    public Point2D(){};
    public Point2D(float x, float y){
        this.X=x;
        this.Y=y;
    }

    public float getX() {
        return this.X;
    }

    public void setX(float x) {
        this.X = x;
    }

    public float getY() {
        return this.Y;
    }

    public void setY(float y) {
        this.Y = y;
    }

    public float[] getXY() {
      float array2D[]=new float[2];
      array2D[0]=getX();
      array2D[1]=getY();
        return array2D;
    }

    public void setXY(float x,float y) {
        this.X = x;
        this.Y = y;
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+")";
    }
}
