import java.util.Scanner;
import java.util.Stack;

public class ReverseStackString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String word  = sc.nextLine();
        for(int i=0;i<word.length();i++){
            stack.push(word.charAt(i));
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
