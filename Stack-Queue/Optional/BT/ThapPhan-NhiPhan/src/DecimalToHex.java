import java.util.Scanner;
import java.util.Stack;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arrHex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Enter the Decimal");
        int numDec = sc.nextInt();
        Stack<Character> stack = new Stack<>();

        String numStr;
        int numtemp;
        while (numDec > 0) {
            numtemp = numDec % 16;
            if (numtemp == arrHex[numtemp]) ;
            stack.push(arrHex[numtemp]);
            numDec /= 16;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());

        }
    }
}
