import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            stack.push(arr[i] = sc.nextInt());
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
