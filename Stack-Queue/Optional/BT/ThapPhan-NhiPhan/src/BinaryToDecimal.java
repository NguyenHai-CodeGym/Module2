import java.util.Scanner;
import java.util.Stack;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the String");
        int n = sc.nextInt();
        String numStr = Integer.toString(n);
        for (int i = 0; i < numStr.length(); i++) {
            stack.push(Integer.parseInt(String.valueOf(numStr.charAt(i))));
        }

        int Decimal = 0;
        int i = 0;
        while (!stack.isEmpty()){
            Decimal += stack.pop() * Math.pow(2,i);
            i++;
        }
        System.out.println(Decimal);
    }
}
