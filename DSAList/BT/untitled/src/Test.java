import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> str = new Stack<Integer>();
        int n = sc.nextInt();
        while (n>0){
            str.push(n%2);
            n /= 2;
        }
        while (!str.isEmpty()){
            System.out.print(str.peek());
            str.pop();
        }
    }
}
