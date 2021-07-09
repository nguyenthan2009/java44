public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.2f,3.5f);
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint(5.5f,2.3f,3.6f,5.8f);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
