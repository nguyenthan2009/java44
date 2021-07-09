public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    float [] Array;

    {
        Array = new float[2];
    }

    public Point(){
    }
    public Point(float x, float y){
        this.x =x;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x =x;
        this.y =y;
    }

    public float[] getXY() {
        Array[0]=x;
        Array[1]=y;
        return Array;
    }
    public String toString(){
        return "Point2D có \t" + "x\t" + x+"\t" + "y\t"+ y+ "\t" + "Array\t" +getXY();
    }
}
