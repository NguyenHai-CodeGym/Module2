import java.util.Scanner;
import java.util.Stack;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arrHex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Enter the Hex: ");
        String hexstring = sc.nextLine();
        String numchar = hexstring.toUpperCase();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < hexstring.length(); i++) {
            for (int j = 0; j < arrHex.length; j++) {
                if(numchar.charAt(i) == arrHex[j]){
                    stack.push(j);
                }
            }
        }
        int index = 0;
        int Hex = 0;
        while (!stack.isEmpty()){
            Hex += stack.pop() * Math.pow(16,index);
            index++;
        }
        System.out.println(Hex);
    }
}
