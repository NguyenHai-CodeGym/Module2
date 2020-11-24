import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.println("The Solution is: %f!" + solution);
        }

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with: %f!\n" + answer);
        } else {
            if(b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No Solution");
            }
        }
    }
}
