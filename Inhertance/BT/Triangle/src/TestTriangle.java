import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side 1: ");
        double a = sc.nextDouble();
        System.out.println("Side 2: ");
        double b = sc.nextDouble();
        System.out.println("Side 3: ");
        double c = sc.nextDouble();
        Triangle triangle = new Triangle("blue",a,b,c);
        System.out.println(triangle);
        System.out.println("Chu Vi Tam Giac: " + triangle.getPerimeter());
        System.out.println("Dien Tich Tam Giac: " + triangle.getAre());
    }
}
