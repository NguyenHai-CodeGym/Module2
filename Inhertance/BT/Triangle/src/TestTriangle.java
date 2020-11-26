import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Color : ");
        String a = sc.nextLine();
        System.out.println("Side 1: ");
        double b = sc.nextDouble();
        System.out.println("Side 2: ");
        double c = sc.nextDouble();
        System.out.println("Side 3: ");
        double d = sc.nextDouble();
        Triangle triangle = new Triangle(a,b,c,d);
        System.out.println(triangle);
        System.out.println("Chu Vi Tam Giac: " + triangle.getPerimeter());
        System.out.println("Dien Tich Tam Giac: " + triangle.getAre());
    }
}
