package point.Moveable;

public class MainTestPoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3, 4, 1, 2);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
