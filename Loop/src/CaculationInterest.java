import java.util.Scanner;

public class CaculationInterest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng");
        month = scanner.nextInt();
        System.out.println("Lãi Xuất");
        interest_rate = scanner.nextDouble();

        double total_interest = caculatorInterest(money, interest_rate, month);


        System.out.println("Total of interset: " + total_interest);

    }

    private static double caculatorInterest(double money, double interest_rate, int month) {
        double total = 0;
        for (int i=1;i<month;i++){
//            total_interest = money * interest_rate / 12 * month;
            total += money * (interest_rate/100)/12 * month;
        }

        return total;
    }
}
