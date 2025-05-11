public class TestMovable {
    public static void main(String[] args) {
        // Test MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Zacetna tocka: " + point);
        point.moveUp();
        System.out.println("po moveUp: " + point);
        point.moveRight();
        System.out.println("po moveRight: " + point);

        System.out.println();

        // Test MovableCircle
        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("Zaceten krog: " + circle);
        circle.moveDown();
        System.out.println("po moveDown: " + circle);
        circle.moveLeft();
        System.out.println("po moveLeft: " + circle);
    }
}
