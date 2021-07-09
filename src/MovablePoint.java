public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    float[] Array;

    {
        Array = new float[2];
    }

    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed() {
        Array[0] = xSpeed;
        Array[1] = ySpeed;
        return Array;
    }
      public  String toString(){
        return "x\t" + "y\t" + super.getXY() + "\t" + this.getSpeed();
    }
    public String move(){
        float x= getX() +xSpeed;
        float y= getY() +ySpeed;
        return "x\t" +"\t" + x + "\t\t"+ "y\t" + y;

    }
}
