import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên tố muốn hiển thị: ");
//        4
        int num = input.nextInt();

        int count = 0;
        int n = 2;

        while (count < num) {
            if (kiemtraSNT(n)){
                System.out.println("snt: "+n);
                count++;
            }
            n++;
        }
    }
    private static boolean kiemtraSNT(int n) {

        if (n < 2){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
