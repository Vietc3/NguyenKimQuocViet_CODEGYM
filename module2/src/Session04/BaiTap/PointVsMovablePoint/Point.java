package Session04.BaiTap.PointVsMovablePoint;

public class Point {
    private float x=0.0f;
    private float y=0.0f;
    private float xy;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXy() {
        float[]array=new float[2];
        array[0]=getX();
        array[1]=getY();
       return array ;
    }

    public void setXy(float x,float y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "Vị trí (X,Y) là: "+"("+getX()+","+getY()+")";
    }

}
