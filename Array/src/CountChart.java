import java.util.Scanner;

public class CountChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Enter a chart: ");
        char a = sc.next().charAt(0);

        int sum = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == a) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
