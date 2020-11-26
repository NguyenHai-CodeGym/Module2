public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"white");
        System.out.println(circle);
        System.out.println(circle.getArea());;

        Circle circle1 = new Circle(1.2,"blue");
        System.out.println(circle1.getPerimeter());
    }
}
