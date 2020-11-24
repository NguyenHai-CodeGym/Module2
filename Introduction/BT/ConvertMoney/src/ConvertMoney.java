import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lượng tiền muốn chuyển đổi: ");
        usd = scanner.nextDouble();
        double convert = usd * 23000;
        System.out.print("Giá trị VNĐ:" + convert);
    }
}
