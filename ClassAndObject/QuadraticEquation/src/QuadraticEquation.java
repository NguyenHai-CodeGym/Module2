import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return (b*b) - (4*a*c);
    }

    public double getRoot1(){
        return (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0){
            System.out.println("The equation has no roots");
        } else if(delta == 0){
            System.out.println(quadraticEquation.getRoot1());
        }else {
            System.out.printf(quadraticEquation.getRoot1() + " " + quadraticEquation.getRoot2());
        }
    }
}
