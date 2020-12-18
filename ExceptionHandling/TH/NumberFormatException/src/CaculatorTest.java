import java.util.Scanner;

public class CaculatorTest {
    public static void main(String[] args) {
        ExceptionNumber exceptionNumber = new ExceptionNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số b: ");
        int b = sc.nextInt();
        exceptionNumber.caculator(a,b);
    }
}
