import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number want conver Binary: ");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (n != 0){
            stack.push(n % 2);
            n = n/2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
